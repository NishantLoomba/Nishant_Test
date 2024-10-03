package ClassRoom;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.print("Odd = ");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) % 2 != 0) {
                System.out.print( key + " ");
            }
        }
        System.out.println();
        System.out.print("Even = ");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) % 2 == 0) {
                System.out.print( key + " ");
            }
        }
    }
}
