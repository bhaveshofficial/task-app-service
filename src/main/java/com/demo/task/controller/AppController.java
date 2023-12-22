package com.demo.task.controller;


import com.demo.task.dto.Student;
import com.demo.task.service.StudentSorter;
import com.demo.task.util.AppUtil;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.demo.task.constant.AppConstant.HEALTH;
import static com.demo.task.constant.AppConstant.SORT_STUDENTS;

/**
 * App Controller
 */
@RestController
@CommonsLog
public class AppController {

    @Autowired
    private StudentSorter studentSorter;


    @GetMapping(HEALTH)
    public String getHealth() {
        return "Up";
    }


    /**
     * Accepts multipart file, string sortName as inputs
     * @param studentDataFile
     * @param sortName
     * @return
     * @throws IOException
     * todo include sort time in response
     */
    @PostMapping(SORT_STUDENTS)
    public List<Student> sortStudents(@RequestPart("studentDataFile") @NonNull MultipartFile studentDataFile, @RequestPart(
            "sortName") @NonNull String sortName) throws IOException {
        File inputFile = new File("src/main/resources/tempStudentData.txt");
        studentDataFile.transferTo(inputFile);
        if (AppUtil.validateInputForSorting(inputFile, sortName)) {
            log.info("Received sorting request");
            return this.studentSorter.sortStudents(AppUtil.transformInputFileToList(inputFile), sortName);
        }
        else {
            //todo throw error
            return new ArrayList<>();
        }

    }


}
