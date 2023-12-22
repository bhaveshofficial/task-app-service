package com.demo.task.service;


import com.demo.task.dto.Student;
import com.demo.task.util.StudentSortUtil;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.demo.task.constant.AppConstant.*;


/**
 * Basic student sorter, implements ${@link StudentSorter}
 */
@Service("basicStudentSorter")
@CommonsLog
public class BasicStudentSorter implements StudentSorter{


    @Override
    public List<Student> sortStudents(List<Student> unSortedInput, String sortName) {
        log.info("Sorting with " + sortName + "sort Type");
        List<Student> result = new ArrayList<>();
        switch (sortName){
            case BUBBLE_SORT:
                result = StudentSortUtil.bubbleSort(unSortedInput);
                break;
            case MERGE_SORT:
                result = StudentSortUtil.mergeSort(unSortedInput);
                break;
            case HEAP_SORT:
                result = StudentSortUtil.heapSort(unSortedInput);
        }

        return  result;
    }
}
