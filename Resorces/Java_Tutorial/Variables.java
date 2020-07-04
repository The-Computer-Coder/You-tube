public class Variables {
    public static void main(String[] arg){
        boolean booleanVar  ;
        /*
         *   size : 1bit
         *   values : true or false
         *   default Vlaues : false
         * */


        byte byteVar;

        /*
         *   size : 1byte
         *   values :-128 to 127
         *   default Vlaues : 0
         * */

        short shortVar;

        /*
         *   size : 2bytes
         *   values : -32,768 to 32,767
         *   default Vlaues : 0
         * */

        int intVar;

        /*
         *   size : 4 bytes
         *   default Vlaues : 0
         * */

        long longVar;

        /*
         *   size : 8bytes
         *   default Vlaues : 0
         * */


        char charVar;

        /*
         *   size : 2bytes
         *   default Vlaues : '\u0000'
         * */

        float floatVar;

        /*
         *   size : 4 bytes
         *   default Vlaues : 0
         *  can have upto 7 decimal digits
         * */

        double doubleVar;

        /*
         *   size : 8 bytes
         *   default Vlaues : 0
         *  can have 16 decimal digits
         * */

        booleanVar = true;

        byteVar = 100;
        shortVar = 300;
        intVar = 1000;
        longVar = 3000000000888l;

        charVar = 'a';
        floatVar = 128882.22f;
        doubleVar = 88888882.2323;

        System.out.println(booleanVar);

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);

        System.out.println(charVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);


    }
}
