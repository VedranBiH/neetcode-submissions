class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target || matrix[i][matrix[i].length - 1] == target) {
                return true;
            }
            if (matrix[i][0] < target && matrix[i][matrix[i].length - 1] > target) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    boolean binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        int mid = nums.length / 2;

        if (nums[mid] == target) {
            return true;
        }

        if (nums[mid] > target) {
            return binarySearch(Arrays.copyOfRange(nums, 0, mid), target);
        } else {
            return binarySearch(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
        }
    }
}
