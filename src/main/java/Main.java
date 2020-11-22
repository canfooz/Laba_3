/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.0
 *  Main class
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Stopwatch.additionTime(arrayList);
        Stopwatch.additionTime(linkedList);
        Stopwatch.gettingTimeEnd(arrayList);
        Stopwatch.gettingTimeEnd(linkedList);
        Stopwatch.gettingTimeMid(arrayList);
        Stopwatch.gettingTimeMid(linkedList);
        Stopwatch.gettingTimeBegin(arrayList);
        Stopwatch.gettingTimeBegin(linkedList);
        Stopwatch.removingTimeEnd(arrayList);
        Stopwatch.removingTimeEnd(linkedList);
        Stopwatch.removingTimeMid(arrayList);
        Stopwatch.removingTimeMid(linkedList);
        Stopwatch.removingTimeBegin(arrayList);
        Stopwatch.removingTimeBegin(linkedList);
    }
}
