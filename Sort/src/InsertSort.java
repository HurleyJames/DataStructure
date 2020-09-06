/**
 * 插入排序
 * 时间复杂度：最好为 O(n^2)，最差为 O(n^2)，平均为 O(n^2)。空间复杂度：O(1)
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        // 因为要对该待排序列的每一个元素和前面已经排好序的序列进行插入，所以会对序列进行遍历
        // 数组的所有元素
        for (int i = 1; i < arr.length; i++) {
            // 对已经排好序的序列进行扫描，和要插入进来的数据进行逐一比较，然后决定插入到哪个位置
            // 已经排好的序列的元素
            for (int j = 0; j < i; j++) {
                // 如果已经排好的元素比被插入元素大，则交换位置
                if (arr[j] > arr[i]) {
                    Utils.swap(arr, j, i);
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
