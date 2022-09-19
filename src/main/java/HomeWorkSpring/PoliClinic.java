package HomeWorkSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PoliClinic {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Создана поликлиника");
        HomeWorkSpring.Registry registry=context.getBean(HomeWorkSpring.Registry.class);
        HomeWorkSpring.Patient patient= context.getBean("patient",HomeWorkSpring.Patient.class);
        System.out.println();
        System.out.println("В поликлинику пришел пациент");
        System.out.println();
        registry.setRequestFromPatient(patient);
    }
}
