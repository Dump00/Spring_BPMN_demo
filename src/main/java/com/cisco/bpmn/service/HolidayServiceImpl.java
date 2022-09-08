package com.cisco.bpmn.service;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.springframework.stereotype.Service;

@Service
public class HolidayServiceImpl implements HolidayService {

    public static final String TASK_CANDIDATE_GROUP = "managers";
    public static final String PROCESS_DEFINITION_KEY = "holidayRequest";
    public static final String EMP_NAME = "empName";

    RepositoryService repositoryService;
    TaskService taskService;
    ProcessEngine processEngine;
    RuntimeService runtimeService;

    @Override
    public void deployProcessDefinition() {
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("holiday-request.bpmn20.xml")
                .deploy();
    }
}
