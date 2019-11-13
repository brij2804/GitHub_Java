package com.brijesh.exception;

public class CustomException extends Exception{

    private String errorCode;

    public CustomException(String errorMessage){
        super(errorMessage);
    }
    public CustomException(String errorCode,String errorMessage){
        super(errorMessage);
        this.errorCode= errorCode;
    }
    public CustomException(Throwable th){
        super(th);
    }
    public CustomException(String errorCode,String errorMessage,Throwable th){
       super(errorMessage,th);
       this.errorCode= errorCode;
    }
    public CustomException(String errorMessage,Throwable th){
        super(errorMessage,th);
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
