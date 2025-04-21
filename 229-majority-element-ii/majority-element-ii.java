class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>set=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>nums.length/3){
                set.add(e.getKey());
            }
        }
       return set;
    }
}