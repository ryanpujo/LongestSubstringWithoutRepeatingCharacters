import java.util.HashSet;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> stringOccurences = new HashSet<>();
    int counter = 1;
    int longest = 0;
    for(int i = 0;i < s.length();i++) {
      stringOccurences.add(s.charAt(i));
      for(int j = i+1;j<s.length();j++) {
        if (stringOccurences.contains(s.charAt(j))) {
          break;
        }
        counter += 1;
        stringOccurences.add(s.charAt(j));
      }
      if (counter > longest) {
        longest = counter;
      }
      counter =1;
      stringOccurences.clear();
    }
    return longest;
  }
}
