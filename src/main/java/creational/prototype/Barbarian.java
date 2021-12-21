package creational.prototype;

public class Barbarian extends GameUnit{

    private String state = "idle";

    public void fight() {
        this.state = "fighting";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "Barbarian{" +
                "state='" + state + '\'' +
                '}' + "@" + getPosition();
    }
}
