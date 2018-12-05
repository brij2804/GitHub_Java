package com.brijesh.business;

import com.brijesh.constants.ErrorConstants;
import com.brijesh.exception.CustomException;

public class BusinessClass {

    public void method1(){
        try{
            businessProcessing();
        }catch(CustomException cx){
            System.out.println("Method1 catch : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
        }
    }

    public void businessProcessing() throws  CustomException{
        try{
            callRestService();
        }catch(CustomException cx){
            System.out.println("businessProcessing catch : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
            throw new CustomException(ErrorConstants.ERROR_CODE_5," error occurred : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
        }
    }

    public void callRestService() throws CustomException{
        try{
          createRequestJson();
        }catch(CustomException cx){
            System.out.println("callRestService catch : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
            throw new CustomException(ErrorConstants.ERROR_CODE_4," error occurred : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
        }
    }

    public void createRequestJson() throws CustomException{
        try{
            getMapping();
        }catch(CustomException cx){
            System.out.println("createRequestJson catch : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
            throw new CustomException(ErrorConstants.ERROR_CODE_3," error occurred : error code = "+cx.getErrorCode()+" : error message = "+cx.getMessage());
        }
    }

    public void getMapping() throws CustomException{
        try{
            if(true){
                throw new NullPointerException("dummy null pointer: mapping not found.");
            }
        }catch(Exception cx){
            System.out.println("getMapping catch : error message = "+cx.getMessage());
            throw new CustomException(ErrorConstants.ERROR_CODE_2," error occurred : error message = "+cx.getMessage());
        }
    }
}
