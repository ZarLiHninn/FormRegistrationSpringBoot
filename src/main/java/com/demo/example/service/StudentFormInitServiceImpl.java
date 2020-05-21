package com.demo.example.service;

import com.demo.example.constant.Grade;
import com.demo.example.constant.Subject;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StudentFormInitServiceImpl implements StudentFormInitService {

    private final int termForBirthYear = 30;

    @Override
    public StudentFormInitOutput init() {
        // 誕生年は （表示する年 - 30） ~ 表示する年 まで
        Integer fromYear = LocalDate.now().getYear() - termForBirthYear;
        Integer toYear   = LocalDate.now().getYear();
        Set<Integer> birthYears  = IntStream.rangeClosed(fromYear, toYear).boxed().collect(Collectors.toSet());
        Set<Integer> birthDays   = IntStream.rangeClosed(1, 31).boxed().collect(Collectors.toSet());
        Set<Integer> birthMonths = IntStream.rangeClosed(1, 12).boxed().collect(Collectors.toSet());
        Set<String>  subjects    = Arrays.stream(Subject.values()).map(Subject::getValue).collect(Collectors.toSet());
        Set<String>  grade       = Arrays.stream(Grade.values()).map(Grade::name).collect(Collectors.toSet());

        // これはBuilder Patternですが、今回のデモアプリでは使わなくていいです。
        return new StudentFormInitOutput.Builder()
                    .birthDays(birthDays)
                    .birthMonths(birthMonths)
                    .birthYears(birthYears)
                    .subjects(subjects)
                    .grades(grade)
                    .build();
    }
}
