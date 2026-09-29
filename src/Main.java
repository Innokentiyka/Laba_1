
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите выражение с операцией( деление /, умножение *, вычитание -, сложение +). числа должны быть меньше 10.
                Можно использовать арабские и римские числа.
                Введите выражение:
                """);
        String x = scanner.nextLine();
        String [] c = x.split("(?=[+\\-*/])|(?<=[+\\-*/])");

        if (c.length > 3){
            System.out.println("Неверный формат чисел");
            return;
        }

        String a = c[0];
        String operator = c [1];
        String b = c [2];


        NumberIdentifier treitor = new NumberIdentifier();
        ArabicCalcs calculArab = new ArabicCalcs();
        RomanCalcs calculRom = new RomanCalcs();


        if (treitor.isArabicNubmer(a) && treitor.isArabicNubmer(b)){
            if(Integer.parseInt(a) <= 10 && Integer.parseInt(b) <= 10){

               switch (operator){
                   case "+":
                       System.out.println("Результат сложения : " + calculArab.addition(a, b));
                       break;
                   case "-":
                       System.out.println("Результат вычитания: " + calculArab.subtraction(a, b));
                       break;
                   case "/":
                       System.out.println("Результат деления: " + calculArab.division(a, b));
                       break;
                   case "*":
                       System.out.println("Результат умножения: " + calculArab.multiplication(a, b));
                       break;
               }
           }else{
                System.out.println("Неверный формат чисел");
            }
        } else if (treitor.isRomanNubmer(a) && treitor.isRomanNubmer(b)) {

            switch (operator){
                case "+":
                    System.out.println("Результат сложения : " + calculRom.addition(a, b));
                    break;
                case "-":
                    System.out.println("Результат вычитания: " + calculRom.subtraction(a, b));
                    break;
                case "/":
                    System.out.println("Результат деления: " + calculRom.division(a, b));
                    break;
                case "*":
                    System.out.println("Результат умножения: " + calculRom.multiplication(a, b));
                    break;
            }


        }else {
            System.out.println("Неверный формат чисел");
        }


    }
}