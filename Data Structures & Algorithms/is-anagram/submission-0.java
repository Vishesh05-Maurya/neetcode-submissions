class Solution {
    public boolean isAnagram(String s, String t) {
          
     char [] h =s.toCharArray();
        char [] n =t.toCharArray();
        Arrays.sort(h);
        Arrays.sort(n);
        return  Arrays.equals(h,n);
        

    }
}
