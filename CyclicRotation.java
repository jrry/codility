class CyclicRotation
{
    public int[] solution(int[] A, int K)
	{
        int[] ret = new int[A.length];
        
        for (int i = 0; i < A.length; i++) 
		{
            ret[(i+K)%(A.length)] = A[i];
        }

        return ret;
    }
}