package HomeWorkSpring;

import HomeWork.HomeWork;
import HomeWork.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean (name = "patient")
    public HomeWorkSpring.Patient patient(){
        return new HomeWorkSpring.Patient();
    }
    //@Bean(name="registry")
    //public Registry registry(){
    //    Registry registry=new Registry();
    //    registry.setRequestFromPatient(patient());
    //    return registry;
    //}

}
