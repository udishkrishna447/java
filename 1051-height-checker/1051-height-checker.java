class Solution {
    public int heightChecker(int[] heights) {
        int res[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}