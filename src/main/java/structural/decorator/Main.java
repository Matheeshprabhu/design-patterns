package structural.decorator;

public class Main {

    public static void main(String[] args) {

        Message message = new TextMessage("Hey, <This> is Matheesh!");
        System.out.println(message.getContent());

        Message decorator = new HtmlEncodedMessage(message);
        System.out.println(decorator.getContent());

        Message recursiveDecorator = new BaseEncodedMessage(decorator);
        System.out.println(recursiveDecorator.getContent());
    }
}
