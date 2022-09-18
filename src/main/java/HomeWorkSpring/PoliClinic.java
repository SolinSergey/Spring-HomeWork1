package HomeWorkSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PoliClinic {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        HomeWorkSpring.Patient patient= context.getBean("patient",HomeWorkSpring.Patient.class);
       // Registry registry=context.getBean(Registry.class);
    }
}
