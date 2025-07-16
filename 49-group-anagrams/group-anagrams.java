class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String val=frequencyString(strs[i]);
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        
    }
    public String frequencyString(String str){
        int freq[]= new int[26];
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]-'a';
            freq[idx]++;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<freq.length;i++){
            char c='a';
            sb.append(c);
            sb.append(freq[i]);
            c++;
        }
        return sb.toString();
    }
}