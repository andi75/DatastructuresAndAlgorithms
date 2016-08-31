package Lukas;

public class BinarySearchTreeTest 
{
    
    public static void main(String[] args) 
    {
        
        
        testSearchTree();
        
    }

    static void testSearchTree()
    {
        int[] objects = {0, 5, 6, 1 ,7, 2, 4, 3, 8, 9};
        
        TreeNode root = null;
        
        // Build the tree
        for(int i : objects)
        {
            if(root == null)
            {
                root = new TreeNode(i);
            }
            else
            {
                root.add(i);
            }
        }
        
        // Test it...
        
        root.inOrderTraversal();
        root.preOrderTraversal();
        root.postOrderTraversal();
        
        
    }
}