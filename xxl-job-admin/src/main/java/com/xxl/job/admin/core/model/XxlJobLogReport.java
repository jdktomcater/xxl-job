package com.xxl.job.admin.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class XxlJobLogReport {

    private int id;

    private Date triggerDay;

    private int runningCount;
    private int sucCount;
    private int failCount;

}
