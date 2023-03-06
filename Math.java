import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数数组长度：");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("请依次输入数组中的" + n + "个整数：");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("所有子数组的和的最大值为：" + maxSum);
    }
}