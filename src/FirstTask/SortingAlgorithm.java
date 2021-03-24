package FirstTask;

import java.util.Map;
import java.util.TreeMap;

public class SortingAlgorithm {
    static int[] array = new int[] {55, 11, 1, 2, 1, 2 ,2 ,2 ,4 , 6, 8, 8, 8, 8, 9, 5, 4, 4, 5, 3, 3, 4, 5, 6, 7 ,8 ,9 , 10};
    static Map<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        for (int i : array) {
            map.merge(i, 1, Integer::sum);
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
