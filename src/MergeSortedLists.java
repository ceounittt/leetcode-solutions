import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер первого массива");
        int n = scanner.nextInt();
        int nums1[] = new int[n];
        System.out.println("Введите размер второго массива");
        int m = scanner.nextInt();
        int nums2[] = new int[m];
        System.out.println("Заполните первый массив");
        for (int i = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        System.out.println("Заполните второй массив");
        for (int i = 0; i < m; i++) {
            nums2[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(sortAndMerge(nums1, nums2)));
    }

    public static int[] sortAndMerge(int[] nums1,int[] nums2) {
        int[] copyArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, copyArray, nums1.length, copyArray.length);
        System.arraycopy(nums2, nums1.length, copyArray, nums2.length, copyArray.length);
        for (int i = 0; i < copyArray.length; i++) {

        }
        return copyArray;
    }
}
