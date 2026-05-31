class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        /**
            Every index needs to know the "current longest"
            Then we take the max longest at the end. This is from Grad
            Algo class. I guess I could use hashmap of integer, string where
            integer is the index and string is the string up to that point

            nvm I don't need a map this is done with two arrays if I remember correctly
            in DP
        *
      */

        ArrayList<String> arr = new ArrayList<>();

        arr.add(s.substring(0, 1));
        int longest = 1;

        for (int i = 1; i < s.length(); i++) {
            String prevSeq = arr.get(i-1);
            String currentCharacter = s.substring(i, i+1);
            if(!prevSeq.contains(currentCharacter)){
                arr.add(prevSeq + currentCharacter);
            }
            else{
                int index = prevSeq.indexOf(currentCharacter.charAt(0));
                String newSeq = prevSeq.substring(index+1) + currentCharacter;
                arr.add(newSeq);
            }
        }

        for (String word : arr) {
            //System.out.println(word);
            longest = Math.max(word.length(), longest);
        }
        return longest;
    }
}
