package com.pxp.subjectdetails.controller;

import com.pxp.subjectdetails.model.Subjects;
import com.pxp.subjectdetails.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "subject/{rollno}", method = RequestMethod.GET)
    public Subjects getSubject(@PathVariable int rollno){
        return subjectService.listOfSubjects(rollno);
    }
}
