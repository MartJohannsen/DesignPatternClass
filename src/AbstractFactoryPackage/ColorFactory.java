package AbstractFactoryPackage;

/**
 * Created by Martin on 19-09-2018.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color)
    {
        if(color == null)
        {
            return null;
        }
        if(color == "RED")
        {
            return new Red();
        }
        else {
            return null;
        }
    }

    @Override
    Shape getShape(String shape)
    {
        return null;
    }
}
