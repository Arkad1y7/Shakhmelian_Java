import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tempOne = scanner.nextLine();
        String tempTwo = scanner.nextLine();
        System.out.println(tempOne.equals(tempTwo) ? "Строки идентичны" : "Строки  неидентичны" );
    }
}