package Lukas;

public class TreeNode
{
    public int value;
    
    public TreeNode parent;
    public TreeNode leftChild;
    public TreeNode rightChild;
    
    public TreeNode(int item) // Constructer
    {
        this.value = item;
    } 
    
    // add a value to a node...
    public void add(int item)
    {
        if(item < this.value)
        {
            if(this.leftChild != null)
            {
                this.leftChild.add(item);
                // goes on to the next branch to the left
            }
            else
            {
                this.leftChild.value = item;
                // adds a item
            }
        }
        if(item >= this.value)
        {
            if(item > this.value)
            {
                this.rightChild.add(item);
                // 
            }
            // to be continued
        }
    }
    

    void inOrderTraversal() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void preOrderTraversal() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void postOrderTraversal() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
