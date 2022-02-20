package com.epam.jwd.rail_transport.comparator;

import com.epam.jwd.rail_transport.entity.carriage.PassengerCarriage;

import java.util.Comparator;

/**
 * Class implements {@link Comparator} and compare passenger carriages
 * {@link PassengerCarriage} by comfort class
 * {@link PassengerCarriage#getComfortClass()}.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class ComfortClassComparator implements Comparator<PassengerCarriage> {

    @Override
    public int compare(PassengerCarriage o1, PassengerCarriage o2) {
        return o1.getComfortClass() - o2.getComfortClass();
    }
}
