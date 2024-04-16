package froilanfarms;
public class Farm {
    private String name;
    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;
    private FarmVehicle[] farmVehicles;
    private Field field;

    public Farm() {
        this.farmHouse = new FarmHouse();
        this.field = new Field();
        this.stables = new Stable[3];
        this.chickenCoops = new ChickenCoop[4];
        this.farmVehicles = new FarmVehicle[2];

    }

    public void setName(String name) {
        this.name = name;
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

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public FarmVehicle[] getFarmVehicles() {
        return farmVehicles;
    }

    }
