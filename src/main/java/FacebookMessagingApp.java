public class FacebookMessagingApp extends MessagingApp{
    FacebookMessagingApp(MessageType message){
        this.message = message;
    }

    public String sendMessage(){
        String output = "Facebook Messaging App is sending " + message.getMediaType();
        System.out.println(output);
        return output;
    }
}
