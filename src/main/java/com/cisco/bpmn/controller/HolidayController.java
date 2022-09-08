package com.cisco.bpmn.controller;

import com.cisco.bpmn.service.HolidayService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolidayController {

    private HolidayService holidayService;

    @PostMapping("/deploy")
    public void deployWorkflow() {
        holidayService.deployProcessDefinition();
    }
}
