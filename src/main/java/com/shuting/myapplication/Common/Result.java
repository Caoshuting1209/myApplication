package com.shuting.myapplication.Common;

import lombok.Data;

@Data
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public Result(T data, Constants constants){
        this.code = constants.getCode();
        this.msg = constants.getMsg();
        this.data = data;
    }

    public Result(Constants constants, String msg){
        this.code = constants.getCode();
        this.msg = msg;
    }
}

