class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int y = numbers.length - 1;
        int[] ans = new int[2];
        while(i < y){

            if(numbers[i] + numbers[y] == target){
                ans[0] = i + 1;
                ans[1] = y + 1;
                return ans;
            }
            else if(numbers[i] + numbers[y] > target){
                y--;
                continue;
            }
            else{
                i++;
            }
        }

        return ans;
    }

}
