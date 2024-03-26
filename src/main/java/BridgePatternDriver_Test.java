import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BridgePatternDriver_Test {

    @Test
    public void Send_Image_Test(){
        Image sample_image = new Image("old family photo");
        ImageMessage imageMessage = new ImageMessage(sample_image);
        TelegramMessagingApp Telegram = new TelegramMessagingApp(imageMessage);
        String expected = "Telegram Messaging App is sending Image";

        assertEquals(expected, Telegram.sendMessage());
    }

    @Test
    public void Send_Text_Test(){
        Text sample_text = new Text("Conversational text");
        TextMessage textMessage = new TextMessage(sample_text);
        FacebookMessagingApp Facebook = new FacebookMessagingApp(textMessage);
        String expected = "Facebook Messaging App is sending Text";

        assertEquals(expected, Facebook.sendMessage());
    }

    @Test
    public void Send_Video_Test(){
        Video sample_video = new Video("movie trailer video");
        VideoMessage videoMessage = new VideoMessage(sample_video);
        WhatsAppMessagingApp WhatsApp = new WhatsAppMessagingApp(videoMessage);
        String expected = "WhatsApp Messaging App is sending Video";

        assertEquals(expected, WhatsApp.sendMessage());
    }
}
