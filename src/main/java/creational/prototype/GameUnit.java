package creational.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable{

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(double x, double y, double z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    //shallow copy
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize(){
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

    public Point3D getPosition() {
        return position;
    }
}
