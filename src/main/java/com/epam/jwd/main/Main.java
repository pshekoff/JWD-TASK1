package main.java.com.epam.jwd.main;

import main.java.com.epam.jwd.comparator.ComfortClassComparator;
import main.java.com.epam.jwd.entity.carriage.PassengerCarriage;
import main.java.com.epam.jwd.entity.locomotive.Locomotive;
import main.java.com.epam.jwd.entity.locomotive.LocomotiveTypes;
import main.java.com.epam.jwd.entity.train.PassangerTrain;
import main.java.com.epam.jwd.search.CarriageSearch;

public class Main {

    public  static void main(String[] args) {
        //train creation
        PassangerTrain passangerTrain = new PassangerTrain(110,
                new Locomotive("TG102",
                        LocomotiveTypes.DIESEL,
                        3280,
                        168,
                        1520));

        //carriages adding
        passangerTrain.add(new PassengerCarriage("61-4476",
                28,
                28,
                36,
                120,
                1,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4170",
                30,
                26,
                54,
                100,
                2,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4476",
                28,
                28,
                36,
                120,
                1,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4140",
                31,
                29,
                60,
                100,
                2,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4462",
                26,
                30,
                52,
                100,
                2,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4193",
                29,
                32,
                40,
                150,
                1,
                1520));
        passangerTrain.add(new PassengerCarriage("61-4193",
                29,
                32,
                40,
                150,
                1,
                1520));


        int carriageCount = 0;
        int passengerCount = 0;
        int cargoCapacity = 0;

        //train carriages count, passengers count, cargo capacity calculation
        for (PassengerCarriage wagon : passangerTrain.getCarriages()) {
            carriageCount++;
            passengerCount += wagon.getPassengersCapacity();
            cargoCapacity += wagon.getCargoCapacity() * wagon.getPassengersCapacity();
        }

        //train carriages count, passengers count, cargo capacity output
        System.out.println("Train has " + carriageCount + " wagons.");
        System.out.println("Train has maximum " +
                            passengerCount +
                            " passangers capacity.");
        System.out.println("Train has maximum " +
                            cargoCapacity +
                            " kg cargo capacity.");

        //train's carriages sorting by comfort class
        passangerTrain.getCarriages().sort(new ComfortClassComparator());

        //train's carriages sorte list output
        System.out.println("\nCarriage's list sorted by comfort class:");
        for (PassengerCarriage pc : passangerTrain.getCarriages()) {
            System.out.println(pc.toString());
        }

        //search and output train's carriages in given passengers count range
        System.out.println("\nCarriages search by passengers count from 20 to 50:");
        for (PassengerCarriage pc : CarriageSearch.searchByPassengersCount(
                passangerTrain,
                20,
                50)) {
            System.out.println(pc.toString());
        }

    }

}
