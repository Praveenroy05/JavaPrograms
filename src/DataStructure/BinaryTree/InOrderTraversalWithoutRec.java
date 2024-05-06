package DataStructure.BinaryTree;

import java.util.Stack;

public class InOrderTraversalWithoutRec {

    public static void inOrderTraversal(TreeNodes root) {

        if (root == null) {
            return;
        }

        Stack<TreeNodes> s = new Stack<TreeNodes>();
        TreeNodes curr = root;

        while (curr != null || s.size() > 0) {


            while (curr != null) {

                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.print(curr.data + ", ");

            curr = curr.right;

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
