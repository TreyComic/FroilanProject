package froilanfarms;


public class ChickenCoop {
    private Chicken[] chickens;
    private int count = 0;


public ChickenCoop() {
    this.chickens = new Chicken[4];
}
//public void addChicken(Chicken chicken) {
//    if (count < chickens.length) {
//        chickens[count] = chicken;
//        count++;
//    }
//}

    public Chicken[] getChickens() {
        return chickens;
    }
}
