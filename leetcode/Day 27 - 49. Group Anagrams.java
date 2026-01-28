/**
- LeetCode Journey - Day 27
-
- Problem Name:
  Group Anagrams
-
- Difficulty:
  Medium
-
- Problem:
  Given an array of strings, group the anagrams together.
  An anagram has the same characters with the same frequency but in different order.
-
- LeetCode Link:
  https://leetcode.com/problems/group-anagrams/
-
- Approach:
    - Step 1:
      Create a HashMap where the key is the sorted version of a word
      and the value is a list of words that match that sorted form.
      
    - Step 2:
      For each word in the array:
        - Convert it to a character array
        - Sort the array
        - Convert it back to a string (this becomes the key)
        
    - Step 3:
      Insert the original word into the map under its sorted key.
      Finally, return all the grouped values from the map.
-
- Time Complexity:
  O(n * k log k)
  where n = number of strings, k = average length of a string
-
- Space Complexity:
  O(n * k)
  for storing the grouped anagrams
*/

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String wrd : strs) {
            char[] arr = wrd.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(wrd);
        }

        return new ArrayList<>(map.values());
    }
}
