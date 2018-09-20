package AdapterLecturePackage;

/**
 * Created by Martin on 13-09-2018.
 */
public class Adapter extends GESocket
{
    public UKPlug adaptee = new UKPlug();

    @Override
    public void method(){
        adaptee.otherMethod();
    }
}
