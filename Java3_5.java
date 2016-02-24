public class Java3_5 {
	
	public static void main(String[] args)
	{
		int a = 10;
		int[] info = new int[]{1,5,23,12,22,34,100,99,100000,2}; 
		int smaller= 0;
		int larger = 9;
		System.out.println("pre Sorting Values:");
		for(int p=0; p< a; 	++p)
		{
			System.out.println(info[p]);
		}
		mergeSorting(info,smaller,larger);
		System.out.println("Post Sorting Values:");
		for (int p=0; p<a; ++p)
		{
			System.out.println(info[p]);
		}
		
	}
		
		public static void merging(int[] var, int smaller, int middle, int larger)
		{
			int a = var.length;
			int[] inst = new int[a];
			for(int p = smaller; p<=larger; ++p)
			{
				inst[p] = var[p];
			}
			int p = smaller;
			int q = middle+1;
			int r= smaller;
			while( p <=middle && q<=larger)
			{
				if (inst[p] <=inst[q])
				{
					var[r]=inst[p];
					++p;
				}
				else
				{
					var[r]= inst[q];
					++q;
				}
				++r;
			}
			while(p<=middle)
			{
				var[r]= inst[p];
				++r;
				++p;
				}
			}
		public static void mergeSorting(int[] var, int smaller, int larger)
		{
			
			if(smaller < larger)
			{
				int center = (smaller + larger)/ 2;
				mergeSorting(var, smaller,center);
				mergeSorting(var,center+1,larger);
				merging(var, smaller, center, larger);
			}
		}
		
		
		

	
		
	}
