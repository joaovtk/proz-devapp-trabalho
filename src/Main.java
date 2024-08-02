import Control.Control;
import DataTypes.DataType;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        Control ctrl = new Control();

        // lembrar de tirar o static de todos os metodos :)
        int op = 0;
        while(op >= 0){
            op = ctrl.getOption();
            switch (op) {
                case 1:
                    DataType data = new DataType();
                    data.callback();
                    break;
                case 2:
                    // Breve descrição da segunda entrada
                    break;
                case 3:
                    // Breve descrição da terceira entrada
                    break;
                case 4:
                    // Breve descrição da quarta entrada
                    break;
                case 5:
                    // Breve descrição da quinta entrada
                    break;
                case 6:
                    // Breve descrição da sexta entrada
                    break;
                case 7:
                    // Breve descrição da sétima entrada
                    break;
                case 8:
                    // Breve descrição da oitava entrada
                    break;
                case 9:
                    // Breve descrição da nona entrada
                    break;
                case 10:
                    // Breve descrição da décima entrada
                    break;
                case 11:
                    // Breve descrição da décima primeira entrada
                    break;
                default:
                    System.out.println("Programa Finalizado");
                    break;
            }

        }
    }

}
