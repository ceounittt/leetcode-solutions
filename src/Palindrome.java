import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        boolean result = isPalindrome(num);
        System.out.println(result);
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        StringBuilder res = new StringBuilder(str).reverse();
        return str.equals(res.toString());
    }
}
