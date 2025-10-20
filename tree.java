import java.util.*;

public class tree
{
    public class BinaryTree
{

    TreeNode root;
    public void insert(int val){
        TreeNode node = new TreeNode(val);
        if(root == null) 
        {
            this.root = node;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(temp.left == null) 
            {
                temp.left = node;
                return;
            }
            else queue.add(temp.left);


            if(temp.right == null) 
            {
                temp.right = node;
                return;
            }
            else queue.add(temp.right);
        }
    }

    public void lavelOrderTV(int val){

        TreeNode node = new TreeNode(val);
            if(root == null) 
            {
                this.root = node;
                return;
            }
        if(root == null) 
        {
            this.root = node;
            return;
        }
    
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
    
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
    
            if(temp.left != null) {
                queue.add(temp.left);
            }
    
    
            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    
    }

    public void preOrder(TreeNode node) {
        if(node == null) return;

        System.out.print(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

}

public class TreeNode
{
    int data;

    TreeNode left;
    TreeNode right;
    public TreeNode(int data) 
    {
        this.data = data;
    }
}

public void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.insert(10);
    bt.insert(20);
    bt.insert(30);
    bt.lavelOrderTV();


}




}
