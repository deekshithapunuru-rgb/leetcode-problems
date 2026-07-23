class Solution {

    public boolean isValid(String s) {

        // Convert string into character array
        char[] arr = s.toCharArray();

        // Stack for brackets
        Stack<Character> st = new Stack<>();

        // Traverse all characters
        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];

            // Opening brackets
            if (ch == '(' ||
                ch == '{' ||
                ch == '[') {

                st.push(ch);

            } else {

                // No matching opening bracket
                if (st.isEmpty()) {

                    return false;
                }

                // Remove top element
                char top = st.pop();

                /*
                 * Check matching pair
                 */

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        // Valid only if stack becomes empty
        return st.isEmpty();
    }
}
