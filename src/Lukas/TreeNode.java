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
            else // adds a leaf
            {
                this.leftChild.value = item;
                // adds a item
            }
        }
        if(item >= this.value)
        {
            if(this.rightChild != null)
            {
                this.rightChild.add(item);
                // 
            }
            else // adds a leaf
            {
            	this.rightChild.value = item;
            }
        }
    }
    

    public void inOrderTraversal() 
    {
    	
    	// Very messy... not the final form (not even working)
    	
    	TreeNode currentItem = this;
    	currentItem = getLeftLeaf(currentItem);
        System.out.println(currentItem.value);
        
        currentItem = currentItem.parent;
        System.out.println(currentItem.value);
        
        currentItem = getLeftLeaf(currentItem.rightChild);
        System.out.println(currentItem.value);
    }
    TreeNode getLeftLeaf(TreeNode currentItem)
    {
    	while(currentItem.leftChild != null)
    	{
    		currentItem = currentItem.leftChild;
    	}
    	
    	return currentItem;
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
