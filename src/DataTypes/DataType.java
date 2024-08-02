package DataTypes;

public class DataType {


    public static void home(){
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String text = "Hello World";
        System.out.println("Data Types");
        System.out.println(String.format("Tipo de dado Int:\n%d", myNum));
        System.out.println(String.format("Tipo de dado Float:\n%.2f", myFloatNum));
        System.out.println(String.format("Tipo de dado Character:\n%s", myLetter));
        System.out.println(String.format("Tipo de dado Boolean:\n%s", myBool));
        System.out.println(String.format("Tipo de dado String:\n%s", text));
    }
    public static void numbers(){

        /* Integer Types */

        /* Byte type limit is -128 and 127 */
        byte myNum = 100;
        System.out.println(myNum);

        /* Short type limit is -32768 to 32767 */
        short myNum2 = 5000;
        System.out.println(myNum2);

        /* Int Type limit is  -2147483648 to 2147483647*/
        int myNum3 = 100000;
        System.out.println(myNum3);
        /* Long type limit is -9223372036854775808 to 9223372036854775807*/
        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        /* Floating Types */

        /* Float type limit is 9.99 or 3.14515 */
        float myFlNum = 5.75f;
        System.out.println(myFlNum);

        /* double type */
        double myFlNum2 = 19.99d;
        System.out.println(myFlNum2);


        /* Scientific Numbers */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
    public static void Booleans(){
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }

    public static void Characters(){
        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);
    }

    public static void real(){
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
