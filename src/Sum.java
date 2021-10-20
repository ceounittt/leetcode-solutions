import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Введите массив: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Введите цель: ");
        int target = scanner.nextInt();

        scanner.close();

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("Ты шо ебобо?");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
