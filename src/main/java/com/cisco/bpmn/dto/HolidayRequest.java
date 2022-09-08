package com.cisco.bpmn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HolidayRequest {
    private String empName;
    private Long noOfHolidays;
    private String requestDescription;
}
