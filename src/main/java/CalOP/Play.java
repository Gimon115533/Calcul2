package CalOP;

import java.util.Scanner;

public class Play {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введие 1 значение затем 2 и действие:+,-,*,/");
        CalculatorOP calculatorOP=new CalculatorOP(scanner.nextDouble(),scanner.nextDouble(),scanner.next());
        System.out.println("Результат = "+calculatorOP.getRez());
    }
}