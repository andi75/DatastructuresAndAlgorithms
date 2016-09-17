package Carlo;

public class BinaryTree {

    public static void main(String[] args){
        
        int values[] = { 7, 4, 2, 6, 5, 10, 8, 15, 17, 11, 13};
        
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
        /*System.out.println("Printing InOrder:");
        root.printInOrder();
        System.out.println("Printing PreOrder:");
        root.printPreOrder();
        System.out.println("Printing PostOrder:");
        root.printPostOrder(); */
        TreeNode seven = root.find(7);
        //seven.update(9);
        root = seven.deleteNode();
        System.out.println("Printing InOrder:");
        root.printInOrder();
        System.out.println("Printing PreOrder:");
        root.printPreOrder();
        System.out.println("Printing PostOrder:");
        root.printPostOrder();
        
    }
    
}
