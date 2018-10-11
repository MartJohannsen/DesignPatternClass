package AbstractFactoryPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else{
            return null;
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
