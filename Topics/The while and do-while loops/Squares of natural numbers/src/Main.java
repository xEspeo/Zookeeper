import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        while(i*i <= n) {
            System.out.println(i*i);
            ++i;
        }
        // start coding here
    }
}