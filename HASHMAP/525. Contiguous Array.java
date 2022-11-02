class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0,count=0;
        System.out.println(map);
        for(int i=0;i<nums.length;i++)
        {
            count+=(nums[i]==1?1:-1);
            if(map.containsKey(count))
            {
                max = Math.max(max,i-map.get(count));
                System.out.println(map.get(count)+" "+(i-map.get(count)));
            }
            else
            {
                map.put(count,i);
            }
        }
        return max;
    }
}
