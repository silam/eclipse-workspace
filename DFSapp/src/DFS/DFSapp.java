package DFS;


// COmplexity 
// directed graphy
// each vertx and 
// n vertix , n neightbor checks, n vists unit of time
// n + e runtime
 // undirected graphy: n vertex, n visits, 2*e neghborcheck
// n + 2e

// both O(n+e)
//https://www.youtube.com/watch?v=uT1p5Eiw9CE&index=17&list=PLs8TmeZHJEeF2UMA8KCI6g0BMDrVUgB0r

public class DFSapp {

	class Graph
	{
		Vertex[] adjLists;
		
		public void dfs() {
			boolean[] visited = new boolean[adjLists.length];
			for ( int v = 0; v < visited.length; v++)
			{
				if ( !visited[v])
					dfs(v, visited);
			}
		}
		public void dfs(int v, boolean[] visited) {
			visited[v] = true;
			
			System.out.println("Visiting = " + adjLists[v].name);
			
			for ( Neighbor nbr =  adjLists[v].adjList; nbr != null; nbr = nbr.next)
			{
				if ( !visited[nbr.vertexNum]) {
					
					System.out.println(adjLists[v].name);
					System.out.println(adjLists[nbr.vertexNum].name);
					
					dfs(nbr.vertexNum, visited);
					
					
				}
			}
		}
	}
	class Neighbor
	{
		public int vertexNum;
		public Neighbor next;
		
		public Neighbor(int _vnm, Neighbor _nbr)
		{
			this.vertexNum = _vnm;
			this.next = _nbr;
		}
		
	}
	class Vertex {
		String name;
		Neighbor adjList;
		
		Vertex(String _name, Neighbor _nbr)
		{
			this.name = _name;
			this.adjList = _nbr;
		}
	}
	private class DFS
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
