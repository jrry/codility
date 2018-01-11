class PermMissingElem 
{
    public int solution(int[] A) 
	{
        long len = A.length + 1;
        long sum = (len * (len + 1)) / 2;
        
        for (int i : A) 
		{
            sum -= i;
        }
        
        return (int)sum;
    }
}