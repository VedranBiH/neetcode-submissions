class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();

        int i = 0;
        int y = c.length - 1;
        while(i <= c.length / 2 && y >= c.length / 2){

            if(!Character.isLetterOrDigit(c[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(c[y])){
                y--;
                continue;
            }
            if(Character.toLowerCase(c[i]) != Character.toLowerCase(c[y])){
                return false;
            }

            i++;
            y--;
        }

        return true;
    }
}
