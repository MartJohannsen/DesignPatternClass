package FactoryPackage;

/**
 * Created by Martin on 09-10-2018.
 */
public class ShapeFactory
{
    public Shape getShape(String shapeType){
        switch (shapeType){
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: return null;
        }
    }
}