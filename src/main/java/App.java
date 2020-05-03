import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = 
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld been1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beenCat = (Cat) applicationContext.getBean("cat");
        Cat beenCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == been1);
        System.out.println(beenCat == beenCat1);
    }
}