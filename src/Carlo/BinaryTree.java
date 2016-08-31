package Carlo;

public class BinaryTree {

    public static void main(String[] args){
        
        int values[] = { 2, 4, 6, 7, 1, 8, 9, 14};
        
        TreeNode root = null;
        
        for ( int v : values){
            if (root == null){
                root = new TreeNode(v);
            }
            else
            {
                root.add(v);
            }
        }
        root.printInOrder();
        root.printPreOrder();
        root.printPostOrder();
        
        TreeNode five = root.find(5);
        root = five.update(15);
        
        root.printInOrder();
        root.printPreOrder();
        root.printPostOrder();
    }
    
}
