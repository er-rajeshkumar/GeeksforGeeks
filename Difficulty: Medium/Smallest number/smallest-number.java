


class Solution {
    public String smallestNumber(int s, int d) {
        // code here
         // Case 1: Impossible conditions
        if ((s == 0 && d > 1) || s > 9 * d)
            return "-1";
        if (s == 0 && d == 1)
            return "0";

        int[] res = new int[d];

        // Fill from the last digit (rightmost)
        s -= 1; // reserve 1 for the first digit (to avoid leading zero)
        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        // Add the reserved 1 back to the first digit
        res[0] = s + 1;

        // Build result string
        StringBuilder sb = new StringBuilder();
        for (int digit : res)
            sb.append(digit);

        return sb.toString();
    }
}
