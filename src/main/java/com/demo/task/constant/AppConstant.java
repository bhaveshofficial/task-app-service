package com.demo.task.constant;


import java.util.List;

/**
 * Holds App wide constants (ex- uri string, const names, etc)
 */
public interface AppConstant {

    /**
     * URIs
     */
    String HEALTH = "health";
    String SORT_STUDENTS = "sortStudents";


    /**
     * const names
     */
    String BUBBLE_SORT = "Bubble";
    String HEAP_SORT = "Heap";
    String MERGE_SORT = "Merge";

    List<String> SORT_TYPES_SUPPORTED = List.of(BUBBLE_SORT, HEAP_SORT, MERGE_SORT) ;
}
