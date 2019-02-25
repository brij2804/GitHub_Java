package com.brijesh.business;

import com.brijesh.exception.CollegeException;
import com.brijesh.rest.model.request.StudentReqResp;


public interface ProcessStudentInfo {

    public StudentReqResp getStudentInfo(StudentReqResp studentRequest) throws CollegeException;
}
