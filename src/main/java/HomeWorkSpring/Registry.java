package HomeWorkSpring;

import HomeWork.*;
import HomeWork.Patient;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Registry {
    public void setRequestFromPatient(Patient patient) {
        patient.setFirstName("Николай");
        patient.setLastName("Басков");
        patient.setRequest("Голос стал козлиным");
        //Archive archive=new Archive();
        //archive.setPatientRequest(patient);
        //System.out.println(archive.getPatientCard().toString());
        //TimeTableRequest timeTableRequest=new TimeTableRequest();
        //Date currentDate = new Date();
        //timeTableRequest.currentDate=currentDate;
        //timeTableRequest.profile="Терапевт";
        //TimeTable timeTable = new TimeTable();
        //timeTable.setDoctorRequest(timeTableRequest);
        //DoctorCard doctorCard= timeTable.getDoctorCard();
        //System.out.println(doctorCard.toString());
        //BuildingPlanRequest buildingPlanRequest=new BuildingPlanRequest();
        //buildingPlanRequest.numberCabinets=doctorCard.getNumberCabinet();
        //BuildingPlan buildingPlan = new BuildingPlan();
        //buildingPlan.setBuildingPlanPosition(buildingPlanRequest);
        ///ystem.out.println("Пациенту необходимо пройти в кабинет №"+doctorCard.getNumberCabinet()
        //        +", который расположен на "+buildingPlan.getFloor()+" этаже");
    }
}
