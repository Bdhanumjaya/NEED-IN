package com.needin.sms;


import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {

    private final String ACCOUNT_SID = "AC75ebf7c7910695096a281832d18be50b";
    private final String AUTH_TOKEN = "57273578d47e25f7bca28d47daf4de7e";
    private final String FROM_NUMBER = "+17163515828";

    public void send(SmsPojo sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("Message SID: " + message.getSid());
    }

    public void receive(MultiValueMap<String, String> smsCallback) {
        // Implement logic to handle incoming SMS callback
    }
}



//
//
//
//// SmsService.java
//package com.needin.sms;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.MultiValueMap;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//@Service
//public class SmsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private final String ACCOUNT_SID = "AC75ebf7c7910695096a281832d18be50b";
//    private final String AUTH_TOKEN = "57273578d47e25f7bca28d47daf4de7e";
//    private final String FROM_NUMBER = "+17163515828";
//
//    public void sendSmsToUser(Long userId, String message) {
//        User user = userRepository.findById(userId).orElse(null);
//        if (user != null) {
//            String smsMessage = "Hello " + user.getName() + ", " + message;
//            SmsPojo sms = new SmsPojo();
//            sms.setTo(user.getPhoneNumber());
//            sms.setMessage(smsMessage);
//            send(sms);
//        } else {
//            System.out.println("User not found with ID: " + userId);
//        }
//    }
//
//    void send(SmsPojo sms) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        Message twilioMessage = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
//                .create();
//        System.out.println("Message SID: " + twilioMessage.getSid());
//    }
//
//    public void receive(MultiValueMap<String, String> smsCallback) {
//      // Implement logic to handle incoming SMS callback
// }
//}
