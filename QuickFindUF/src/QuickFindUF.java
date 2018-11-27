

// QuickFind
// initialize  Union   find
//    N          N      1
// take N^2 array accesses to process N union commands on N objects
// quickfind too slow, 
// union is too expensive
public class QuickFindUF {

	private int[] id;
	
	// N  array access
	// set id of each object to itselft
	public QuickFindUF(int N)
	{
		id = new int[N];
		
		for (int i = 0; i < N; i++)
			id[i] = i;
		
		
	}
	
	
	
	// 2 array access
	// check if p and q have the same root
	public boolean connected(int p, int q)
	{
		return id[p] == id[q];
		
	}
	
	
	
	
	// at most 2N + 2 array accesses
	
	public void union(int p, int q)
	{
		int pid  = id[p];
		
		int qid = id[q];
		
		for ( int i = 0; i < id.length; i++)
		{
			if ( id[i] == pid)
			{
				id[i] = qid;
			}
		}
	}
}
