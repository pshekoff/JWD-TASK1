package com.epam.jwd.rail_transport.entity.carriage;

import com.epam.jwd.rail_transport.entity.RailTransport;

/**
 *
 * Class describes carriages and extend class {@link RailTransport}.
 * A carriage is a vehicle used for the carrying of cargo or passengers on
 * a rail transport system.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public abstract class Carriage extends RailTransport {
    /** Field maxLoad - maximum allowable load per carriage in tons. */
    private final int maxLoad;        //maximum load capacity in kilograms

    /** Constructor - new object creation with certain values.
     * @param model {@link RailTransport#getModel()} - carriage model;
     * @param weight {@link RailTransport#getWeight()} - carriage weight in
     *  tons;
     * @param maxLoad - maximum allowable load per carriage in tons;
     * @param trackGauge {@link RailTransport#getTrackGauge()} - locomotive
     *  track gauge in millimeters.
     */
    public Carriage(String model, int weight, int maxLoad, int trackGauge) {
        super(model, weight, trackGauge);
        this.maxLoad = maxLoad;
    }

    /**
     * Field value get method {@link Carriage#maxLoad}.
     * @return locomotive power in horsepower.
     */
    public int getMaxLoad() {
        return maxLoad;
    }
}
