import java.util.Currency;

/**
 * 二分查找树
 */
public class BinarySearchTree {

    public TreeNode root;

    /**
     * 查找节点
     *
     * @param key
     * @return
     */
    public TreeNode searchBST(int key) {
        if (root == null) {
            System.out.println("The tree is empty");
            return null;
        }
        TreeNode current = root;
        while (current.val != key) {
            if (key > current.val) {
                // 递归遍历右子树
                current = current.right;
            } else {
                // 递归遍历左子树
                current = current.left;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * 在合理的位置插入节点
     *
     * @param treeNode
     * @return
     */
    public boolean insertBST(TreeNode treeNode) {
        if (root == null) {
            root = treeNode;
            return true;
        }

        // 二叉查找树中不准插入重复项
        if (this.searchBST(treeNode.val) != null) {
            System.out.println("Node with value '" + treeNode.val + "' has already existed!");
            return false;
        }
        TreeNode current = root;
        while (current != null) {
            if (treeNode.val > current.val) {
                if (current.right == null) {
                    current.right = treeNode;
                    return true;
                }
                current = current.right;
            } else {
                if (current.left == null) {
                    current.left = treeNode;
                    return true;
                }
                current = current.left;
            }
        }
        return false;
    }

    /**
     * 前序遍历
     *
     * @param treeNode
     */
    public void preOrderIterator(TreeNode treeNode) {
        System.out.println(treeNode.val + " ");
        if (treeNode.left != null) {
            this.preOrderIterator(treeNode.left);
        }
        if (treeNode.right != null) {
            this.preOrderIterator(treeNode.right);
        }
    }

    /**
     * 中序遍历
     * 中序遍历后得到的是包含所有数据项的有序数列
     *
     * @param treeNode
     */
    public void inOrderIterator(TreeNode treeNode) {
        if (treeNode.left != null) {
            this.inOrderIterator(treeNode.left);
        }
        System.out.println(treeNode.val + " ");
        if (treeNode.right != null) {
            this.inOrderIterator(treeNode.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param treeNode
     */
    public void postOrderIterator(TreeNode treeNode) {
        if (treeNode.left != null) {
            this.postOrderIterator(treeNode.left);
        }
        if (treeNode.right != null) {
            this.postOrderIterator(treeNode.right);
        }
        System.out.println(treeNode.val + " ");
    }

    /**
     * 获取二叉搜索树（子树）中的最小节点，即最左下角部分就是最小的节点
     *
     * @param treeNode
     * @return
     */
    public TreeNode getMinNode(TreeNode treeNode) {
        if (this.searchBST(treeNode.val) == null) {
            System.out.println("Node dose not exist!");
            return null;
        }
        if (treeNode.left == null) {
            // 如果左节点已经为空，则根就是最小的
            return treeNode;
        }
        TreeNode current = treeNode.left;
        while (current.left != null) {
            // 一直返回左节点
            current = current.left;
        }
        return current;
    }

    /**
     * 获取树（子树）中的最大节点，即最右下角部分就是最大的节点
     *
     * @param treeNode
     * @return
     */
    public TreeNode getMaxNode(TreeNode treeNode) {
        if (this.searchBST(treeNode.val) == null) {
            System.out.println("Node dosen't exist!");
            return null;
        }
        // 如果右节点已经为空，则根就是最大的
        if (treeNode.right == null) {
            return treeNode;
        }

        TreeNode current = treeNode.right;
        // 一直返回右节点
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
}
