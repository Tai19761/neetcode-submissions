class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            hs.put(target - nums[i],i);
        }
        for(int j = 0; j< nums.length; j++){
            int k = nums[j];
            if(hs.containsKey(k) && hs.get(k) != j){
                return new int [] {j,hs.get(k)};
            }
        }
        return new int [] {-1, -1};
    }
}
