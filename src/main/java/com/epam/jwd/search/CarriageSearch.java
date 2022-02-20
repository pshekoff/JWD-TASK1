package com.epam.jwd.rail_transport.search;

import com.epam.jwd.rail_transport.entity.carriage.PassengerCarriage;
import com.epam.jwd.rail_transport.entity.train.PassangerTrain;

import java.util.ArrayList;

/**
 *
 * Class implements search of passenger carriage {@link PassengerCarriage}
 * by the passenger's capacity in the given range.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class CarriageSearch {

    /**
     * Method for the search passenger carriages in the train
     * {@link com.epam.jwd.rail_transport.entity.train.Train}
     * by the passenger capacity range.
     * @param train {@link com.epam.jwd.rail_transport.entity.train.Train};
     * @param countFrom - minimum passenger capacity;
     * @param countTo - maximum passenger capacity.
     * @return filtered list of passenger carriages {@link PassengerCarriage}.
     */
    public static ArrayList<PassengerCarriage> searchByPassengersCount(
            PassangerTrain train,
            int countFrom,
            int countTo) {

        ArrayList<PassengerCarriage> filtered = new ArrayList<>();
        for (PassengerCarriage carriage : train.getCarriages()) {
            if (carriage.getPassengersCapacity() >= countFrom
                && carriage.getPassengersCapacity() <= countTo) {
                filtered.add(carriage);
            }
        }
        return filtered;
    }
}
