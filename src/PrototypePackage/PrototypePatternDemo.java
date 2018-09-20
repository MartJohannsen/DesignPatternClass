package PrototypePackage;

/**
 * Created by Martin on 12-09-2018.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("AdapterPackage.Shape : " + clonedShape.getType());

        Shape clonedShapeTwo = ShapeCache.getShape("1");
        System.out.println("AdapterPackage.Shape : " + clonedShapeTwo.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("AdapterPackage.Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("AdapterPackage.Shape : " + clonedShape3.getType());
    }
}