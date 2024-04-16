package froilanfarms;

public class Tractor extends Vehicle implements FarmVehicle {

        public boolean harvest(Field field) {
            boolean allHarvested = true;
            for (CropRow row : field.getCropRows()) {
                for (Crop crop : row.getRowCrops()) {
                    if (crop != null && !crop.isHarvested()) {
                        crop.setHarvested(true);
                        if (!crop.isFertilized()) {
                            allHarvested = false;
                        }
                    }
                }
            }
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
        public void mount () {
            System.out.println("Mounting the tractor.");
        }

        @Override
        public void dismount () {
            System.out.println("Dismounting the tractor.");
        }
    }

