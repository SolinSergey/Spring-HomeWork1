package HomeWork;

import javax.print.Doc;

public class TimeTable {
    DoctorCard doctorCard=new DoctorCard();

    public void setDoctorRequest (TimeTableRequest timeTableRequest){
        System.out.println("Запрошена информация о враче и о том, где он принимает");
        doctorCard.setProfile(timeTableRequest.profile);
        doctorCard.setFirstName("Учкудук");
        doctorCard.setLastName("Мерзкий");
        doctorCard.setNumberCabinet(213);
    }
    public DoctorCard getDoctorCard (){
        return doctorCard;
    }
}
