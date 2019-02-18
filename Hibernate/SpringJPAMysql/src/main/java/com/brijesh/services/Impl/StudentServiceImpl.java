package com.brijesh.services.Impl;

import com.brijesh.common.CollegeConstants;
import com.brijesh.exception.CollegeException;
import com.brijesh.model.request.StudentReqResp;
import com.brijesh.services.StudentService;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {

    }

    public StudentReqResp getStudentDetails(StudentReqResp studentRequest) throws CollegeException {
        StudentReqResp studentResponse = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CollegeConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentResponse;
    }
}
