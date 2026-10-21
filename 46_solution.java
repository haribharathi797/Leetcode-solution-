public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums.length == 0) return result;
        List<Integer> cur = new LinkedList<Integer>();
        cur.add(nums[0]);
        result.add(cur);
        for(int i = 1; i < nums.length; i++) {
            int curSize = result.size();
            for(int j = 0; j < curSize; j++) {
                for(int x = 0; x < result.get(j).size(); x++) {
                    List<Integer> newList = new LinkedList<Integer>(result.get(j));
                    newList.add(x, nums[i]);
                    result.add(newList);
                }
                result.get(j).add(nums[i]);
            }
        }
        return result;
    }
}
