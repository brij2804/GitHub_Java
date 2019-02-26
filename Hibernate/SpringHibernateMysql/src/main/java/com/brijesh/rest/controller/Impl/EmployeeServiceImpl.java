package com.brijesh.rest.controller.Impl;

//import com.brijesh.persistence.dataservice.IEmployeeDataService;
//import com.brijesh.persistence.model.Employee;

import com.brijesh.common.CompanyConstants;
import com.brijesh.persistence.dataservice.IEmployeeDataService;
import com.brijesh.persistence.model.Employee;
import com.brijesh.rest.model.request.EmployeeReqResp;
import com.brijesh.rest.controller.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    IEmployeeDataService employeeDataService;

    @RequestMapping(value = "/company/v1/employee",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeReqResp> getEmployeeDetails() {

        List<EmployeeReqResp> employeeReqRespsList = new ArrayList<>();

        for (Employee employee : employeeDataService.list()) {
            EmployeeReqResp employeeReqResp = new EmployeeReqResp();
            employeeReqResp.setId(employee.getId());
            employeeReqResp.setName(employee.getName());
            employeeReqRespsList.add(employeeReqResp);
        }
        return employeeReqRespsList;
    }

    @RequestMapping(value = "/company/v1/employee/one",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public EmployeeReqResp getEmployeeInfo() throws Exception {
        EmployeeReqResp employeeReqResp = new EmployeeReqResp();
        employeeReqResp.setName("John");
        return employeeReqResp;
    }

}
