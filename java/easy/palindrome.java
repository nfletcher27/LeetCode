class Solution {
    public boolean isPalindrome(int x) {
        String stringy = Integer.toString(x);
        String reverseStringy = "";
        for(int i = stringy.length()-1; i > -1; i--) {
            reverseStringy += stringy.charAt(i);
        }
        if(stringy.equals(reverseStringy)) return true;
        return false;
    }
}
