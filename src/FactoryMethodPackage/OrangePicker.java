package FactoryMethodPackage;

/**
 * Created by Martin on 18-09-2018.
 */
class OrangePicker extends FruitPicker {

    @Override
    protected Fruit makeFruit() {
        System.out.println("Returning an orange");
        return new Orange();
    }
}
