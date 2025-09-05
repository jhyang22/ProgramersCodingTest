class Solution {
    public int solution(String my_string, String is_prefix) {
        boolean startsWith = my_string.startsWith(is_prefix);
        
        if(startsWith) {
            return 1;
        }
        
        return 0;
    }
}