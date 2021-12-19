package creational.simple_factory;

public class PostFactory {

    public static Post createPost(String type){

        switch (type.toLowerCase()){
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            default:
                throw new IllegalArgumentException();
        }
    }
}
