import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int nutsPerSquirrel = k / n;
        int leftoverNuts = k % n;

        System.out.println(leftoverNuts);
    }
}