package util;


import com.atguigu.crud.service1.DepartmentService1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created with IDEA
 *
 * @author:fengxu Date:2019/4/10
 * Time:14:39
 **/
@ControllerAdvice
public class TestUtil {
    @Test
    public void TestMethod(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("aop.xml");
        DepartmentService1 d=ap.getBean("departmentService1", DepartmentService1.class);
        System.out.
                println(d);
        d.pointCutMethod1();
        TestUtil.class.isAnnotationPresent(Autowired.class);
    }
}
