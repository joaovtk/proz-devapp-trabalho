package Operators;

public class Operators {
    public static void home(){
        int x = 100 + 50;
        System.out.println(x);
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum1+""+ sum2+" "+sum3);

        int x1 = 10;
        System.out.println(x);

        int x2 = 10;
        x += 5;

        System.out.println(x2);

        int x3 = 5;
        int y = 3;
        System.out.println(x3 > y);
    }
}
