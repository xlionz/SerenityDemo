package com.co.challenge.cer.serenitydemo.enums;

public enum MsgError {

    MSG_ERROR_TEXT("El texto: \"%s\", no es igual al obtenido:\"%s\"");

    private String msg;

    MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
