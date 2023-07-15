class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            unique.add(nums[i]);
            String str = Integer.toString(nums[i]);
            StringBuilder str1 = new StringBuilder();
            str1.append(str);
            str1.reverse();
            unique.add(Integer.parseInt(str1.toString()));
        }
       return unique.size();
    }
}