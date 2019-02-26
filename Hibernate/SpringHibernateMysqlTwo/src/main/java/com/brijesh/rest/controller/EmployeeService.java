package com.brijesh.rest.controller;

import com.brijesh.common.CompanyConstants;
import com.brijesh.rest.model.request.EmployeeReqResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface EmployeeService {

    public List<EmployeeReqResp> getEmployeeDetails();


}
