import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        System.out.println(Calc(sc.nextLine()));
    }

    public static String Calc(String Input) throws IOException {
        String[] Array = Input.split(" ");
        int a = Integer.parseInt(Array[0]);
        int b = Integer.parseInt(Array[2]);
        int result;

        switch (Array[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Некорректное выражение");
                throw new IOException();
        }
        if (a <= 0||b <=0) {
            System.out.println(" Число не может быть меньше нуля ");
            throw new IOException();
        } else if (a >= 11||b>=11) {
            System.out.println(" Число не может быть больше 10 ");
            throw new IOException();
        }
        if (Array.length>3){
            System.out.println("Некорректное выражение");
            throw new IOException();
        }
        return String.valueOf(result);
    }
}