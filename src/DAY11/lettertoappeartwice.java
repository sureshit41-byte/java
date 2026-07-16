package DAY11;

public class lettertoappeartwice {
    public char repeatedCharacter(String s) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            count[ch - 'a']++;

            if (count[ch - 'a'] == 2) {
                return ch;
            }
        }

        return ' ';
    }
}