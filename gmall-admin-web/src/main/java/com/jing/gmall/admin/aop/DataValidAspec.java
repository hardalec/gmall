package com.jing.gmall.admin.aop;

import com.jing.gmall.ums.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * 1. @Aspec
 * 2. 切入点表达式
 * 3. 通知
 *   前置通知
 *   后置通知
 *   返回通知
 *   异常通知
 *
 * 环绕通知 4和一
 */
@Slf4j
@Aspect
@Component
public class DataValidAspec {

    @Around("execution(* com.jing.gmall.admin..*Controller.*(..))")
//    @Around("execution(* com.company.controller.*.*(..))")
    public Object validAround(ProceedingJoinPoint point){
        Object proceed = null;
        try {
            Object[] args = point.getArgs();
            for (Object arg : args) {
                if(arg instanceof BindingResult){
                    BindingResult result = (BindingResult) arg;
                    if(result.getErrorCount() > 0){
                        return new CommonResult().validateFailed(result);
                    }
                }
            }
            log.debug("正在运行。。。");
            proceed = point.proceed();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }finally {
        }
        return proceed;
    }

}
