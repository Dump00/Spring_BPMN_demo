package com.cisco.bpmn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessInstanceResponse {
    private String processId;
    private boolean isEnded;
}
