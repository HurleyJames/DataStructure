/**
 * 定义顺序表结构
 */
public class LinearListType {
    static final int MAXLEN = 100;
    /**
     * 保存顺序表的结构数组
     */
    Data[] listData = new Data[MAXLEN + 1];
    /**
     * 顺序表已存结点的数量
     */
    int listLen;

    /**
     * 初始化顺序表
     *
     * @param LL
     */
    void LLInit(LinearListType LL) {
        // 初始化为空表
        LL.listLen = 0;
    }

    int LLLength(LinearListType LL) {
        // 返回顺序表的元素数量
        return LL.listLen;
    }

    /**
     * 插入结点
     *
     * @param LL
     * @param n
     * @param data
     * @return
     */
    int LLInsert(LinearListType LL, int n, Data data) {
        int i;
        // 顺序表结点数量已超过最大数量
        if (LL.listLen >= MAXLEN) {
            System.out.println("顺序表已满，不能插入结点！\n");
            // 插入不成功
            return 0;
        }
        // 插入结点序号不正确
        if (n < 1 || n > LL.listLen - 1) {
            System.out.println("插入元素序号错误，不能插入元素！\n");
            return 0;
        }
        // 将顺序表中的数据向后移动
        for (i = LL.listLen; i >= n; i--) {
            LL.listData[i + 1] = LL.listData[i];
        }
        // 插入结点
        LL.listData[n] = data;
        // 顺序表结点数量增加1
        LL.listLen++;
        // 插入成功
        return 1;
    }

    /**
     * 增加元素到顺序表尾部
     *
     * @param LL
     * @param data
     * @return
     */
    int LLAdd(LinearListType LL, Data data) {
        // 顺序表已满
        if (LL.listLen >= MAXLEN) {
            System.out.println("顺序表已满，不能再添加结点了！\n");
            return 0;
        }
        LL.listData[++LL.listLen] = data;
        return 1;
    }

    /**
     * 删除顺序表中的数据元素
     *
     * @param LL
     * @param n
     * @return
     */
    int LLDelete(LinearListType LL, int n) {
        int i;
        // 删除结点序号不正确
        if (n < 1 || n > LL.listLen + 1) {
            System.out.println("删除结点序号错误，不能删除结点！\n");
            return 0;
        }
        // 将顺序表中的数据向前移动
        for (i = n; i < LL.listLen; i++) {
            LL.listData[i] = LL.listData[i + 1];
        }
        // 顺序表元素数量减1
        LL.listLen--;
        return 1;
    }

    /**
     * 根据序号返回数据元素
     *
     * @param LL
     * @param n
     * @return
     */
    Data LLFindByNum(LinearListType LL, int n) {
        // 元素序号不正确
        if (n < 1 || n > LL.listLen + 1) {
            System.out.println("结点序号错误，不能返回结点！\n");
            return null;
        }
        return LL.listData[n];
    }

    /**
     * 按关键字查询结点
     *
     * @param LL
     * @param key
     * @return
     */
    int LLFindByCont(LinearListType LL, String key) {
        int i;
        for (i = 1; i < LL.listLen; i++) {
            if (LL.listData[i].key.compareTo(key) == 0) {
                // 返回结点序号
                return i;
            }
        }
        return 0;
    }

    /**
     * 显示顺序表中的所有结点
     *
     * @param LL
     * @return
     */
    int LLAll(LinearListType LL) {
        int i;
        for (i = 1; i <= LL.listLen; i++) {
            System.out.printf("(%s,%s,%d)\n", LL.listData[i].key, LL.listData[i].name,
                    LL.listData[i].age);
        }
        return 0;
    }


}














