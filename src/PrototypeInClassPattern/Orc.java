package PrototypeInClassPattern;

/**
 * Created by Martin on 20-09-2018.
 */
public abstract class Orc implements Cloneable
{
    private int health;
    private int damage;

    @Override
    protected Object clone() throws CloneNotSupportedException // Type Orc instead of Object, if you don't want to cast it
    {
        Object clone = null;

        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }
}
