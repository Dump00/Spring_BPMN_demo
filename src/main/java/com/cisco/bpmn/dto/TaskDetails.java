package com.cisco.bpmn.dto;

import liquibase.pro.packaged.P;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDetails {
    private String taskId;
    private String taskName;
    private Map<String, Object> taskData;
}
