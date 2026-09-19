import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int frequency = map.getOrDefault(num, 0);

            count += frequency;

            map.put(num, frequency + 1);
        }

        return count;
    }
}