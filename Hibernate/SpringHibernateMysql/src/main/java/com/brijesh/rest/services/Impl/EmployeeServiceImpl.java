package com.brijesh.rest.services.Impl;

import com.brijesh.persistence.dataservice.IEmployeeDataService;
import com.brijesh.persistence.model.Employee;
import com.brijesh.rest.model.request.EmployeeReqResp;
import com.brijesh.rest.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    IEmployeeDataService employeeDataService;

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

}
