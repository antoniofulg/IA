package app;

import java.util.ArrayList;
import java.util.Scanner;

import node.Node;
import search.Breadth;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("########## Breadth-First Search ##########");
        System.out.println("# Please insert number of nodes:");
        int treeLength = scanner.nextInt(); 

        ArrayList<Node> tree = new ArrayList<Node>();

        for (int i = 0; i <= treeLength; i++) {
            tree.add(new Node(i));
        }

        int node = 0;
        int child = node + 1;

        do {
            if (tree.get(node).getLeftNode() == null) {
                if ((node + 1) <= treeLength) {
                    tree.get(node).setLeftNode(tree.get(child));
                }
                child++;
            }
            
            if (tree.get(node).getRightNode() == null) {
                if ((node + 2) <= treeLength) {
                    tree.get(node).setRightNode(tree.get(child));
                }
                child++;
            }
            node++;
        } while (child < treeLength);

        System.out.println("# Please insert the node that you want to search:");
        int searchValue = scanner.nextInt();
        
        if (searchValue > treeLength) {
            System.out.println("# The max node is " + treeLength + ", we will search the " + treeLength + " node value!");
            searchValue = treeLength;
        }

        scanner.close();

        Breadth bf = new Breadth(searchValue);
        bf.searchResult(tree.get(0));
        bf.showResultText();

    }
}