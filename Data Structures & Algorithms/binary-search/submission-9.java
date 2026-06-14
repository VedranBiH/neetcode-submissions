class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int mid = nums.length / 2;
        if (nums[mid] == target) {
            return mid;
        }
        int ans = -1;
        if (nums[mid] > target) {
            ans = idk(nums, 0, mid, target);
        } else {
            ans = idk(nums, mid + 1, nums.length, target);
        }
        return ans;
    }

    int idk(int[] nums, int startIndex, int endIndex, int target) {
        if (startIndex >= endIndex) {
            return -1;
        }
        int mid = (startIndex + endIndex) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return idk(nums, startIndex, mid, target);
        } else {
            return idk(nums, mid + 1, endIndex, target);
        }
    }
}
