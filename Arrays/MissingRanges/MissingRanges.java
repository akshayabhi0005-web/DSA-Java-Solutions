import java.util.*;

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {

        List<List<Integer>> result = new ArrayList<>();

        long next = lower;

        for (int num : nums) {

            if (num > next) {
                result.add(Arrays.asList((int) next, num - 1));
            }

            next = (long) num + 1;
        }

        if (next <= upper) {
            result.add(Arrays.asList((int) next, upper));
        }

        return result;
    }
}
