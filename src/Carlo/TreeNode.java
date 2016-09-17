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
        
        if (newNode.value >= currentNode.value){
            if (currentNode.rightChild == null){
                currentNode.rightChild = newNode;
                newNode.parent = currentNode;
            }
            else {
                currentNode.rightChild.add(v);
            }
        }
        else{
            if (currentNode.leftChild == null){
                currentNode.leftChild = newNode;
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
        if (rightChild != null){
            rightChild.printInOrder();
        }                
    }
    
    
    public void printPostOrder() {
        if (leftChild != null){
            leftChild.printPostOrder();
        }
        if (rightChild != null){
            rightChild.printPostOrder();
        }
        System.out.println(this.value);
        
    }

    


    public void printPreOrder() {
        if (leftChild != null){
            System.out.println(this.value);
            leftChild.printPreOrder();
        }
        else{
            System.out.println(this.value);
        }
        if (rightChild != null){
            rightChild.printPreOrder();
        }        
        
    }

    TreeNode find(int i) {
        TreeNode currentNode = this;
        while (currentNode.value != i){
            if (currentNode.value < i){
                currentNode = currentNode.rightChild;
            }
            if (currentNode.value > i){
                currentNode = currentNode.leftChild;
            }
        }
        
        return currentNode;
    }

    public void update(int i) {
        TreeNode currentNode = this;
        TreeNode root = this.getRoot();
        currentNode.value = i;
        
        if(root != currentNode){
        if(currentNode.parent.leftChild == currentNode){
            currentNode.parent.leftChild = null;
        }
               
        if(currentNode.parent.rightChild == currentNode){
            currentNode.parent.rightChild = null;
        }
        }
        
        if(currentNode.rightChild != null){
            currentNode.rightChild.update(currentNode.rightChild.value);
        }
        
        if(currentNode.leftChild != null){
            currentNode.leftChild.update(currentNode.leftChild.value);
        }
        
        if(root != currentNode){
        root.add(currentNode.value);
        }

    }
    
    TreeNode getRoot(){
        TreeNode root = null;
        TreeNode currentNode = this;
        
        while (currentNode.parent != null){
            currentNode = currentNode.parent;
        }
        root = currentNode;
        
        return root;
    }
    
    TreeNode deleteNode(){
        TreeNode deletedNode = this;
        TreeNode root = this.getRoot();
        
        if(deletedNode.parent != null){
            if(deletedNode.parent.rightChild == deletedNode){
                deletedNode.parent.rightChild = null;
            }
            
            if(deletedNode.parent.leftChild == deletedNode){
                deletedNode.parent.leftChild = null;
            }
            
            if(deletedNode.leftChild != null){
                deletedNode.leftChild.update(deletedNode.leftChild.value);
            }
            
            if(deletedNode.rightChild != null){
                deletedNode.rightChild.update(deletedNode.rightChild.value);
            }
            
        }
        else{
            TreeNode currentNode = deletedNode.leftChild;
            TreeNode leftChildOfNewRoot = null;
            
            
            while (currentNode.rightChild != null){
                currentNode = currentNode.rightChild;
            }
            
            TreeNode oldConnection = currentNode.parent;
            
            
            if (currentNode.leftChild != null){
                leftChildOfNewRoot = currentNode.leftChild;
            }
            
            currentNode.deleteNode();
            root = currentNode;
            
            if(deletedNode.leftChild != null){
                
                deletedNode.leftChild.parent = root;
                root.leftChild = deletedNode.leftChild;
            }
            
            if(deletedNode.rightChild != null){
                
                deletedNode.rightChild.parent = root;
                root.rightChild = deletedNode.rightChild;
            }
            
            if(leftChildOfNewRoot != null){
                
                if(oldConnection.value < leftChildOfNewRoot.value){
                    oldConnection.rightChild = leftChildOfNewRoot;
                    leftChildOfNewRoot.parent = oldConnection;
                }
                else{
                    oldConnection.leftChild = leftChildOfNewRoot;
                    leftChildOfNewRoot.parent = oldConnection;
                }
                
            }

            
        }
        
        return root;
               
    }
}
