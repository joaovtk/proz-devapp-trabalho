package WhileLoop;

public class WhileLoop {
    public static void home(){
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void dowhile(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

    public static void exempls(){
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }

}
