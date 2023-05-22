package com.project.dla.responses;

import lombok.Data;

@Data
public class ResponseAPI {
    private int code;
    private String messages;
    private Object result;
    private Object additionalEntity;
}
