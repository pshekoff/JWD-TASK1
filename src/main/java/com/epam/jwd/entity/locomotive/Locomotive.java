package com.epam.jwd.rail_transport.entity.locomotive;

import com.epam.jwd.rail_transport.entity.RailTransport;

/**
 *
 * Class describes locomotives and extend class {@link RailTransport}.
 * A locomotive is a rail transport vehicle that provides the motive power
 * for a train.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class Locomotive extends RailTransport {
    /** Field locomotiveType {@link LocomotiveTypes}. */
    private final LocomotiveTypes type;

    /** Field power - locomotive power in horsepower. */
    private final int power;

    /** Constructor - new object creation with certain values.
     * @param model {@link RailTransport#getModel()} - locomotive model;
     * @param type - locomotive type {@link  LocomotiveTypes};
     * @param power - locomotive power in horsepower;
     * @param weight {@link RailTransport#getWeight()} - locomotive weight in
     *  tons;
     * @param trackGauge {@link RailTransport#getTrackGauge()} - locomotive
     *  track gauge in millimeters.
     */
    public Locomotive(String model, LocomotiveTypes type, int power,
                      int weight, int trackGauge) {
        super(model, weight, trackGauge);
        this.type = type;
        this.power = power;
    }

    /**
     * Field value get method {@link Locomotive#power}.
     * @return locomotive power in horsepower.
     */
    public int getPower() {
        return power;
    }

    /**
     * Field value get method {@link Locomotive#type}.
     * @return locomotive type {@link LocomotiveTypes}.
     */
    public LocomotiveTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Locomotive that = (Locomotive) obj;

        return this.getTrackGauge() == that.getTrackGauge()
                && (this.getWeight() == that.getWeight())
                && (this.power == that.power)
                && (this.type == that.type)
                && (this.getModel() == that.getModel()
                    || (this.getModel() != null
                        && this.getModel().equals(that.getModel())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.getModel() == null) ? 0 : this.getModel().hashCode());
        result = prime * result + this.getWeight();
        result = prime * result + this.getTrackGauge();
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result += power;
        return result;
    }

    @Override
    public String toString() {
        return "Locomotive{"
                + "model=" + getModel()
                + ", type=" + type
                + ", power=" + power + " horsepower"
                + ", weight=" + getWeight() + " tons"
                + ", track gauge=" + getTrackGauge() + " mm"
                + "}";
    }
}
