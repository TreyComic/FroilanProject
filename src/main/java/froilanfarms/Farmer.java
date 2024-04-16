package froilanfarms;

public class Farmer extends Person implements Botanist, Rider {
    private Farm farm;

    private boolean hasFarm;

    public Farm getFarm() {
        return farm;
    }

    public Farmer(String name) {
        super(name);
    }

    public void buyFarm(String name) {
        Farm farm = new Farm();
        farm.setName(name);
        farm.getFarmHouse().getPeople()[0] = this;
    }

    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println();
    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable instanceof Vehicle) {
            ((Vehicle) rideable).setInUse(true);
        }
        rideable.ride();
        System.out.println("This " + rideable + " is in use.");
    }

    @Override
    public void dismount(Rideable rideable) {
        if (rideable instanceof Vehicle) {
            ((Vehicle) rideable).setInUse(false);
        }
        System.out.println("This " + rideable + " is free to use.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Farmer is speaking.");

    }

    @Override
    public void plant(Crop crop, CropRow croprow) {
        int cropsPlanted = 0;
        for (int i = 0; i < croprow.getCropRow().length; i++) {
            if (croprow.getCropRow()[i] == null) {
                croprow.getCropRow()[i] = crop;
                cropsPlanted++;
            }
        }
        if (cropsPlanted == 0) {
            System.out.println("Croprow is full!");
        }
        System.out.println(this.getName() + " planted " + cropsPlanted + " " + crop.getClass().getSimpleName() + "s.");


    }

    public void buyChickens(int chickensToBuy) {
        int openChickenSlots = 0;
        for (ChickenCoop c : this.farm.getChickenCoops()) {
            for (Chicken chick : c.getChickens()) {
                if (chick == null) {
                    openChickenSlots++;

                }
            }
        }
        int chickensBought = 0;
        if (chickensToBuy <= openChickenSlots) {
            for (ChickenCoop c : this.farm.getChickenCoops()) {
                for (Chicken chick : c.getChickens()) {
                    if (chick == null && chickensBought <= chickensToBuy) {
                        chick = new Chicken();
                    }
                }
            }

            System.out.println( getName() + "bought " + chickensToBuy + " chickens.");

        } else {
            System.out.println(getName() + " can't buy " + chickensToBuy + " chickens! Max number of chickens is " + openChickenSlots + "!");
        }
    }


    public void buyHorses(int horsesToBuy) {
        int openHorseSlots = 0;
        for (Stable s : this.farm.getStables()) {
            for (Horse h : s.getHorses()) {
                if (h == null) {
                    openHorseSlots++;
                }
            }
        }
        int horsesBought = 0;
        if (horsesToBuy <= openHorseSlots) {
            for (Stable s : this.farm.getStables()) {
                for (Horse h : s.getHorses()) {
                    if (h == null && horsesBought <= horsesToBuy) {
                        h = new Horse();
                    }
                }
            }

            System.out.println(getName() + "bought " + horsesToBuy + " horses.");

        } else {
            System.out.println(getName() + " can't buy " + horsesToBuy + " horses! Max number of horses is " + openHorseSlots + "!");
        }
    }

    public void buildStables(int numStablesToBuild) {
        int openStableSlots = 0;
        for (Stable s : this.farm.getStables()) {
            if (s == null) {
                openStableSlots++;
            }
        }
        int stablesBuilt = 0;
        if (numStablesToBuild <= openStableSlots) {
            for (Stable s : this.farm.getStables()) {
                if (s == null && stablesBuilt <= numStablesToBuild) {
                    s = new Stable();
                    stablesBuilt++;
                }
            }
            System.out.println(getName() + "built " + stablesBuilt + " stables.");
        } else {
            System.out.println(getName() + " can't build " + numStablesToBuild + " stables! Max number of stables is " + openStableSlots + "!");
        }
    }

    public void buildChickenCoup(int numChickenCoupToBuild) {
        int openChickenCoupSlots = 0;
        for (ChickenCoop c : this.farm.getChickenCoops()) {
            if (c == null) {
                openChickenCoupSlots++;
            }
        }
        int chickenCoupsBuilt = 0;
        if (numChickenCoupToBuild <= openChickenCoupSlots) {
            for (ChickenCoop c : this.farm.getChickenCoops()) {
                if (c == null && chickenCoupsBuilt <= numChickenCoupToBuild) {
                    c = new ChickenCoop();
                    chickenCoupsBuilt++;
                }
            }
            System.out.println(getName() + "built " + chickenCoupsBuilt + " stables.");
        } else {
            System.out.println(getName() + " can't build " + numChickenCoupToBuild + " stables! Max number of stables is " + openChickenCoupSlots + "!");
        }
    }
}
