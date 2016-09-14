package Daniel;

public class TreeTest {

	public static void main(String[] args) {
		int values[] = { 7, 4, 2, 6, 5, 10, 8, 15, 17, 11, 13 };
		
		TreeNode TestTree = TreeNode.createTree(values);
		
		/*
		System.out.println("PreOrder: ");
		TestTree.printPreOrder();
		System.out.println("InOrder: ");
		TestTree.printInOrder();
		System.out.println("PostOrder: ");
		TestTree.printPostOrder();
		*/
		
		System.out.println("before, PreOrder: ");
		TestTree.printPreOrder();
		
		TestTree.find(14).delete();
		
		System.out.println("deleted, PreOrder: ");
		TestTree.printPreOrder();
		//root = five.update(15);
		
		
		
	}

}
