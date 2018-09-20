package PrototypePackage;

/**
 * Created by Martin on 12-09-2018.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "AdapterPackage.Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside AdapterPackage.Rectangle::draw() method.");
    }
}