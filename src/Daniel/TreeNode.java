package Daniel;

public class TreeNode {

	public TreeNode parent, leftChild, rightChild;
	public int value;
	
	TreeNode(int value) {
		this.value = value;
	}
	
	
	public static TreeNode createTree(int[] values) {
		TreeNode root = new TreeNode(values[0]);
		
		for(int i = 1; i < values.length; i++) {
			root.insert(values[i]);
		}
		
		return root;
	}
	
	public void insert(int v) {
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
				currentNode.leftChild.insert(v);
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
				currentNode.rightChild.insert(v);
			}
		}
		
	}
	
	
	public TreeNode delete() {
		
		TreeNode root = this.getRoot();
		
		if(this.leftChild == null && this.rightChild == null) { //leaf
						
			if(this.parent.leftChild == this) {
				this.parent.leftChild = null;
				return root;
			} else {
				this.parent.rightChild = null;
				return root;
			}
		} 
		
		else if(this.leftChild != null && this.rightChild == null) { //one child left
		
			if(this.parent.leftChild == this) {
				this.parent.leftChild = this.leftChild;
				return root;
			} else {
				this.parent.rightChild = this.leftChild;
				return root;
			}
			
		} else if(this.leftChild == null && this.rightChild != null) { // one child right
			
			if(this.parent.leftChild == this) {
				this.parent.leftChild = this.rightChild;
				return root;
			} else {
				this.parent.rightChild = this.rightChild;
				return root;
			}
			
			// two childs:
			
		} else if(this.leftChild != null && this.rightChild != null) {
			
			TreeNode mostLeft = this.rightChild.getMostLeftChild();
			
			if(mostLeft.rightChild == null) {
			
				mostLeft.parent = this.parent;
				
				if(this.parent != null) {
					if(this.parent.leftChild == this) {
						mostLeft.parent.leftChild = mostLeft;
						
					} else {
						mostLeft.parent.rightChild = mostLeft;
					}
				}
				
				mostLeft.leftChild = this.leftChild;
				
				
			} else {
				TreeNode mostLeftRight = mostLeft.rightChild;
				
				
				System.out.println("has to be done, started to late...");;
				
			}
			
		
		}
		
		
			
		return null;
		

	}

	public TreeNode find(int value) {
		
		TreeNode currentNode = this.getRoot();
	
		while(currentNode.value != value) {
			
			if(value < currentNode.value) {
				if(currentNode.leftChild != null) {
					currentNode = currentNode.leftChild;
				} else {
					return null;
				}
				
			} else if(value > currentNode.value) {
				if(currentNode.rightChild != null) {
					currentNode = currentNode.rightChild;
				} else {
					return null;
				}
			}
			
			
			
			
		}
		
		return currentNode;
		
	}


	public void printInOrder() {

		//prints left branch
		if(this.leftChild != null) {
			this.leftChild.printInOrder();
		}
		
		//prints root
		System.out.println(this.value);
		
		//prints right branch
		if(this.rightChild != null) {
			this.rightChild.printInOrder();
		}

	}
	
	
	public void printPreOrder() {
		
		//prints root
		System.out.println(this.value);		
		
		//prints left branch
		if(this.leftChild != null) {
			this.leftChild.printPreOrder();
		}
		
		//prints right branch
		if(this.rightChild != null) {
			this.rightChild.printPreOrder();
		}
		
	}

	
	public void printPostOrder() {
		
		//prints left branch
		if(this.leftChild != null) {
			this.leftChild.printPostOrder();
		}
					
		//prints right branch
		if(this.rightChild != null) {
			this.rightChild.printPostOrder();
		}
		
		//prints root
		System.out.println(this.value);

		
	}
	
	public TreeNode getRoot() {
		TreeNode currentNode = this;
		
		if(currentNode.parent == null) {
			return currentNode;
		} else {
			return currentNode.parent.getRoot();
		}
		
	}
	
	private TreeNode getMostLeftChild() {
		TreeNode currentNode = this;
		
		if(currentNode.leftChild != null) {
			return currentNode.leftChild.getMostLeftChild();
		} else {
			return currentNode;
		}
		
	}
	
	private TreeNode getMostRightChild() {
		TreeNode currentNode = this;
		
		if(currentNode.rightChild != null) {
			return currentNode.rightChild.getMostRightChild();
		} else {
			return currentNode;
		}
	}

}
