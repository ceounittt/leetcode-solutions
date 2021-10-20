import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String rom = scanner.next();
        scanner.close();
        int num = romanToInt(rom);
        System.out.println(num);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> rom = new HashMap<>();
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char romChar = s.charAt(i);

            if (i > 0 && rom.get(romChar) > rom.get(s.charAt(i - 1))) {
                num += rom.get(romChar) - 2 * rom.get(s.charAt(i - 1));
            } else {
                num += rom.get(romChar);
            }
        }
        return num;
    }
}
