package com.xiaohu.zhixuan.VO;

public class ResultVO {
    //错误码
    private int code;
    //错误原因
    private String error;
    //备注
    private String message;
    //携带信息
    private String data;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
