class BinaryGap 
{
    public int solution(int N) 
	{
        String binaryN = Integer.toBinaryString(N);
        int gap = 0;
        int tempgap = 0;
		
        for (int i=0; i<binaryN.length(); i++)
		{
            if (binaryN.charAt(i) == '0')
			{
                tempgap++;
            }
            if (tempgap > 0 && binaryN.charAt(i) == '1')
			{
                if (tempgap > gap)
                    gap = tempgap;
                tempgap = 0;
            }
        }
        return gap;
    }
}