import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // start coding here
    }

}