package DataStructure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public static void levelOrderTraversal(TreeNodes root) {

        if (root == null) {
            return;
        } else {
            List<TreeNodes> queue = new ArrayList<TreeNodes>();

            queue.add(root);

            while (queue.size() > 0) {

                int count = queue.size();

                while (count > 0) {
                    TreeNodes firstNode = queue.get(0);
                    queue.remove(0);
                    System.out.print(firstNode.data + ", ");

                    if (firstNode.left != null) {
                        queue.add(firstNode.left);
                    }
                    if (firstNode.right != null) {
                        queue.add(firstNode.right);
                    }
                    count--;
                }

                System.out.println();

            }

        }
    }

    public static void main(String[] args) {
        TreeNodes node = new TreeNodes(1);

        node.left = new TreeNodes(2);
        node.right = new TreeNodes(3);
        node.left.left = new TreeNodes(4);
        node.left.right = new TreeNodes(5);
        levelOrderTraversal(node);
    }


}
