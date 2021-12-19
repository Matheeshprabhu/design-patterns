package creational.simple_factory;

public class Main {

    public static void main(String[] args) {

        Post post = PostFactory.createPost("news");

        System.out.println(post);
    }
}
