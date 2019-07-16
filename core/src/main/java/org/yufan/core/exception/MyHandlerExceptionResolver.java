package org.yufan.core.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
        String msg;

        if(exception instanceof CustomerException) {
            msg=exception.getMessage();
        } else {
            exception.printStackTrace();
            msg="对不起，系统开小差了！";
        }

        // TODO 返回json数据怎么办

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
