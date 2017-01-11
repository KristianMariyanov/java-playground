package arrays;

/**
This is solution of the TopCoder  task

Problem Statement for arrays.AlternatingString

Problem Statement
    	A string of zeros and ones is called an alternating string if no two adjacent characters are the same. Examples of alternating strings: "1", "10101", "0101010101".


You are given a String s. Each character of s is a '0' or a '1'. Please find the longest contiguous substring of s that is an alternating string. Return the length of that substring.

Definition

Class:	arrays.AlternatingString
Method:	maxLength
Parameters:	String
Returns:	int
Method signature:	int maxLength(String s)
(be sure your method is public)


Constraints
-	s will contain between 1 and 50 characters, inclusive.
-	Each character in s will be '0' or '1'.

Examples
0)

"111101111"
Returns: 3
Among all substrings, there are 5 different alternating strings: "1", "0", "10", "01", "101". The one with maximal length is "101" and the length is 3.
1)

"1010101"
Returns: 7
The string s itself is an alternating string.
2)

"000011110000"
Returns: 2
Note that a substring must be contiguous. The longest alternating substrings of this s are "01" and "10". The string "010" is not a substring of this s.
3)

"1011011110101010010101"
Returns: 8
4)

"0"
Returns: 1

Link: https://community.topcoder.com/stat?c=problem_statement&pm=14460&rd=16848&rm=&cr=40380858
*/

public class AlternatingString {
    public static void main(String[] args) {
        int result = maxLength("111101111");
        System.out.println(result);
    }

    public static int maxLength(String s) {
        int max = 1;
        int current = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                current ++;
                if (current > max) {
                    max = current;
                }
                continue;
            }
            current = 1;
        }
        return max;
    }
}
