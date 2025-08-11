class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[]arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            ArrayList<String>list=new ArrayList<>();
            if(map.containsKey(key)){
                list=map.get(key);
                list.add(str);
                map.put(key,list);
            }else{
                list.add(str);
                map.put(key,list);

            }

            
        }


        return new ArrayList<>(map.values());
    }
}