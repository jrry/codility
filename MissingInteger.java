import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> ss = new HashSet<>();

        for (Integer i : A) {
            if (i > 0)
                ss.add(i);
        }
        
        if (ss.isEmpty())
            return 1;
        
        int ret = 1;
        boolean end = true;

        for (int i = 1; i <= A.length; i++) {
            if (!ss.contains(i)) {
                ret = i;
                end = false;
                break;
            }
        }

        if (end)
            ret = A.length+1;
        
        return ret;
    }
}