package BuilderPackage;

/**
 * Created by Martin on 12-09-2018.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
