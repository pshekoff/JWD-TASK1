package com.epam.jwd.rail_transport.entity.train;

import com.epam.jwd.rail_transport.entity.locomotive.Locomotive;

/**
 *
 * Class describes trains. Train is a series of connected vehicles that run
 * along a railway track and transport people or freight.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public abstract class Train {
    /** Field trainNumber - number of train. */
    private int trainNumber;

    /** Field locomotive - train locomotive {@link Locomotive}. */
    private Locomotive locomotive;

    /** Constructor - new object creation with certain values.
     * @param trainNumber - train number;
     * @param locomotive - locomotive {@link  Locomotive}.
     */
    public Train(int trainNumber, Locomotive locomotive) {
        this.trainNumber = trainNumber;
        this.locomotive = locomotive;
    }

    /**
     * Field value get method {@link Train#trainNumber}.
     * @return train number.
     */
    public int getTrainNumber() {
        return trainNumber;
    }

    /**
     * Field value get method {@link Train#locomotive}.
     * @return locomotive {@link Locomotive}.
     */
    public Locomotive getLocomotive() {
        return locomotive;
    }

    /**
     * Field value set method {@link Train#trainNumber}.
     * @param trainNumber
     */
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    /**
     * Field value set method {@link Train#locomotive}.
     * @param locomotive {@link Locomotive}.
     */
    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }
}
