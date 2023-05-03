import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if(firstNumber >= secondNumber && firstNumber <= thirdNumber || firstNumber <= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // put your code here
    }
}