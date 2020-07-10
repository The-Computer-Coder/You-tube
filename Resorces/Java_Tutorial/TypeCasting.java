public class TypeCasting {
    public static void main(String[] arg){
    /*
    *   Narrowing Casting
    *   double ==> float ==> long ==> int ==> char ==>short ==> byte
    *
    * */

     double doubleVar = 12345_67890_123.123345D;
     float floatVar = (float) doubleVar;
     long longVar = (long) floatVar;
     int intVar = (int) doubleVar;
     char charVar = (char)121;
     short shortVar = (short)charVar;
     byte byteVar = (byte) shortVar;

     System.out.println(doubleVar);
     System.out.println(floatVar);
     System.out.println(intVar);
     System.out.println(charVar);
     System.out.println(shortVar);
     System.out.println(byteVar);



    }
}
