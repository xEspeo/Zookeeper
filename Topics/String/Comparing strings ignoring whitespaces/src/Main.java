import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String firstNoWhitespace = removeWhitespaces(first);
        String secondNoWhitespace = removeWhitespaces(second);

        if(firstNoWhitespace.equals(secondNoWhitespace)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static String removeWhitespaces(String line) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isWhitespace(line.charAt(i))) {
                builder.append(line.charAt(i));
            }
        }
        return builder.toString();
    }
}