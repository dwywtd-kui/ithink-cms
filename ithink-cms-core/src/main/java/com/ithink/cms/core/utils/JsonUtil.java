package com.ithink.cms.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author : hanliukui
 * @datetime : 2022-05-23 21:43
 * @description : description of this file
 */
public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();


    /**
     * 将对象转JSON 字符串
     * @param object 对象
     * @return 字符串
     */
    public static String toJsonString(Object object){
        String result = null;
        try {
            result = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 将JSON字符串转对象
     * @param jsonStr JSON 字符串
     * @param tClass 类class
     * @param <T> 泛型
     * @return 对象
     */
    public static <T> T readJson(String jsonStr,Class<T> tClass){
        T result = null;
        try {
            result =  mapper.readValue(jsonStr,tClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

}
