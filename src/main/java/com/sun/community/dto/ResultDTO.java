package com.sun.community.dto;

import com.sun.community.exception.CustomizeErrorCode;
import com.sun.community.exception.CustomizeException;
import lombok.Data;

/**
 * @author SunTong
 * @date 2020/4/5 2:32
 * @desc
 */
@Data
public class ResultDTO {

    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code,String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功！");
        return resultDTO;
    }

    public static Object errorOf(CustomizeException ex) {

        return errorOf(ex.getCode(), ex.getMessage());
    }
}
