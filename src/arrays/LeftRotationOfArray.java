package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotationOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = scanner.nextInt();
        int rotationCount = scanner.nextInt();

        int[] inputElements = new int[elementsCount];

        for (int i = 0; i < elementsCount; i++) {
            inputElements[i] = scanner.nextInt();
        }

        int[] result = rotate(inputElements, rotationCount);

        System.out.println(result);
    }

    private static int[] rotate(int[] inputElements, int rotations) {
        List<Integer> result = Arrays.stream(inputElements).boxed().collect(Collectors.toList());

        int rotationCount = rotations % inputElements.length;
        int[] oldValues = new int[rotationCount];
        for (int i = 0; i < rotationCount; i++) {
            oldValues[i] = result.remove(0);
        }

        for(int val: oldValues) {
            result.add(val);
        }

        int[] arrayResult = result.stream().mapToInt(Integer::intValue).toArray();

        return arrayResult;
    }
}
