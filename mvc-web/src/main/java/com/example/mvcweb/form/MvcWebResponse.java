package com.example.mvcweb.form;

import com.example.mvcweb.enumer.BaseResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MvcWebResponse {

    private Integer statusCode;

    private String message;

    private Object data;

    public static MvcWebResponse success(Object data){
        return new MvcWebResponse(BaseResponseEnum.SUCCESS.getStatusCode(), BaseResponseEnum.SUCCESS.getMessage(), data);
    }

    public static MvcWebResponse error(){
        return new MvcWebResponse(BaseResponseEnum.ERROR.getStatusCode(), BaseResponseEnum.ERROR.getMessage(), null);
    }
}
