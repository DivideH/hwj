package com.hwj.demo.interceptor;

import com.hwj.demo.annotation.DemoAnnotation;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

/**
 * @Auther: heweijian
 * @Date: 2020/3/1
 * @Description:
 */
@Component
public class ApiDPInterceptor extends HandlerInterceptorAdapter {

    //object 如果是handlerMethod--》证明是springmvc访问的方法就是handlerMethod
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)){
            System.out.println("请求方式错误");
            return false;
        }
        HandlerMethod handler1 = (HandlerMethod) handler;
        DemoAnnotation methodAnnotation = handler1.getMethodAnnotation(DemoAnnotation.class);
        if (methodAnnotation !=null){
            System.out.println("存在自定义注解");
            int[] value = methodAnnotation.value();
            for (int i : value) {
                System.out.println(i);
            }
        }
//        MethodParameter[] methodParameters = handler1.getMethodParameters();
//        for (MethodParameter methodParameter : methodParameters) {
//            Parameter parameter = methodParameter.getParameter();
//        }
        return true;
    }
}
