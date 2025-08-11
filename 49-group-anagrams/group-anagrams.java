class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            String val=transform(str);
            ArrayList<String>arr=new ArrayList<>();
            if(map.containsKey(val)){
                arr=map.get(val);
                arr.add(strs[i]);
                map.put(val,arr);
            }else{
                arr.add(strs[i]);
                map.put(val,arr);
                
            }

           
        }


        return new ArrayList<>(map.values());
    }
    String transform(String str){
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder("");
        char c='a';
        for(int i=0;i<26;i++){
            sb.append(c);
            sb.append(arr[i]);
            c++;

        }
        return sb.toString();
    }
}