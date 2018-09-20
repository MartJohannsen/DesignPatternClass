package FactoryMethodPackage;

/**
 * Created by Martin on 18-09-2018.
 */
public class Demo
{
    public static void main(String[] args)
    {
        OrangePicker OP = new OrangePicker();
        OP.makeFruit();
        ApplePicker AP = new ApplePicker();
        AP.makeFruit();
    }
}
