package froilanfarms;

public class Tractor extends Vehicle implements FarmVehicle {

        public EdibleObject[] harvest(Field field) {
            int count = 0;
            for(CropRow r : field.getCropRows()){
                for(Crop c : r.getCropRow()){
                    if(c != null){
                        count++;
                    }
                }
            }
            EdibleObject[] allHarvested = new EdibleObject[count];
            int count2 = 0;
            int tomatos = 0;
            int earsOfCorn = 0;
            for(CropRow r : field.getCropRows()){
                for(Crop c : r.getCropRow()){
                    if(c != null){
                        allHarvested[count2] = c.yield();
                    }
                    if(allHarvested[count2] instanceof Tomato){
                        tomatos++;
                    }
                    if(allHarvested[count2] instanceof EarCorn){
                        earsOfCorn++;
                    }
                    count2++;
                }
            }
            System.out.println("You have harvested " + tomatos + "tomatos and " + earsOfCorn + " ears of corn.");
            return allHarvested;
        }

        @Override
        public void operate () {
            System.out.println("now operating tractor on farm");
        }

        @Override
        public void makeNoise () {
            System.out.println("Tractor noise!");
        }

    @Override
    public void ride() {

    }
}

