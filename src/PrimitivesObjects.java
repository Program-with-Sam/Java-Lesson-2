public class PrimitivesObjects {

    byte exampleByte = 60;
    Byte byteObject = 60;

    char exampleChar = 'a';
    Character charObject = 'a';

    short exampleShort = 32000;
    Short shortObject = 32000;

    int exampleInt = 10;
    Integer intObject = 10;

    long exampleLong = 65L;
    Long longObject = 65L;

    float exampleFloat = 26.5f;
    Float floatObject = 26.5f;

    double exampleDouble = 65.5;
    Double doubleObject = 65.6;

    boolean exampleBoolean = true;
    Boolean booleanObject = true;


    public static void main(String args[]) {
        PrimitivesObjects p = new PrimitivesObjects();
        System.out.println(p.byteObject.toString());
    }
}
