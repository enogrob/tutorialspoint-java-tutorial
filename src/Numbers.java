/**
 * Created by enogrob on 08/12/16.
 */
public class Numbers {

    public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);

        // Returns byte primitive data type
        System.out.println( x.byteValue() );

        // Returns double primitive data type
        System.out.println(x.doubleValue());

        // Returns long primitive data type
        System.out.println( x.longValue() );

        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(20));
        System.out.println(x.compareTo(15));

        System.out.println(x.equals(3));
        System.out.println(x.equals(20));
        System.out.println(x.equals(15));

        Integer y =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444",16);

        System.out.println(y);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        System.out.println(x.toString());
        System.out.println(Integer.toString(12));

        int z =Integer.parseInt("9");
        double d = Double.parseDouble("5");
        int f = Integer.parseInt("444",16);

        System.out.println(z);
        System.out.println(d);
        System.out.println(f);

        Integer aa = -8;
        double dd = -100;
        float ff = -90;

        System.out.println(Math.abs(aa));
        System.out.println(Math.abs(dd));
        System.out.println(Math.abs(ff));

        double dc = -100.675;
        float fc = -90;

        System.out.println(Math.ceil(dc));
        System.out.println(Math.ceil(fc));

        System.out.println(Math.floor(dc));
        System.out.println(Math.floor(fc));

        double dr = 100.675;
        double er = 100.500;
        double fr = 100.200;

        System.out.println(Math.rint(dr));
        System.out.println(Math.rint(er));
        System.out.println(Math.rint(fr));

        double dro = 100.675;
        double ero = 100.500;
        float fro = 100;
        float gro = 90f;

        System.out.println(Math.round(dro));
        System.out.println(Math.round(ero));
        System.out.println(Math.round(fro));
        System.out.println(Math.round(gro));

        System.out.println( Math.random() );
        System.out.println( Math.random() );
    }
}
