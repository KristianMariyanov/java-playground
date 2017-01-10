package stacks;

/*
  You have an empty sequence, and you will be given N queries. Each query is one of these three types:

 1 x  -Push the element x into the stack.
 2    -Delete the element present at the top of the stack.
 3    -Print the maximum element in the stack.
 Input Format

 The first line of input contains an integer, N. The next N lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

 Constraints
 1 <= N <= n5
 1 <= x <= n9
 1 <= type <= 3

 Output Format

 For each type 3 query, print the maximum element in the stack on a new line.

 Sample Input

 10
 1 97
 2
 1 20
 2
 1 26
 1 20
 2
 3
 1 91
 3
 Sample Output

 26
 91
 */

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        SortedMap<Integer, Integer> sortedElements = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
                int elementForAdding = scanner.nextInt();
                stack.push(elementForAdding);

                if (sortedElements.containsKey(elementForAdding)) {
                    sortedElements.replace(elementForAdding, sortedElements.get(elementForAdding)+1);
                } else {
                    sortedElements.put(elementForAdding, 1);
                }
            } else if (query == 2) {
                Integer elementsForRemove = stack.pop();
                Integer value = sortedElements.get(elementsForRemove);
                if (value != 1){
                    sortedElements.replace(elementsForRemove, value - 1);
                } else {
                    sortedElements.remove(elementsForRemove);
                }
            } else if (query == 3) {
                System.out.println(sortedElements.lastKey());
            }
        }
    }
}
