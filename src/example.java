/**
 * Created by Martin on 06-09-2018.
 */
public class example
{
    private static example instance = new example();

    public static example getInstance()
    {
        return instance;
    }

    private example()
    {
    }
}
