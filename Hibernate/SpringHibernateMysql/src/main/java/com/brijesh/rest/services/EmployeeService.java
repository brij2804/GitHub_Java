package com.brijesh.rest.services;

import com.brijesh.common.CompanyConstants;
import com.brijesh.rest.model.request.EmployeeReqResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface EmployeeService {

    @RequestMapping(value = CompanyConstants.EMPLOYEE_SERVICE,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeReqResp> getEmployeeDetails();


}
