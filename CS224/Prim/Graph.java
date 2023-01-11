// jdh CS224 Spring 2023

import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
  List<Node> nodes;

  //---------------------------------------------------

  public Graph() {
    nodes = new ArrayList<Node>();
  }

  //---------------------------------------------------

  public void addNode(Node node) {
    for (Node n: this.nodes) {
      if (n == node) {
        System.out.println("ERROR: graph already has a node " + n.name);
        assert false;
      }
    }
    this.nodes.add(node);
  }

  //---------------------------------------------------

  public void addEdge(Node n1, Node n2, int weight) {
    // outgoing edge
    int idx1 = this.nodes.indexOf(n1);
    if (idx1 < 0) {
      System.out.println("ERROR: node " + n1.name + " not found in graph");
      assert false;
    }

    int idx2 = this.nodes.indexOf(n2);
    if (idx2 < 0) {
      System.out.println("ERROR: node " + n2.name + " not found in graph");
      assert false;
    }

    Edge e1 = new Edge(n1, n2, weight);
    this.nodes.get(idx1).add(e1);

    Edge e2 = new Edge(n2, n1, weight);
    this.nodes.get(idx2).add(e2);
  }

  //-----------------------------------------------

  public List<Edge> prim(Node s) {
    // implement this
  } // prim()

  //-----------------------------------------------

  public List<Edge> primPQ(Node s) {
    // implement this
  } // primPQ()

} // class Graph