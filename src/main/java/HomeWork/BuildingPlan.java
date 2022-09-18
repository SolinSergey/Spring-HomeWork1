package HomeWork;

import org.springframework.stereotype.Component;

public class BuildingPlan {
    int floor;
    public void setBuildingPlanPosition(BuildingPlanRequest buildingPlanRequest){
        this.floor=2;
    }
    public int getFloor(){
        return this.floor;
    }
}
