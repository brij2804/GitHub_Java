package com.brijesh.services.Impl;

import com.brijesh.common.CollegeConstants;
import com.brijesh.exception.CollegeException;
import com.brijesh.model.request.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
public interface StudentService {
    @RequestMapping(value = CollegeConstants.STUDENT_SERVICE, method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void getStudentDetails(@RequestBody StudentRequest studentRequest) throws CollegeException;
}
