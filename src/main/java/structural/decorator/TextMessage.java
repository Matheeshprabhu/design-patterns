package structural.decorator;

public class TextMessage implements Message{

    String message;

    public TextMessage(String message){
        this.message = message;
    }
    @Override
    public String getContent() {
        return message;
    }
}
