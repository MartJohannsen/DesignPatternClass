package PrototypeInClassPattern;

/**
 * Created by Martin on 20-09-2018.
 */
public class PrototypeRunner
{
    public static void main(String[] args)
    {

        Uruk hai = new Uruk();
        Uruk carbonCopy = null;
        try{
            carbonCopy = (Uruk) hai.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        System.out.println("Do the orcs have the same identity? --> " + hai.equals(carbonCopy));
    }
}
