package AbstractFactoryPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public class FactoryProducer
{
    public static AbstractFactory getFactory(String choice){
        if(choice == "COLOR"){
            return new ColorFactory();
        }
        else if(choice == "SHAPE"){
            return new ShapeFactory();
        }
        else return null;

    }
}
