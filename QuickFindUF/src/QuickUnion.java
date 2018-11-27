

// too slow
//					initialize		union 		find
// quick Find			N			N			1
// quick union			N			N*			N
// Weighted             N		   lg N		   lg N
public class QuickUnion {
private int[] id;
	
	// N  array access
	// set id of each object to itselft
	public QuickUnion(int N)
	{
		id = new int[N];
		
		for (int i = 0; i < N; i++)
			id[i] = i;
		
		
	}
	
	//chose parent pointers until reach root
	// depth of i array accesses
	public int root(int i)
	{
		while  (i != id[i])
			i = id[i];
		
		return i;
	}
	
	// 2 array access
	// check if p and q have the same root
	public boolean connected(int p, int q)
	{
		
		return root(p) == root(q);
	}
	
	
	
	
	
	// change root of p to point to root of q
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}
