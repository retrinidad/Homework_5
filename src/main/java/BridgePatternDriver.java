public class BridgePatternDriver {
    public static void main(String[] args){
        Image sample_image = new Image("funny meme image");
        ImageMessage imageMessage = new ImageMessage(sample_image);

        Text sample_text = new Text("On my way text");
        TextMessage textMessage = new TextMessage(sample_text);

        Video sample_video = new Video("Cooking recipe video");
        VideoMessage videoMessage = new VideoMessage(sample_video);

        TelegramMessagingApp Telegram = new TelegramMessagingApp(imageMessage);
        FacebookMessagingApp Facebook = new FacebookMessagingApp(videoMessage);
        WhatsAppMessagingApp WhatsApp = new WhatsAppMessagingApp(textMessage);

        Telegram.sendMessage();
        Facebook.sendMessage();
        WhatsApp.sendMessage();

        TelegramMessagingApp Telegram2 = new TelegramMessagingApp(textMessage);
        FacebookMessagingApp Facebook2 = new FacebookMessagingApp(imageMessage);
        WhatsAppMessagingApp WhatsApp2 = new WhatsAppMessagingApp(videoMessage);

        Telegram2.sendMessage();
        Facebook2.sendMessage();
        WhatsApp2.sendMessage();

        TelegramMessagingApp Telegram3 = new TelegramMessagingApp(videoMessage);
        FacebookMessagingApp Facebook3 = new FacebookMessagingApp(textMessage);
        WhatsAppMessagingApp WhatsApp3 = new WhatsAppMessagingApp(imageMessage);

        Telegram3.sendMessage();
        Facebook3.sendMessage();
        WhatsApp3.sendMessage();

    }
}
