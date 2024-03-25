public class VideoMessage implements MessageType{

    MediaType video_content;
    VideoMessage(MediaType content){
        setContent(content);
    }
    public void setContent(MediaType content){
        video_content = content;
    }
    public String getMediaType(){
        return video_content.getType();
    }
    public MediaType getContent(){
        return video_content;
    }
}
