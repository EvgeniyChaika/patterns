package patterns.J2EE.compositeentity;

/**
 * Created on 01.09.16.
 */
public class CoarseGrainedObject {

    DependedObject1 do1 = new DependedObject1();
    DependedObject2 do2 = new DependedObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[]{do1.getData(), do2.getData()};
    }
}
