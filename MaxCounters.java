/**
 * @author Jarosław Pawłowski
 */

class Solution {
    public int[] solution(int N, int[] A) {
        int[] tab = new int[N];
        int max = 0;
        int lastmax = 0;


        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (tab[A[i] - 1] >= lastmax)
                    tab[A[i] - 1] += 1;
                else
                    tab[A[i] - 1] = lastmax + 1;
                max = Math.max(tab[A[i] - 1], max);
            } else
                lastmax = max;
        }

        for (int i = 0; i < tab.length; i++)
            if (tab[i] < lastmax)
                tab[i] = lastmax;
        
        return tab;
    }
}