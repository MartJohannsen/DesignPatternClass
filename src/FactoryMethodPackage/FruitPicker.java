package FactoryMethodPackage;

/**
 * Created by Martin on 18-09-2018.
 */
abstract class FruitPicker {

    protected abstract Fruit makeFruit();

    public void pickFruit() {
        final Fruit f = makeFruit(); // The fruit we will work on..
    }
}