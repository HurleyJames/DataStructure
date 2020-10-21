
/**
 * 快速排序
 * 采用分治法的算法思想
 */
public class QuickSort {

    public static int count = 0;

    public static void main(String[] args) {
        int[] array = new int[]{42,35,63,96,56,11,17,42,88};
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 快速排序第n趟结果
     * @param array int整型一维数组 待排序数组，数组大小大于0小于100
     * @param n int整型 趟数
     * @return int整型一维数组
     */
    public int[] nthResultOfQuickSort (int[] array, int n) {
        // write code here
        quickSort(array, 0, array.length - 1);
        // TODO
        return array;
    }

    /**
     * 将数组分为两半，分别对两半进行快速排序，直到low==high
     *
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 先对整体进行一次快速排序，将其分为两半
            int pos = findPos(arr, low, high);
            count++;
            // 对pos位置左边进行快速排序
            quickSort(arr, low, pos - 1);
            // 对pos位置右边进行快速排序
            quickSort(arr, pos + 1, high);
        }
    }

    public static int findPos(int arr[], int low, int high) {
        // 随机获取一个数，以这个数为基准分为两半
        int t = arr[low];
        // 将小于t的元素放到t的左边，大于t的元素放到t的右边
        while (low < high) {
            // 如果当前指针没有重合并且当前右边high指向的值大于t时，向左移动high
            while (low < high && arr[high] >= t) {
                high--;
                // 输出每次排序后的序列顺序
            }
            // 将比t小的arr[high]赋值给左边的arr[low]
            arr[low] = arr[high];

            // 如果当前指针没有重合并且当前左边low指向的值小于t时，向右移动low
            while (low < high && arr[low] <= t) {
                low++;
                // 输出每次排序后的序列顺序
            }
            // 将比t大的arr[low]赋值给右边的arr[high]
            arr[high] = arr[low];
        }
        // 返回此时t在数组中的位置
        arr[low] = t;

        // 输出每次排序后的序列顺序
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
        return high;
    }
}
