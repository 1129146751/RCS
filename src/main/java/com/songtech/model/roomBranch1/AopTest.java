package com.songtech.model.roomBranch1;



import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IDEA
 *
 * @author:fengxu Date:2019/4/10
 * Time:14:30
 **/
@Aspect
@Component

public class AopTest {
    private Logger log = Logger.getLogger(AopTest.class);

    @Pointcut(value = "execution(* *.*(..))")
    public void pointCutMethod() {

    }

    @Before(value = "pointCutMethod()")
    public void beforeMethod() {
        System.out.println("----------开始");
    }

    @After(value = "pointCutMethod()")
    public void afertMethod() {
        System.out.println("----------j结束");
    }
    @Around(value="pointCutMethod()")
    public void afterReturn(ProceedingJoinPoint pjp)  throws Throwable{
        System.out.println("------------------------注解类型环绕通知..环绕前");
                 pjp.proceed();//执行方法
                 System.out.println("注解类型环绕通知..环绕后");
             }
}
