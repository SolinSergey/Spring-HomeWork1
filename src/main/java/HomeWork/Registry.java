package HomeWork;

import java.util.Date;

public class Registry {
    public void setRequestFromPatient (Patient patient){
        patient.setFirstName("Николай");
        patient.setLastName("Басков");
        patient.setRequest("Голос стал козлиным");
        Archive archive=new Archive();
        archive.setPatientRequest(patient);
        System.out.println(archive.getPatientCard().toString());
        TimeTableRequest timeTableRequest=new TimeTableRequest();
        Date currentDate = new Date();
        timeTableRequest.currentDate=currentDate;
        timeTableRequest.profile="Терапевт";
        TimeTable timeTable = new TimeTable();
        timeTable.setDoctorRequest(timeTableRequest);
        DoctorCard doctorCard= timeTable.getDoctorCard();
        System.out.println(doctorCard.toString());
    }
}
