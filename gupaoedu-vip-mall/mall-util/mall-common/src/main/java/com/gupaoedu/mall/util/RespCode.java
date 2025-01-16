package com.gupaoedu.mall.util;

/**
 * @author 1
 * @since 2025/1/13
 */
public enum RespCode {

    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    SYSTEM_ERROR(501, "系统错误");

    private Integer code;
    private String message;

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    RespCode() {
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
