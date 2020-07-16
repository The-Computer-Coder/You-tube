<<<<<<< HEAD
public class TypeConversion {
    public static void main(String[] arg){
        /*
        *   Primitive Datatypes
        *   int , float , long , double,boolean,char,short,byte
        *
        *   Refference Datatype
        *   String , Integer, Boolean , Long , Float , Double
        *
        * */


        //************* Declarations  *************//

        String StringObj = new String("1111");
        int intVar = Integer.parseInt(StringObj);
        Integer IntObj = Integer.valueOf(StringObj) ;

        StringObj = "123456789012345";
        long longVar = Long.parseLong(StringObj);
        Long LongObj = Long.valueOf(StringObj);

        StringObj = "12345.678";
        float floatVar = Float.parseFloat(StringObj);
        Float FloatObj = Float.valueOf(StringObj);

        StringObj = "123456789.213456";
        double doubleVar = Double.parseDouble(StringObj);
        Double DoubleObj = Double.valueOf(StringObj);

        System.out.println(intVar);
        System.out.println(IntObj);

        System.out.println(longVar);
        System.out.println(LongObj);

        System.out.println(floatVar);
        System.out.println(FloatObj);

        System.out.println(doubleVar);

        //******************    String  *******************//

        System.out.println(Integer.toString(IntObj));

        System.out.println(Float.toString(FloatObj));

        System.out.println(Long.toString(LongObj));

        System.out.println(Double.toString(DoubleObj));







    }
}
=======
public class TypeConversion {
    public static void main(String[] arg){
        /*
        *   Primitive Datatypes
        *   int , float , long , double,boolean,char,short,byte
        *
        *   Refference Datatype
        *   String , Integer, Boolean , Long , Float , Double
        *
        * */


        //************* Declarations  *************//

        String StringObj = new String("1111");
        int intVar = Integer.parseInt(StringObj);
        Integer IntObj = Integer.valueOf(StringObj) ;

        StringObj = "123456789012345";
        long longVar = Long.parseLong(StringObj);
        Long LongObj = Long.valueOf(StringObj);

        StringObj = "12345.678";
        float floatVar = Float.parseFloat(StringObj);
        Float FloatObj = Float.valueOf(StringObj);

        StringObj = "123456789.213456";
        double doubleVar = Double.parseDouble(StringObj);
        Double DoubleObj = Double.valueOf(StringObj);

        System.out.println(intVar);
        System.out.println(IntObj);

        System.out.println(longVar);
        System.out.println(LongObj);

        System.out.println(floatVar);
        System.out.println(FloatObj);

        System.out.println(doubleVar);

        //******************    String  *******************//

        System.out.println(Integer.toString(IntObj));

        System.out.println(Float.toString(FloatObj));

        System.out.println(Long.toString(LongObj));

        System.out.println(Double.toString(DoubleObj));







    }
}
>>>>>>> 84c80203956179406e62fd5d7cd6ca4373d02e9d
