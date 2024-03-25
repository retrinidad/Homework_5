public class WhatsAppMessagingApp extends MessagingApp{
    WhatsAppMessagingApp(MessageType message){
        this.message = message;
    }
    public void sendMessage(){
        System.out.println("WhatsApp Messaging App is sending " + message.getMediaType());
    }
}
