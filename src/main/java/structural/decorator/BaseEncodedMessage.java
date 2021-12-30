package structural.decorator;

import java.util.Base64;

public class BaseEncodedMessage implements Message{

    private final Message message;

    public BaseEncodedMessage(Message message){
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
