package com.demo.task.util;

import com.demo.task.dto.Student;

import java.util.Collections;
import java.util.List;

public class StudentSortUtil {

    private StudentSortUtil() {
    }

    public static List<Student> bubbleSort(List<Student> input) {

        //todo impl bubble sort

        return input;
    }

    public static List<Student> mergeSort(List<Student> input) {

        Collections.sort(input, (s1, s2) -> (int) (s2.getScore() - s1.getScore()));
        return input;

    }

    public static List<Student> heapSort(List<Student> input) {
        //todo impl heap sort
        return input;

    }
}
