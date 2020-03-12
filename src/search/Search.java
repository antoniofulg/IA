package search;

import node.Node;

public abstract class Search {

	private int searchValue;
	private String responseText;
	
	public abstract boolean searchResult(Node node);
	public abstract int countNodesChild();
	
	protected void getParentResult(Node node) {
		String result = "";
		Node nodeValue = node;
		result += + nodeValue.getValue();
		while (nodeValue.getParentNode() != null) {
			nodeValue = nodeValue.getParentNode();
			result = nodeValue.getValue() + "\n " + result;
		}
		this.responseText = result;
	}
	
	public void showResultText() {
		if (this.responseText != null) {
            System.out.println("# We find it!");
            System.out.println("# The trail taken was:\n " + this.responseText);
		} else {
			System.out.println("# Sorry, the value " + this.searchValue + " was not found.");
		}
	}
	
	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
	
	public void setSearchValue(int searchValue) {
		this.searchValue = searchValue;
	}
	
	public boolean isResultadoBusca(Node node) {
		return node.getValue() == searchValue;
	}
	
	public int getSearchValue() {
		return searchValue;
	}
	
}