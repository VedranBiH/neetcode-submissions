class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();

        HashMap<Character,Integer> firstWordMap = new HashMap<>();
        HashMap<Character,Integer> secondWordMap = new HashMap<>();

        for(int i = 0; i < firstWord.length; i++){
            if(firstWordMap.containsKey(firstWord[i])){
                firstWordMap.put(firstWord[i], firstWordMap.get(firstWord[i]) + 1);
            }
            else{
                firstWordMap.put(firstWord[i],1);
            }   
        }

        for(int i = 0; i < secondWord.length; i++){
            if(secondWordMap.containsKey(secondWord[i])){
                secondWordMap.put(secondWord[i], secondWordMap.get(secondWord[i])+ 1);
            }
            else{
                secondWordMap.put(secondWord[i],1);
            }   
        }
        
        for (Map.Entry<Character, Integer> entry : firstWordMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if(!secondWordMap.containsKey(key)){
                return false;
            }
            else if(value != (secondWordMap.get(key))){
                return false;
            }
        }

        return true;
    }
}
