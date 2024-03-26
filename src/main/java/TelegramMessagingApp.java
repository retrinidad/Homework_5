public class TelegramMessagingApp extends MessagingApp{

    TelegramMessagingApp(MessageType message){
        this.message = message;
    }
    public String sendMessage(){
        String output = "Telegram Messaging App is sending " + message.getMediaType();
        System.out.println(output);
        return output;
    }
}
