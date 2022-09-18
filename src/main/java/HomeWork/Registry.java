package HomeWork;

public class Registry {
    public void setRequestFromPatient (Patient patient){
        patient.setFirstName("Николай");
        patient.setLastName("Басков");
        patient.setRequest("Голос стал козлиным");
        Archive archive=new Archive();
        archive.setPatientRequest(patient);
        System.out.println(archive.getPatientCard().toString());
    }
}
