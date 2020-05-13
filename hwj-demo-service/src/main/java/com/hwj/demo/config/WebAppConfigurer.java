package com.hwj.demo.config;

import com.hwj.demo.interceptor.AllWebMVCInterceptor;
import com.hwj.demo.interceptor.AllWebMVCInterceptor1;
import com.hwj.demo.interceptor.AllWebMVCInterceptor3;
import com.hwj.demo.interceptor.ApiDPInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(allWebMVCInterceptor);
        registry.addInterceptor(ApiDPInterceptor);
//        registry.addInterceptor(allWebMVCInterceptor).addPathPatterns("/**");
//        registry.addInterceptor(allWebMVCInterceptor1).addPathPatterns("/**");
//        registry.addInterceptor(allWebMVCInterceptor3).addPathPatterns("/**");
    }

    @Autowired
    private AllWebMVCInterceptor allWebMVCInterceptor;
    @Autowired
    private AllWebMVCInterceptor1 allWebMVCInterceptor1;
    @Autowired
    private AllWebMVCInterceptor3 allWebMVCInterceptor3;
    @Autowired
    private ApiDPInterceptor ApiDPInterceptor;

}
