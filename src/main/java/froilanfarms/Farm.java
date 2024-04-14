package froilanfarms;
public class Farm {
    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;
    private FarmVehicle[] farmVehicles;
    private Aircraft[] aircrafts;

    public Farm(Stable[] stables, ChickenCoop[] chickenCoops, FarmHouse farmHouse, FarmVehicle[] farmVehicles, Aircraft[] aircrafts) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.farmVehicles = farmVehicles;
        this.aircrafts = aircrafts;
    }

    public Stable[] getStables() {
        return stables;
    }

    public void setStables(Stable[] stables) {
        this.stables = stables;
    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoop[] chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public FarmVehicle[] getFarmVehicles() {
        return farmVehicles;
    }

    public void setFarmVehicles(FarmVehicle[] farmVehicles) {
        this.farmVehicles = farmVehicles;
    }

    public Aircraft[] getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }
}
