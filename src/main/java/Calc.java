import java.util.*;
import java.io.*;
/**
 * �����������
 * @author ����� �������
 */
public class Calc {
    public static void main (String [] args) throws IOException {
        Scanner scanner = new Scanner (System.in);

        float d = 0;

        System.out.println ("������� 1-� �����:");
        float a = scanner.nextFloat ();
        System.out.println ("��������:");
        char b = scanner.next().charAt(0);
        System.out.println ("������� 2-� �����");
        float c = scanner.nextFloat ();
        //�������� ��������
        if (b == '+'){
            d = a + c;
        }
        //�������� ���������
        else if (b == '-') {
            d = a - c;
        }
        //�������� ���������
        else if (b == '*') {
            d = a * c;
        }
        //�������� �������
        else if (b == '/') {
            d = a / c;
        }
        //����� ����������
        System.out.printf("���������: " + "%.4f", d);
    }
}
