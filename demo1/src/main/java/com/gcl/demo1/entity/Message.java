package com.gcl.demo1.entity;

/**
 * @author 小关同学
 * @create 2021/8/7
 * 浏览器发送给服务器的WebSocket数据
 */
public class Message {
    private String toName;
    private String message;

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
