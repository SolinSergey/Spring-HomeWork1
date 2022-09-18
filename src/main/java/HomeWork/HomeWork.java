package HomeWork;

public class HomeWork {
    public static void main(String[] args) {
        Patient patient= new Patient();
        Registry registry=new Registry();
        registry.setRequestFromPatient(patient);
    }
}
