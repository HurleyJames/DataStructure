public class QueueType {
    static final int MAXLEN = 15;
    /**
     * 队列数组
     */
    Data[] data = new Data[MAXLEN];
    /**
     * 队头
     */
    int head;
    /**
     * 队尾
     */
    int tail;

    /**
     * 初始化队列
     *
     * @return
     */
    QueueType init() {
        QueueType q;
        // 申请内存
        if ((q = new QueueType()) != null) {
            // 设置队头
            q.head = 0;
            // 设置队尾
            q.tail = 0;
            return q;
        } else {
            return null;
        }
    }

    /**
     * 判断队列是否为空
     *
     * @param q
     * @return
     */
    int isEmpty(QueueType q) {
        int temp = 0;
        // 如果队列头尾是同一个，则说明队列为空
        if (q.head == q.tail) {
            temp = 1;
        }
        return temp;
    }

    /**
     * 判断队列结构是否为满队列
     *
     * @param q
     * @return
     */
    int isFull(QueueType q) {
        int temp = 0;
        if (q.tail == MAXLEN) {
            temp = 1;
        }
        return temp;
    }

    /**
     * 清空队列
     *
     * @param q
     */
    void clear(QueueType q) {
        q.head = 0;
        q.tail = 0;
    }

    /**
     * 释放空间
     *
     * @param q
     */
    void free(QueueType q) {
        if (q != null) {
            q = null;
        }
    }

    /**
     * 入队列
     *
     * @param q
     * @param data
     * @return
     */
    int inQueue(QueueType q, Data data) {
        if (q.tail == MAXLEN) {
            System.out.println("队列已满！操作失败！\n");
            return 0;
        } else {
            // 从尾部添加
            q.data[q.tail++] = data;
            return 1;
        }
    }

    /**
     * 出队列
     *
     * @param q
     * @return
     */
    Data outQueue(QueueType q) {
        if (q.head == q.tail) {
            System.out.println("队列已空！操作失败！\n");
            System.exit(0);
        } else {
            // 从头部出
            return q.data[q.head++];
        }
        return null;
    }

    /**
     * 读取结点数据
     *
     * @param q
     * @return
     */
    Data peek(QueueType q) {
        if (isEmpty(q) == 1) {
            System.out.println("\n空队列！\n");
            return null;
        } else {
            // 头节点
            return q.data[q.head];
        }
    }

    /**
     * 计算队列长度
     *
     * @param q
     * @return
     */
    int queueLen(QueueType q) {
        int temp;
        // 队尾减去对头即为队列的长度
        temp = q.tail - q.head;
        return temp;
    }
}








