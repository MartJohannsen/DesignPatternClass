package PrototypePackage;

/**
 * Created by Martin on 12-09-2018.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}