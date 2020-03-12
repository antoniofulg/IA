package search;

import java.util.LinkedList;
import java.util.Queue;

import node.Node;

public class Breadth extends Search {
	
	// Fila de dados FiFo
	private Queue<Node> nodeQueue;
		
	public Breadth(int searchValue) {
		this.nodeQueue = new LinkedList<Node>();
		this.setSearchValue(searchValue);
	}
	
	@Override
	public boolean searchResult(Node no) {
		if (isResultadoBusca(no)) {
			// Se for o objetivo
			getParentResult(no);
			return true;
		} else {			
			// Adicionar os nós na fila
			if (no.getLeftNode() != null) {
				this.nodeQueue.add(no.getLeftNode());
			}
			if (no.getRightNode() != null) {
				this.nodeQueue.add(no.getRightNode());
			}
			
			Node endNode = this.nodeQueue.poll();
			if (endNode != null && searchResult(endNode)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int countNodesChild() {
		if (this.nodeQueue != null) {
			return this.nodeQueue.size();
		}
		return 0;
	}	
}