package creational.prototype;

//Doesn't support cloning
public class Queen extends GameUnit{

    private String state = "idle";

    public void shoot() {
        this.state = "shooting";
    }

    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Queen is an unique unit and cannot be cloned");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("reset is not supported");
    }

    @Override
    public String toString() {
        return "Queen{" +
                "state='" + state + '\'' +
                '}' + "@" + getPosition();
    }



}
