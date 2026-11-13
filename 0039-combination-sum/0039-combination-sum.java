class Solution {
    public void Perform(int ind, int target, int[] nums,
                        List<List<Integer>> ans,
                        List<Integer> temp, int n) {

        if(ind == n) {
            if(target == 0) {
                // Found a valid combination
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(nums[ind] <= target) {
            // Take the current element and reuse it
            temp.add(nums[ind]);
            Perform(ind, target - nums[ind], nums, ans, temp, n);

            // Backtrack
            temp.remove(temp.size() - 1);
        }

        // Skip the current element
        Perform(ind + 1, target, nums, ans, temp, n);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // Start recursion from the first candidate
        Perform(0, target, candidates, ans, temp, n);

        return ans;
    }
}