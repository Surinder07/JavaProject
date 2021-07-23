import javax.xml.transform.stream.StreamSource;

public class FirstProgram {
    public static void main(String[] args) {

        String name ="Surinder";
        int num = 4;
        float f = 12.11542451f;
        double d = 123.23d;
        boolean b = true;
        byte b1 =1;
        Long l = 12l;

        System.out.println("Hello World ");


        System.out.println("Hello this is String :  " +name );
        System.out.println("Hello this is Number  : " +num );
        System.out.println("Hello this is FLoat  : " +f );
        System.out.println("Hello this is Double :" +d );
        System.out.println("Hello this is Boolean :" +b );
        System.out.println("Hello this is byte  : " +b1 );
        System.out.println("Hello this is Long :" +l );


        // to print 2 digits after decimal

        System.out.println(String.format("%4"));



    }

}
