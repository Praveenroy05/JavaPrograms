package DataStructure.BinaryTree;

public class PreorderTraversal {


    /**
     * In inorderTraversal the logic is
     * go to root node--> left node-->Right node
     */
    public static void preOrderTraversal(TreeNodes root) {


        if (root == null) {
            return;
        } else {
            System.out.print(root.data + ", ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }


    }


    public static void main(String[] args) {
        TreeNodes node = new TreeNodes(1);

        node.left = new TreeNodes(2);
        node.right = new TreeNodes(3);
        node.left.left = new TreeNodes(4);
        node.left.right = new TreeNodes(5);
        preOrderTraversal(node);


    }


}
