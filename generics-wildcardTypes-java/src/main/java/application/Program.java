package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    void main() {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
