package com.gcl.demo1.entity;

/**
 * @author 小关同学
 * @create 2021/8/7
 * 用于登录响应回给浏览器的数据
 */
public class Result {
    //登录的用户名和密码是否正确
    private boolean flag;
    //提示信息
    private String message;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
