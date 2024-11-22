package com.shuting.myapplication.Common;

import lombok.Getter;

@Getter
public enum Constants {
    SUCCESS("200", "success"),
    ERROR("500", "error"),
    ;


    private String code;
    private String msg;
    Constants(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
