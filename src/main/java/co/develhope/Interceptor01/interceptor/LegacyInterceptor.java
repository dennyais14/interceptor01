package co.develhope.Interceptor01.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LegacyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().startsWith("/legacy")) {
            response.setStatus(HttpServletResponse.SC_GONE);
            response.getWriter().write("The legacy endpoint has been removed.");
            return false;
        }
        return true;
    }
}
