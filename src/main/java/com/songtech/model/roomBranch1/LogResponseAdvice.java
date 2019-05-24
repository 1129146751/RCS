package com.songtech.model.roomBranch1;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created with IDEA
 *
 * @author:fengxu Date:2019/4/17
 * Time:17:05
 **/
@ControllerAdvice(basePackages = "cc.openwiki.controller.biz")
public class LogResponseAdvice implements ResponseBodyAdvice<Object> {

    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }


    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //log.info("返回值为:{}", JSON.toJSONString(body));
        return body;
    }
}