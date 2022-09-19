package HomeWorkSpring;

import HomeWorkSpring.TimeTableRequest;

public class TimeTable {
    DoctorCard doctorCard;

    public TimeTable() {
        System.out.println("Создана доска информации");
    }

    public void setTimeTable (DoctorCard doctorCard){
        this.doctorCard=doctorCard;
    }

    public void setDoctorRequest (TimeTableRequest timeTableRequest){
        System.out.println("Запрошена информация о враче и о том, где он принимает");
        doctorCard.setProfile(timeTableRequest.profile);
        doctorCard.setFirstName("Учкудук");
        doctorCard.setLastName("Джиноподобный");
        doctorCard.setNumberCabinet(213);
    }
    public DoctorCard getDoctorCard (){
        return doctorCard;
    }
}
