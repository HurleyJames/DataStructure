public class StackType {
    static final int MAXLEN = 50;
    /**
     * 数据元素
     */
    Data[] data = new Data[MAXLEN + 1];
    /**
     * 栈顶
     */
    int top;

    /**
     * 首先使用new关键字申请内存，申请成功后设置栈顶为0，然后返回申请内存的首地址；
     * 如果申请内存失败，将返回null
     *
     * @return
     */
    StackType init() {
        StackType stackType;
        // 申请栈内存，即new一个新的对象
        if ((stackType = new StackType()) != null) {
            // 设置栈顶为0
            stackType.top = 0;
            // 返回指向栈的引用，即返回创建的这个栈对象
            return stackType;
        }
        return null;
    }

    /**
     * 判断栈是否为空
     * 输入参数stackType作为一个指向操作的栈的引用
     *
     * @param stackType
     * @return
     */
    boolean isEmpty(StackType stackType) {
        boolean t;
        // 根据栈顶引用top是否为0，判断栈是否为空；
        t = (stackType.top == 0);
        return t;
    }

    /**
     * 判断一个栈结构是否为满
     *
     * @param stackType
     * @return
     */
    boolean isFull(StackType stackType) {
        boolean t;
        // 根据栈顶引用top是否等于MAXLEN，判断栈是否为空
        t = (stackType.top == MAXLEN);
        return t;
    }

    /**
     * 执行清空栈操作
     *
     * @param stackType
     */
    void clear(StackType stackType) {
        stackType.top = 0;
    }

    /**
     * 释放栈结构所占用的内存单元
     *
     * @param stackType
     */
    void free(StackType stackType) {
        if (stackType != null) {
            stackType = null;
        }
    }

    /**
     * 入栈操作
     *
     * @param s
     * @param data
     * @return
     */
    int push(StackType s, Data data) {
        if ((s.top + 1) > MAXLEN) {
            System.out.println("栈溢出！\n");
            return 0;
        }
        // 将元素入栈
        // 栈顶引用+1，指向入栈地址
        s.data[++s.top] = data;
        return 1;
    }

    /**
     * 出栈操作
     *
     * @param s
     * @return
     */
    Data pop(StackType s) {
        if (s.top == 0) {
            System.out.println("栈为空！\n");
            System.exit(0);
        }
        // 栈顶引用减1，指向栈的下一个元素，原来栈顶元素被弹出
        return s.data[s.top--];
    }

    /**
     * 读取结点数据
     *
     * @param stackType
     * @return
     */
    Data peek(StackType stackType) {
        if (stackType.top == 0) {
            System.out.println("栈为空！\n");
            System.exit(0);
        }
        return stackType.data[top];
    }
}









