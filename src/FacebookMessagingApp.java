public class FacebookMessagingApp extends MessagingApp{
    FacebookMessagingApp(MessageType message){
        this.message = message;
    }

    public void sendMessage(){
        System.out.println("Facebook Messaging App is sending " + message.getMediaType());
    }
}
