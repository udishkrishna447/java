import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                nums[i] = num;
                i++;
                set.remove(num);
            }
        }

        return i;
    }
}