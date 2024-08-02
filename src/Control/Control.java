package Control;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Control {
    static int op = 0;
    public void timer(){
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (Exception err){
            System.out.println();
        }
    }

    public int getOption(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma opção: ");
        return op = scan.nextInt();
    }
}
