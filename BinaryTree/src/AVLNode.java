public class AVLNode<T> {

    public T data;
    public AVLNode<T> left;
    public AVLNode<T> right;
    public int height;

    public AVLNode(T data) {
        this(data, 0, null, null);
    }

    public AVLNode(T data, int height, AVLNode<T> left, AVLNode<T> right) {
        this.data = data;
        this.height = height;
        this.left = left;
        this.right = right;
    }
}
