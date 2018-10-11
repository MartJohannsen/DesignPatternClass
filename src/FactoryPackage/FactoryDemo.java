package FactoryPackage;

/**
 * Created by Martin on 09-10-2018.
 */
public class FactoryDemo
{
    // Let's run the demo underneath!
    public static void main(String[] args)
    {
        ShapeFactory SF = new ShapeFactory();

        Shape shapeOne = SF.getShape("SQUARE");
        Shape shapeTwo = SF.getShape("RECTANGLE");
        Shape shapeThree = SF.getShape("CIRCLE");

        shapeOne.draw();
        shapeTwo.draw();
        shapeThree.draw();
    }
}
