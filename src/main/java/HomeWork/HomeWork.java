package HomeWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeWork {
    public static void main(String[] args) {
        //ApplicationContext context =new AnnotationConfigApplicationContext();
        //Patient patient = context.getBean(Patient.class);
        //Registry registry=context.getBean(Registry.class);
        //registry.setRequestFromPatient(patient);
        Patient patient= new Patient();
        Registry registry=new Registry();
        registry.setRequestFromPatient(patient);
    }
}
