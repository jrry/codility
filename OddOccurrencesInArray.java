class OddOccurrencesInArray 
{
    public int solution(int[] A) 
	{
        HashSet<Integer> hs = new HashSet<>();
        int ret = -1;
        
        for (int i=0; i<A.length; i++) 
		{
            if (!hs.add(A[i])) 
			{
                hs.remove(A[i]);
            }
        }
        
        for (Integer i : hs) 
		{
            ret = i;
        }
		
        return ret;
    }
}