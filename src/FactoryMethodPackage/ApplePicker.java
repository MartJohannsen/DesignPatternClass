package FactoryMethodPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public class ApplePicker extends FruitPicker
{
    @Override
    protected Fruit makeFruit(){
        System.out.println("Returning an apple");
        return new Apple();
    }
}
