package co.develhope.Interceptor01.configuration;

import co.develhope.Interceptor01.interceptor.APILoggingInterceptor;
import co.develhope.Interceptor01.interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new APILoggingInterceptor());
        registry.addInterceptor(new LegacyInterceptor());
    }
}
