

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setup() {
    solution = new Solution();
  }

  @Test
  public void lengthOfLongestSubstringTest() {
    int result = solution.lengthOfLongestSubstring("pwwkew");

    assertEquals(3, result);
  }
}
