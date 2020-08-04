/**
 * 插值查找
 */
public class InterpolationSearch {

    public int interpolationSearch(int a[], int value, int low, int high) {
        // 这里的mid并不是正好一半，而是可以自适应选择
        int mid = low + (value - a[low]) / (a[high] - a[low]) * (high - low);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return interpolationSearch(a, value, low, mid - 1);
        } else {
            return interpolationSearch(a, value, mid + 1, high);
        }
    }
}
