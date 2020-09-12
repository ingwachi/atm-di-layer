package AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("annotationConfig.xml");
        AtmUI atmSimulator = context.getBean(AtmUI.class);
        atmSimulator.run();
    }
}

