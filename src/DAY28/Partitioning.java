package DAY28;

public class Partitioning {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(s, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(String s, int start, List<String> list) {

        if (start == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            if (isPalindrome(s, start, end)) {

                list.add(s.substring(start, end + 1));
                backtrack(s, end + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}