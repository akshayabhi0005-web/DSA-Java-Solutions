class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Product of elements to the left
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        // Product of elements to the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }
}
