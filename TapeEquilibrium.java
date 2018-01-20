/**
 * @author Jarosław Pawłowski
 */

class Solution {
    public int solution(int[] A) {
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        int left = A[0];
        int right = sum - left;
        int abs = Math.abs(left - right);
        int diff = abs;

        for (int i = 1; i < A.length - 1; i++) {
            left += A[i];
            right = sum - left;
            abs = Math.abs(left - right);

            if (abs < diff) {
                diff = abs;
            }
        }
        return diff;
    }
}