package com.demo.task.service;


import com.demo.task.dto.Student;

import java.util.List;

/**
 *
 * Sorter for Student
 */
public interface StudentSorter {


    /**
     * Sorts input list, based on sortName provided, return sorted list.
     * Sort type supported [Bubble, Heap, Merge]
     * input should be validated before using this method.
     * @param unSortedInput
     * @param sortName
     * @return
     */
    List<Student> sortStudents(List<Student> unSortedInput, String sortName);
}
