class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String val=new String(arr);
            if(!map.containsKey(val)){
                ArrayList<String>list= new ArrayList<>();
                map.put(val,list);
            }
                map.get(val).add(strs[i]);
            
        }
        return new ArrayList<>(map.values());
        
    }
}