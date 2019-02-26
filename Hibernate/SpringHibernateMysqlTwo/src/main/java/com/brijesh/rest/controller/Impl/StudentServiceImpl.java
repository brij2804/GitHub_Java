package com.brijesh.rest.controller.Impl;

import com.brijesh.common.CompanyConstants;
import com.brijesh.exception.CollegeException;
import com.brijesh.rest.model.request.StudentReqResp;
import com.brijesh.rest.controller.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {

    }

    @RequestMapping(value = CompanyConstants.STUDENT_SERVICE,
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<StudentReqResp> getStudentDetails(@RequestBody StudentReqResp studentRequest) throws CollegeException {
        List<StudentReqResp> studentList = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CompanyConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentList;
    }

    @RequestMapping(
            value = CompanyConstants.STUDENT_SERVICE_FOR_ID,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentReqResp getStudentInfo(@PathVariable("id") String studentId) throws CollegeException {
        StudentReqResp studentResp = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CompanyConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentResp;
    }
}
