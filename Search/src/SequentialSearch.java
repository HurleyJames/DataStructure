/**
 * 顺序查找
 */
public class SequentialSearch {
    /**
     * a为数据序列数组，n为数组的长度，x为待查找的数据
     *
     * @param a
     * @param n
     * @param x
     * @return
     */
    public int sequentialSearch(int a[], int n, int x) {
        // f为该数据所在的位置
        int i, f = -1;

        for (i = 0; i < n; i++) {
            if (x == a[i]) {
                f = i;
                break;
            }
        }
        return f;
    }
}
