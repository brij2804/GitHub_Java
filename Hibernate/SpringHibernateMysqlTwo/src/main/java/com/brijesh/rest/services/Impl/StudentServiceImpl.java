package com.brijesh.rest.services.Impl;

import com.brijesh.common.CompanyConstants;
import com.brijesh.exception.CollegeException;
import com.brijesh.rest.model.request.StudentReqResp;
import com.brijesh.rest.services.StudentService;


import java.util.List;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {

    }

    public List<StudentReqResp> getStudentDetails(StudentReqResp studentRequest) throws CollegeException {
        List<StudentReqResp> studentList = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CompanyConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentList;
    }

    public StudentReqResp getStudentInfo(String studentId) throws CollegeException {
        StudentReqResp studentResp = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CompanyConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentResp;
    }
}
