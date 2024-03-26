public class ImageMessage implements MessageType{
    MediaType image_content;
    ImageMessage(MediaType content){
        setContent(content);
    }
    public void setContent(MediaType content){
        image_content = content;
    }
    public String getMediaType(){
        return image_content.getType();
    }
    public MediaType getContent(){
        return image_content;
    }
}
