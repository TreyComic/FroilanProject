package froilanfarms;

public class Farmer extends Person implements Botanist, Rider {
    private Farm farm;
    private String name;

    private boolean hasFarm;

    public Farm getFarm() {
        return farm;
    }

    public String getName() {
        return name;
    }

    public Farmer(String name) {
        super(name);
    }
    public void buyFarm(String name)
    {
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

    public void buyChickens(int chickensToBuy, ChickenCoop chickenCoop) {
        if (chickensToBuy <= 4) {
            int chickensBought = 0;
            int chickensNotBought = 0;

            for (int i = 0; i < chickenCoop.getChickens().length; i++) {
                if (chickenCoop.getChickens()[i] == null) {
                    chickenCoop.getChickens()[i] = new Chicken();
                    chickensBought++;
                } else {
                    chickensNotBought++;
                }
            }
            System.out.println(this.name + "bought " + chickensBought + " chickens.");
            if (chickensNotBought > 0) {
                System.out.println(this.name + " was unable to buy " + chickensNotBought + "chickens!");
            }

        } else {
            System.out.println(this.name + " can't buy " + chickensToBuy + " chickens! Max number of chickens is 4!");
        }
    }


    public void buyHorses(int horsesToBuy, Stable stable) {
        if (horsesToBuy <= 4) {
            int horsesBought = 0;
            int horsesNotBought = 0;

            for (int i = 0; i < stable.getHorses().length; i++) {
                if (stable.getHorses()[i] == null){
                    stable.getHorses()[i] = new Horse();
                    horsesBought++;
                } else {
                    horsesNotBought++;
                }
            }
            System.out.println(this.name + "bought " + horsesBought + " horses.");
            if (horsesNotBought > 0) {
                System.out.println(this.name + " was unable to buy " + horsesNotBought + " horses!");
            }

        } else {
            System.out.println(this.name + " can't buy " + horsesToBuy + " horses! Max number of horses is 4!");
        }
    }

    public void buildStables(int numStablesToBuild) {
        int numberStablesBuilt = 0;
        int numberStablesNotBuilt = 0;
        if (numStablesToBuild <= 3) {
            for (int i = 0; i < numStablesToBuild; i++) {
                if (this.getFarm().getStables()[i] == null) {
                    this.getFarm().getStables()[i] = new Stable();
                    numberStablesBuilt++;
                } else {
                    numberStablesNotBuilt++;
                }
            }
            System.out.println(this.name + "built " + numberStablesBuilt + " stables.");
            if (numberStablesNotBuilt > 0) {
                System.out.println(this.name + " was unable to build " + numberStablesNotBuilt + " stables!");
            }

        } else {
            System.out.println(this.name + " can't build " + numStablesToBuild + " stables! Max number of stables is 3!");
        }
    }

    public void buildChickenCoup(int numChickenCoupToBuild) {
        int numberChickenCoupBuilt = 0;
        int numberChickenCoupNotBuilt = 0;
        if (numChickenCoupToBuild <= 4) {
            for (int i = 0; i < numChickenCoupToBuild; i++) {
                if (this.getFarm().getChickenCoops()[i] == null) {
                    this.getFarm().getChickenCoops()[i] = new ChickenCoop();
                    numberChickenCoupBuilt++;
                } else {
                    numberChickenCoupNotBuilt++;
                }
            }
            System.out.println(this.name + "built " + numberChickenCoupBuilt + "chicken coups.");
            if (numberChickenCoupNotBuilt > 0) {
                System.out.println(this.name + " was unable to build " + numberChickenCoupNotBuilt + "chicken coups!");
            }

        } else {
            System.out.println(this.name + " can't build " + numChickenCoupToBuild + " stables! Max number of chicken coups is 4!");
        }
    }
}
