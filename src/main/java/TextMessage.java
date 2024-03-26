public class TextMessage implements MessageType{
    MediaType text_content;
    TextMessage(MediaType content){
        setContent(content);
    }
    public void setContent(MediaType content){
        text_content = content;
    }
    public String getMediaType(){
        return text_content.getType();
    }
    public MediaType getContent(){
        return text_content;
    }
}
