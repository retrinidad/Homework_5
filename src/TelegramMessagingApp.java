public class TelegramMessagingApp extends MessagingApp{

    TelegramMessagingApp(MessageType message){
        this.message = message;
    }
    public void sendMessage(){
        System.out.println("Telegram Messaging App is sending " + message.getMediaType());
    }
}
