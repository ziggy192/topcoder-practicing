import java.util.*;
import java.math.*;
import static java.lang.Math.*;


//thieu truong hop largestGraph.isConnectedToMain == false & thieu constraint largestGraph must connectedToMain or else assign it to a random graph
public class AddElectricalWires {
	
	public int maxNewWires(String[] wires, int[] gridConnections) {
		// TODO: 6/26/19 form the graphs (from based & not based)

		ArrayList<Graph> graphList = new ArrayList<>();
		boolean[] nodeAddedToStack = new boolean[wires.length];
		boolean[][] traversedEdge = new boolean[wires.length][wires.length];

		for (int gridConnection : gridConnections) {
			Graph graph = new Graph(gridConnection,true);
			graphList.add(graph);
			//traverse every edge
			Stack<Integer> stack = new Stack<>();
			stack.push(gridConnection);
			while (!stack.isEmpty()) {
				//traverse every edge
				Integer node = stack.pop();
				graph.getNodeList().add(node);
				nodeAddedToStack[node] = true;
				for (int i = 0; i < wires.length; i++) {
					if ((wires[node].charAt(i) == '1') && (traversedEdge[i][node] ==false)) {

						traversedEdge[i][node] = true;
						traversedEdge[node][i] = true;
						graph.increaseEdgeCount(1);

						if (nodeAddedToStack[i] == false) {
							stack.add(i);
							nodeAddedToStack[i] = true;
						}

					}
				}
			}
		}

		for (int i = 0; i < wires.length; i++) {
			if (nodeAddedToStack[i] == false) {
				Graph graph = new Graph(i,false);
				graphList.add(graph);
				//traverse every edge
				Stack<Integer> stack = new Stack<>();
				stack.push(i);
				while (!stack.isEmpty()) {
					//traverse every edge
					Integer node = stack.pop();
					graph.getNodeList().add(node);
					nodeAddedToStack[node] = true;
					for (int j = 0; j < wires.length; j++) {
						if ((wires[node].charAt(j) == '1') && (traversedEdge[j][node] ==false)) {

							traversedEdge[j][node] = true;
							traversedEdge[node][j] = true;
							graph.increaseEdgeCount(1);

							if (nodeAddedToStack[j] == false) {
								stack.add(j);
								nodeAddedToStack[j] = true;
							}

						}
					}
				}
			}
		}

		// TODO: 6/26/19 find the largest graph
		Graph largestGraph = null;
		for (Graph graph : graphList) {
			if (graph.isConnectedToMain() && (largestGraph == null || largestGraph.getNodeList().size() < graph.getNodeList().size())) {
				largestGraph = graph;
			}
		}

		if (largestGraph == null) {
			largestGraph = graphList.get(0);
		}
		// TODO: 6/26/19 let the largest eat the rest
		for (Graph graph : graphList) {
			if (graph != largestGraph && !graph.isConnectedToMain()) {
				largestGraph.eat(graph);
			}
		}

		// TODO: 6/26/19 substract already edge

		int result = 0;
		for (Graph graph : graphList) {
			if (graph.isConnectedToMain() || graph == largestGraph)
				result += graph.getSubstractedEdgeNumber();
		}
		return result;
	}



	static class Graph{
		boolean connectedToMain;
		int base;
		int edgeCount;

		List<Integer> nodeList;

		public Graph(int base, boolean connectedToMain) {
			this.base = base;
			this.connectedToMain = connectedToMain;

			edgeCount = 0;
			nodeList = new ArrayList<>();
		}

		public int getBase() {
			return base;
		}


		public boolean isConnectedToMain() {
			return connectedToMain;
		}

		public void setConnectedToMain(boolean connectedToMain) {
			this.connectedToMain = connectedToMain;
		}

		public void setBase(int base) {
			this.base = base;
		}

		public int getEdgeCount() {
			return edgeCount;
		}

		public void increaseEdgeCount(int value) {
			edgeCount+=value;
		}

		public void setEdgeCount(int edgeCount) {
			this.edgeCount = edgeCount;
		}

		public List<Integer> getNodeList() {
			return nodeList;
		}

		public void setNodeList(List<Integer> nodeList) {
			this.nodeList = nodeList;
		}

		public void eat(Graph graph) {
			if (graph.isConnectedToMain()) {
				return;
			}
			this.nodeList.addAll(graph.getNodeList());
			this.edgeCount += graph.getEdgeCount();
		}

		public int getFullyConnectedNumber() {
			int nodeSize = this.nodeList.size();
			return nodeSize * (nodeSize - 1) / 2;
		}

		public int getSubstractedEdgeNumber() {
			return getFullyConnectedNumber() - edgeCount;
		}
	}
}
