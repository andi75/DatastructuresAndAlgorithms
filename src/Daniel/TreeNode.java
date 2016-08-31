package Daniel;

public class TreeNode {

	public TreeNode parent, leftChild, rightChild;
	public int value;
	
	TreeNode(int value) {
		this.value = value;
	}
	
	
	
	public TreeNode find(int value) {
		
		if(value < this.value && this.leftChild != null) {
			return this.leftChild.find(value);
		} else if(value <= this.value && this.rightChild != null) {
			return this.rightChild.find(value);
		}
		
		return null;
	}



	public void add(int v) {
		TreeNode currentNode = this;
		TreeNode newNode = new TreeNode(v);
		
		if(newNode.value < currentNode.value) 
		{
			if(currentNode.leftChild == null) 
			{
				currentNode.leftChild = newNode;
				newNode.parent = currentNode;
			} 
			else 
			{
				currentNode.leftChild.add(v);
			}
		}
		else if(newNode.value >= currentNode.value)
		{
			if(currentNode.rightChild == null)
			{
				currentNode.rightChild = newNode;
				newNode.parent = currentNode;
			}
			else
			{
				currentNode.rightChild.add(v);
			}
		}
		
		
		
	}
	
	public TreeNode getRoot() {
		TreeNode currentNode = this;
		
		while(currentNode.parent != null) {
			currentNode = currentNode.parent;
		}
		
		return currentNode;
	}
	
	
	public void printInOrder() {
		TreeNode currentNode = this;
	
		if(currentNode.leftChild != null) 
		{
			currentNode.leftChild.printInOrder();
		} 
		else if(currentNode.rightChild != null)
		{
			currentNode.rightChild.printInOrder();
		} else {
			System.out.println(currentNode.value);
			assert(currentNode.parent != null);
			currentNode = currentNode.parent;
		}
		
		
	
		
		
	}



	public void printPreOrder() {
		// TODO Auto-generated method stub
		
	}



	public void printPostOrder() {
		// TODO Auto-generated method stub
		
	}



	public TreeNode deleteWithNewRoot() {
		// TODO Auto-generated method stub
		return null;
	}

}
