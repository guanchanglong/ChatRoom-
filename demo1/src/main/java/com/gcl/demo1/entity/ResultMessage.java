package com.gcl.demo1.entity;

/**
 * @author 小关同学
 * @create 2021/8/7
 * 服务器发送给浏览器的WebSocket数据
 */
public class ResultMessage {
    //为true表示为系统消息，如果为false则不是系统消息
    private boolean isSystem;
    private String fromName;
    private Object message;//如果系统信息是数组

    public boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
