package AbstractFactoryPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public class Demo
{
    public static void main(String[] args)
    {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Color color1 = colorFactory.getColor("RED");
        color1.draw();
    }
}
