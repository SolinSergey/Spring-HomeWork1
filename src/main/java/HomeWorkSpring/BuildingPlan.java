package HomeWorkSpring;

public class BuildingPlan {

    public BuildingPlan() {
        System.out.println("Создали план здания");
    }

    int floor;
    public void setBuildingPlanPosition(BuildingPlanRequest buildingPlanRequest){
        this.floor=2;
    }
    public int getFloor(){
        return this.floor;
    }
}
