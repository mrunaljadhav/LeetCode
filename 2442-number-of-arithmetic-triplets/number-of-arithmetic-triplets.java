class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
         Set<Integer> seen = new HashSet<>();
    int res = 0;

    for (int num : nums) {
        // num is acting as nums[j]
        if (seen.contains(num - diff) && seen.contains(num - 2 * diff)) {
            res++;
        }
        seen.add(num);
    }

    return res;
    }
}