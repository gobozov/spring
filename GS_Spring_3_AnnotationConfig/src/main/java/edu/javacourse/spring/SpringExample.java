package edu.javacourse.spring;

import edu.javacourse.spring.bean.SimpleBean1;
import edu.javacourse.spring.bean.SimpleBean2;
import edu.javacourse.spring.bean.SimpleInterface;
import edu.javacourse.spring.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class SpringExample {

    public static void main(String[] args) {
        SpringExample se = new SpringExample();
        se.demoSpring();
    }

    public void demoSpring() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // В данном примере создается несколько бинов, но ни один из них не описан в XML, все бины описаны через аннотации

//        ApplicationConfig applicationConfig = ctx.getBean(ApplicationConfig.class);
//        applicationConfig.getSimpleBean2().methodForSecond();

        SimpleBean1 sb1 = ctx.getBean(SimpleBean1.class);
        sb1.methodForFirst();

        SimpleBean2 sb2 = ctx.getBean(SimpleBean2.class);
        sb2.methodForSecond();
        
        SimpleInterface si1 = ctx.getBean(SimpleInterface.class);
        si1.sayHello();

        DataSource dataSource = (DataSource)ctx.getBean("datasourse");
        System.out.println("dataSource = " + dataSource);
    }
}
