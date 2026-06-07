class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
         * Okay so the main thing is to know when to move the left pointer and
         * when to move the right pointer.
         *
         * So I guess we move the right until we find a duplicate.
         * Take the length and see if its the biggest
         *
         * So once I find a duplicate I move the left once? unsure.
         *
         * So I will have a set and add characters to it and then remove a character as well
         **/

        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;

        int ans = 0;

        while (r < s.length()) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
