/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.0
 *  Сlass for calculating the execution time of methods a certain number of times
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Stopwatch {

    /** Number of list elements field */
    static int m = 100000;

    /** Maximum value of a random number field */
    static int k = 100;

    /**
     * @return a random number
     */
    static int getRandomNumber() {
        return (int) ((Math.random() * k));
    }

    /**
     * Overloaded method
     * Outputs the .add method execution time to the console
     * for the required list type
     * for a certain number of cycles
     */
    static void additionTime(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m; i++) {
            list.add(getRandomNumber());
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".add time for ArrayList(" + m + " cases) = " + finalTime + "ms");
    }

    static void additionTime(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m; i++) {
            list.add(getRandomNumber());
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".add time for LikedList(" + m + " cases) = " + finalTime + "ms");
    }
    /**
     * Overloaded method
     * Outputs the .get method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the end of the list
     */
    static void gettingTimeEnd(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time from the end for ArrayList(" + m/2 + " cases) = " + finalTime + "ms");
    }

    static void gettingTimeEnd(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time from the end for LinkedList(" + m/2 + " cases) = " + finalTime + "ms");
    }

    /**
     * Overloaded method
     * Outputs the .get method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the middle of the list
     */
    static void gettingTimeMid(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = m / 4; i < m / 2; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time from the middle for ArrayList(" + m/4 + " cases) = " + finalTime + "ms");
    }

    static void gettingTimeMid(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = m / 4; i < m / 2; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time from the middle for LikedList(" + m/4 + " cases) = " + finalTime + "ms");
    }

    /**
     * Overloaded method
     * Outputs the .get method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the beginning of the list
     */
    static void gettingTimeBegin(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m / 4; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time for from the beginning ArrayList(" + m/4 + " cases) = " + finalTime + "ms");
    }


    static void gettingTimeBegin(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m / 4; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".get time for from the beginning LinkedList(" + m/4 + " cases) = " + finalTime + "ms");
    }

    /**
     * Overloaded method
     * Outputs the .remove method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the end of the list
     */
    static void removingTimeEnd(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time from the end for ArrayList(" + m/2 + " cases) = " + finalTime + "ms");
    }

    static void removingTimeEnd(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time from the end for LinkedList(" + m/2 + " cases) = " + finalTime + "ms");
    }

    /**
     * Overloaded method
     * Outputs the .remove method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the middle of the list
     */
    static void removingTimeMid(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = m / 8; i < m / 4; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time from the middle for ArrayList(" + m/8 + " cases) = " + finalTime + "ms");
    }

    static void removingTimeMid(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = m / 8; i < m / 4; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time from the middle for LikedList(" + m/8 + " cases) = " + finalTime + "ms");
    }

    /**
     * Overloaded method
     * Outputs the .remove method execution time to the console
     * for the required list type
     * for a certain number of cycles
     * from the beginning of the list
     */
    static void removingTimeBegin(ArrayList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m/8; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time for from the beginning ArrayList(" + m/8 + " cases) = " + finalTime + "ms");
    }


    static void removingTimeBegin(LinkedList<Integer> list) {

        Date startTime = new Date();

        for (int i = 0; i < m/8; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        System.out.println(".remove time for from the beginning LinkedList(" + m/8 + " cases) = " + finalTime + "ms");
    }
}

