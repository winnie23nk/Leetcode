class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set2=new HashSet<>();

        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        for(int k=0;k<nums1.length;k++){
            if(set2.contains(nums1[k])){
                if(!list.contains(nums1[k]))
                list.add(nums1[k]);
            }
        }
        int n=list.size();
        int arr[]= new int[n];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
       return arr;
    }
}