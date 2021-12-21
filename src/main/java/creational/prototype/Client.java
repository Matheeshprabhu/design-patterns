package creational.prototype;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Barbarian barbarian = new Barbarian();
        barbarian.move(new Point3D(10, 0, 0), 10);
        barbarian.fight();

        Barbarian barbarian1 = (Barbarian) barbarian.clone();
        System.out.println(barbarian);
        System.out.println(barbarian1);

        Queen queen = new Queen();

        queen.move(new Point3D(13, 5, 0), 25);
        queen.shoot();

        System.out.println(queen);

          //Queen is unique so she cannot be cloned. Throws exception if we try to do so
//        Queen queen1 = (Queen) queen.clone();
//        System.out.println(queen1);
    }
}
