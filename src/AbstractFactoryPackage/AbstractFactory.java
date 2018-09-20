package AbstractFactoryPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
