package com.gcl.demo1.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gcl.demo1.entity.ResultMessage;

/**
 * @author 小关同学
 * @create 2021/8/7
 * 用来封装消息的工具类
 */
public class MessageUtils {
    /**
     * 封装消息
     * @param isSystemMessage 判断是系统消息还是个人消息
     * @param fromName 推送给个人的用户名字
     * @param message 消息内容
     * @return 返回封装好的消息
     */
    public static String getMessage(boolean isSystemMessage,String fromName,Object message){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setIsSystem(isSystemMessage);
        resultMessage.setMessage(message);
        if (fromName!=null){
            resultMessage.setFromName(fromName);
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            //将服务器返回给浏览器的信息转换成Json格式的字符串返回
            return mapper.writeValueAsString(resultMessage);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
