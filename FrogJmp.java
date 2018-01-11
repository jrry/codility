class FrogJmp 
{
    public int solution(int X, int Y, int D) 
	{
        int jumps = 0;
        int xy = Y - X;
        if (xy <=0)
            return jumps;
        jumps = xy / D;
        if (xy % D > 0)
            jumps++;
        return jumps;
    }
}