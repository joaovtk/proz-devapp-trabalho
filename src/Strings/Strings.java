package Strings;

public class Strings {
    public static void home(){
        String greeting = "Hello";

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7
    }

    public static void conc(){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName.concat(lastName));
    }

    public static void numandstr(){
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(x + " " + y + " " + z);

        String x2 = "10";
        String y2 = "20";
        String z2 = x2 + y2;  // z will be 1020 (a String)
        System.out.println(z2);


        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;  // z will be 1020 (a String)
        System.out.println(z3);
    }

    public static void specialchar(){

        // String txt = "We are the so-called "Vikings" from the north.";
        System.out.println("Essa setença gera um erro\nConsulte os comentarios para ve-la");
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println("Jeito correto:\n" + txt);
        txt = "It\'s alright.";
        System.out.println(txt);
        txt = "The character \\ is called backslash.";
        System.out.println(txt);
    }
}
