import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("helloworld beans are the same: " + (bean == bean1));
        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println("cat beans are the same: " + (catBean == catBean1));
    }
}