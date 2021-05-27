package com.pxp.subjectdetails.services;

import com.pxp.subjectdetails.model.Subjects;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SubjectService {

    public Subjects listOfSubjects(int rollno){
        List<Subjects> subjectsList = Arrays.asList(
                new Subjects(1, Arrays.asList("English", "Sanskrit", "Physics", "Chemistry", "Mathematics", "Biology")),
                new Subjects(2, Arrays.asList("English", "Geography", "History", "Economics", "Zoology"))
        );

        System.out.println("Called from intellij instance.");
        return subjectsList.stream().filter(s -> s.getRollNo() == rollno).findFirst().get();
    }
}
