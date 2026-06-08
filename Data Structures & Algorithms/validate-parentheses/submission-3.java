class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();

                        break;
                    }
                    return false;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();

                        break;
                    }
                    return false;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();

                        break;
                    }
                    return false;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
