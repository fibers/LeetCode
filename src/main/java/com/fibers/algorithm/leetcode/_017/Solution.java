package com.fibers.algorithm.leetcode._017;

import com.fibers.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public static void main(String[] args) {
        Solution s = new Solution();
        Utils.printList(s.letterCombinations("23"));
    }


    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() != 0) {
            backtrack(result, "", digits);
        }

        return result;
    }


    public void backtrack(List<String> result, String combination, String digits) {

        if (digits.length() == 0) {
            result.add(combination);
        } else {
            String d = digits.substring(0, 1);
            String letters = phone.get(d);

            for (int i = 0; i < letters.length(); i++) {
                backtrack(result, combination + letters.substring(i, i + 1), digits.substring(1));
            }
        }
    }
}

