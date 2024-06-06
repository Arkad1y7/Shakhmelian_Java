import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a > b ? "a > b" : a < b ? "a < b" : "a = b");
        System.out.println("What you would do? + - * / ");
        String operation = scanner.next();

        switch (operation){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) { throw new IllegalArgumentException("Division by zero"); }
                System.out.println(a / b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}

