package com.needin.sms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    SmsService service;

    @Autowired
    private SimpMessagingTemplate webSocket;

    private final String TOPIC_DESTINATION = "/lesson/sms";

    @RequestMapping(value = "/sms", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> smsSubmit(@RequestBody SmsPojo sms) {
        try {
            service.send(sms);
            webSocket.convertAndSend(TOPIC_DESTINATION, getTimeStamp() + ": SMS has been sent!: " + sms.getTo());
            return ResponseEntity.ok().body("SMS has been sent!");
        } catch (Exception e) {
            String errorMessage = getTimeStamp() + ": Error sending the SMS: " + e.getMessage();
            webSocket.convertAndSend(TOPIC_DESTINATION, errorMessage);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
            
        }
    }

    @RequestMapping(value = "/smscallback", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> smsCallback(@RequestBody MultiValueMap<String, String> map) {
        try {
            service.receive(map);
            webSocket.convertAndSend(TOPIC_DESTINATION, getTimeStamp() + ": Twilio has made a callback request! Here are the contents: " + map.toString());
            return ResponseEntity.ok().body("Callback received successfully!");
        } catch (Exception e) {
            String errorMessage = getTimeStamp() + ": Error processing SMS callback: " + e.getMessage();
            webSocket.convertAndSend(TOPIC_DESTINATION, errorMessage);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        }
    }

    private String getTimeStamp() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    }
}



























