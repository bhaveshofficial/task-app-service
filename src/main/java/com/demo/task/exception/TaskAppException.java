package com.demo.task.exception;


public class TaskAppException extends Exception {

    private final int errorCode;
    private final String errorMessage;

    public TaskAppException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }



}
