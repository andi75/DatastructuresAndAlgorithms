package Carlo;

public class TreeNode {
    
    public TreeNode leftChild, rightChild, parent;
    public int value;
    
    TreeNode (int value){
        this.value = value;
    }
    
    public void add(int v) {
        TreeNode currentNode = this;
        TreeNode newNode = new TreeNode(v);
        
        if (newNode.value <= currentNode.value){
            if (currentNode.rightChild == null){
                currentNode.rightChild = currentNode;
                newNode.parent = currentNode;
            }
            else {
                currentNode.rightChild.add(v);
            }
        }
        else{
            if (currentNode.leftChild == null){
                currentNode.leftChild = currentNode;
                newNode.parent = currentNode;
            }
            else {
                currentNode.leftChild.add(v);
            }
        }
        
        
    }

    public void printInOrder() {
        
        if (leftChild != null){
            leftChild.printInOrder();
        }
        System.out.println(this.value);
        
        
    }
    
    
    public void printPostOrder() {
        
        
    }

    


    public void printPreOrder() {
        
        
        
        
    }

    TreeNode find(int i) {
        
        
        return null;
    }

    TreeNode update(int i) {
        
        
        return null;
    }
    
}
