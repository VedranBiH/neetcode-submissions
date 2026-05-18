class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //One valid solution exists
        if(nums.length == 2){
            return new int[]{0,1};
        }
         for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{Math.min(i, map.get(diff)), Math.max(i, map.get(diff))};
            }
            map.put(nums[i],i);
            if(map.containsKey(diff) && map.get(diff) != i){
                return new int[]{Math.min(i, map.get(diff)), Math.max(i, map.get(diff))};
            }
        }
        //Java forces a return but this would be the case when there is no valid solution
        return new int[]{0,0};
    }
}
