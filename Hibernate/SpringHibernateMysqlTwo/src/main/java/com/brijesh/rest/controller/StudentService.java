package com.brijesh.rest.controller;

import com.brijesh.common.CompanyConstants;
import com.brijesh.exception.CollegeException;

import com.brijesh.rest.model.request.StudentReqResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentService {

    public List<StudentReqResp> getStudentDetails(StudentReqResp studentReqResp) throws CollegeException;

    public StudentReqResp getStudentInfo(String studentId) throws CollegeException;
}
