package com.demo.task.util;


import com.demo.task.dto.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.demo.task.constant.AppConstant.*;


public class AppUtil {

    public static boolean validateInputForSorting(File dataFile, String sortName) {
        return !(!SORT_TYPES_SUPPORTED.contains(sortName) || (Objects.isNull(dataFile) || dataFile.length() <= 0));
    }


    public static List<Student> transformInputFileToList(File inputFile) throws IOException {
        Optional<List<Student>> resultList;

        List<String> studentStringList = Files.readAllLines(Path.of(inputFile.getAbsolutePath()));

        resultList = Optional.of(studentStringList.stream().map(item -> {
            String[] parts = item.split(",");
            return new Student(parts[0], Double.valueOf(parts[1]));
        }).collect(Collectors.toList()));


        return resultList.orElse(new ArrayList<>());
    }
}
