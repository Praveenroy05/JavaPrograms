package DataStructure.BinaryTree;

public class PostOrderTraversal {

    public static void postOrderTraversal(TreeNodes root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + ", ");
        }
    }

    public static void main(String[] args) {
        TreeNodes node = new TreeNodes(1);

        node.left = new TreeNodes(2);
        node.right = new TreeNodes(3);
        node.left.left = new TreeNodes(4);
        node.left.right = new TreeNodes(5);
        postOrderTraversal(node);


    }
}
