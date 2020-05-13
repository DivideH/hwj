package com.hwj.demo.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:
 */
@Component
public class AllWebMVCInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //进入controller之前
        if (handler instanceof Method){
            System.out.println(true);
        }
        System.out.println("i am 1");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        //处理modelAndView
        System.out.println("i am 2");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        //清理资源处理
        System.out.println("i am 3");
    }

    //特许情况 后面preHandle不执行 postHandle全部不执行(dispatchServlet认为完成了请求的处理，渲染了合适的视图，因此不执行后面的拦截器，逆向执行的postHandle也处理（合适视图）只执行afterCompletion资源清理处理)，逆向返回所有true的afterCompletion
    //当拦截器非正常执行完成时，会直接跳过所有拦截器的postHandle()函数，然后再逆向的执行preHandle()函数返回为true时的afterCompletion()方法。
}
