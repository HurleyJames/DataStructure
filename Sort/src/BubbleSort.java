/**
 * 冒泡排序
 * 从左到右依次变大
 */
public class BubbleSort {
    /**
     * N个数字要排序完成，总共进行N-1趟排序，每一趟排序要进行n-i次比较(1≤i≤n-1)
     * 时间复杂度：最好为 O(n^2)，最差为 O(n^2)，平均为 O(n^2)。空间复杂度：O(1)
     * @param arr
     */
    public static void bubbleSort(int arr[]) {
        // 外循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环控制每一趟排序多少次
            // 内循环比较的次数会依次减1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果左边的大于右边的，则交换位置
                if (arr[j] > arr[j + 1]) {
                    Utils.swap(arr, j, j + 1);
                }

                // 输出每次排序后的序列顺序
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println("");
            }
        }
    }
}
