/**
 * 二分查找，也称折半查找，前提是顺序存储
 */
public class BinarySearch {

    private int[] array;

    /**
     * 递归实现二分查找
     *
     * @param target
     * @return
     */
    public int binarySearch1(int target) {
        if (array != null) {
            return binarySearch1(target, 0, array.length - 1);
        }
        return -1;
    }

    /**
     * 递归实现二分查找
     *
     * @param target
     * @param start
     * @param end
     * @return
     */
    public int binarySearch1(int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearch1(target, start, mid - 1);
        } else {
            return binarySearch1(target, mid + 1, end);
        }
    }

    /**
     * 非递归实现二分查找
     *
     * @param a
     * @param n
     * @param x
     * @return
     */
    public int binarySearch2(int a[], int n, int x) {
        int mid, low, high;
        low = 0;
        high = n - 1;

        // 循环，每次缩小一半的范围
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

