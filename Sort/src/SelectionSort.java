/**
 * 选择排序
 * 时间复杂度：最好为 O(n^2)，最差为 O(n^2)，平均为 O(n^2)。空间复杂度：O(1)
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int min;
        // 每次循环数组，找出最小的元素，放在数组前面
        for (int i = 0; i < arr.length - 1; i++) {
            // 假设最小元素的下标
            min = i;
            // 将假设的最小元素与数组比较，交换出最小的元素下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                Utils.swap(arr, i, min);
            }

            // 输出每次排序后的序列顺序
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

}
