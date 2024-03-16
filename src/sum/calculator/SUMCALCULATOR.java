
package sum.calculator;
import java.util.Scanner;
public class SUMCALCULATOR {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("insert first number");
        int num1=scanner.nextInt();
        System.out.print("instert second number");
        int num2=scanner.nextInt();
        System.out.print(num1-num2);
    }
    
}