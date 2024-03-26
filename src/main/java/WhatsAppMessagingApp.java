public class WhatsAppMessagingApp extends MessagingApp{
    WhatsAppMessagingApp(MessageType message){
        this.message = message;
    }
    public String sendMessage(){
        String output = "WhatsApp Messaging App is sending " + message.getMediaType();
        System.out.println(output);
        return output;
    }
}
