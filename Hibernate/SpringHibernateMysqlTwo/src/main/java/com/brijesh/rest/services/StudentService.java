package com.brijesh.rest.services;

import com.brijesh.common.CompanyConstants;
import com.brijesh.exception.CollegeException;

import com.brijesh.rest.model.request.StudentReqResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface StudentService {

    @RequestMapping(value = CompanyConstants.STUDENT_SERVICE,
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<StudentReqResp> getStudentDetails(@RequestBody StudentReqResp studentReqResp) throws CollegeException;

    @RequestMapping(
            value = CompanyConstants.STUDENT_SERVICE_FOR_ID,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentReqResp getStudentInfo(@PathVariable("id") String studentId) throws CollegeException;
}
