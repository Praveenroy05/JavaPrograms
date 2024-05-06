package DataStructure.BinaryTree;

public class MirrorOfBinaryTree {

    public static void mirrorOfBinaryTree(TreeNodes root) {

        if (root == null) {
            return ;
        } else {

            mirrorOfBinaryTree(root.left);
            mirrorOfBinaryTree(root.right);

            TreeNodes temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;


        }
    }

    public static void inOrderTraversal(TreeNodes root) {

        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.left);
            System.out.print(root.data);
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
        System.out.println("");
        mirrorOfBinaryTree(node);
        inOrderTraversal(node);


    }
}
