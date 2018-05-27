import java.util.*;
import java.io.*;
/**
 * Калькулятор
 * @author  Ежова Наталья
 */
public class Calc {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner (System.in);

        float d = 0;

        System.out.println ("Введите 1-е число");
        float a = scanner.nextFloat ();
        System.out.println ("Оператор");
        char b = scanner.next().charAt(0);
        System.out.println ("Введите 2-е число");
        float c = scanner.nextFloat ();
        //операция сложения
        if (b == '+'){
            d = a + c;
        }
        //операция вычитания
        else if (b == '-') {
            d = a - c;
        }
        //операция умножения
        else if (b == '*') {
            d = a * c;
        }
        //операция деления
        else if (b == '/') {
            d = a / c;
        }
        //Вывод результата
        System.out.printf("Результат " + "%.4f", d);
    }
}
