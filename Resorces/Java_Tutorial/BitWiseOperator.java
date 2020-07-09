public class BitWiseOperator {
    public static void main(String[] arg){

        int firstNumber = 24 ;
        int secondNumber = 32;
        int result ;

        /*
        * 24  ==>  0001 1000
        * 32 ==>&  0010 0000
        * ___________________
        *          0000  0000 == 0 in binary
         * ___________________
        * */

        result = firstNumber & secondNumber ;
        System.out.println(result);

        /*
        * 24  ==>  0001 1000
        * 32 ==>|  0010 0000
        * ____________________
        *           0011 1000 = 56 in binary
        * ____________________
        *
        * */

        result = firstNumber | secondNumber ;
        System.out.println(result);

        /*
         * 24  ==>  0001 1000
         * 32 ==>^  0010 0000
         * ______________________
         *           0011 1000 == 56 in binary
         * _______________________
         *
         * */

        result = firstNumber ^ secondNumber ;
        System.out.println(result);

        /*
        * 24 ==> 0001 1000
        * ________________
        * ~24 == 1110 0111 == -25 in binary
         * */

        result = ~firstNumber;
        System.out.println(result);

        /*
        * 24 << 1   ===  0001 1000 << 1
        * _____________________________________________
        *           ==== 0011 0000  = 48 in binary
         * ______________________________________________
        * */
        result = firstNumber << 1 ;
        System.out.println(result);

        /*
        * 24 >> 1    ===   0001 1000 >> 1
        * _____________________________________________
        *                    0000 1100 == 14 in binary
        * _____________________________________________
        * */


        
        result = firstNumber >> 1;
        System.out.println(result);
    }
}
