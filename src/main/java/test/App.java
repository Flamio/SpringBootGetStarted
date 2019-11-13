package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(App.class);
        TestClass testClass = (TestClass) context.getBean("testClass");
        System.out.println(testClass.test());
    }
}
