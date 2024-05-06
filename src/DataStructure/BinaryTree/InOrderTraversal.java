package DataStructure.BinaryTree;

public class InOrderTraversal {


    /**
     * In inorderTraversal the logic is
     * go to Left node--> root node-->Right node
     */
    public static void inOrderTraversal(TreeNodes root) {

        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.left);
            System.out.print(root.data + ", ");
            inOrderTraversal(root.right);
        }

    }

    public static void main(String[] args) {
        TreeNodes node = new TreeNodes(1);

        node.left = new TreeNodes(2);
        node.right = new TreeNodes(3);
        node.left.left = new TreeNodes(4);
        node.left.right = new TreeNodes(5);
        inOrderTraversal(node);


    }
}
