package node;

public class Node {
    private int value;
	
	private int cost;
	
	private Node parentNode;	
	private Node leftNode;
	private Node rightNode;
	
	public Node(int value) {
		this.value = value;
		this.cost = 0;
	}
	
	public Node(int value, int cost) {
		this.value = value;
		this.cost = cost;
	}

	public int getValue() {
		return value;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
		this.leftNode.setParentNode(this);
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
		this.rightNode.setParentNode(this);
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}