package com.epam.jwd.rail_transport.entity.carriage;

/**
 *
 * Class describes passenger carriages and extend class {@link Carriage}.
 * A passenger carriage is a railroad car that is designed to carry passengers.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class PassengerCarriage extends Carriage {
    /** Field passengersCapacity - maximim passengers capacity. */
    private final int passengersCapacity;

    /** Field cargoCapacity - maximim cargo capacity per person in kilograms. */
    private final int cargoCapacity;

    /** Field comfortClass - passenger carriage comfort class. */
    private final int comfortClass;

    /** Constructor - new object creation with certain values.
     * @param model {@link Carriage#getModel()} - carriage model;
     * @param weight {@link Carriage#getWeight()} - carriage weight in tons;
     * @param maxLoad - maximum allowable load per carriage in tons;
     * @param passengersCapacity - maximum passengers capacity;
     * @param cargoCapasity - maximim cargo capacity per person in kilograms ;
     * @param comfortClass - passenger carriage comfort class;
     * @param trackGauge {@link Carriage#getTrackGauge()} - locomotive
     *  track gauge in millimeters.
     */
    public PassengerCarriage(String model, int weight, int maxLoad,
                             int passengersCapacity, int cargoCapasity,
                             int comfortClass, int trackGauge) {
        super(model, weight, maxLoad, trackGauge);
        this.passengersCapacity = passengersCapacity;
        this.cargoCapacity = cargoCapasity;
        this.comfortClass = comfortClass;
    }

    /**
     * Field value get method {@link PassengerCarriage#passengersCapacity}.
     * @return passengers capasity.
     */
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    /**
     * Field value get method {@link PassengerCarriage#cargoCapacity}.
     * @return cargo capasity.
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Field value get method {@link PassengerCarriage#comfortClass}.
     * @return passenger carriage comfort class.
     */
    public int getComfortClass() {
        return comfortClass;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PassengerCarriage that = (PassengerCarriage) obj;

        return this.getTrackGauge() == that.getTrackGauge()
                && (this.getWeight() == that.getWeight())
                && (this.passengersCapacity == that.passengersCapacity)
                && (this.cargoCapacity == that.cargoCapacity)
                && (this.comfortClass == that.comfortClass)
                && (this.getMaxLoad() == that.getMaxLoad())
                && (this.getModel() == that.getModel()
                || (this.getModel() != null
                    && this.getModel().equals(that.getModel())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getModel() == null)
                                    ? 0
                                    : this.getModel().hashCode());
        result = prime * result + this.getWeight();
        result = prime * result + this.getTrackGauge();
        result = prime * result + passengersCapacity;
        result = prime * result + cargoCapacity;
        result = prime * result + comfortClass;
        result = prime * result + this.getMaxLoad();
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{"
                + "model=" + getModel()
                + ", passengers capacity=" + passengersCapacity
                + ", cargo capacity=" + cargoCapacity + " kg/person"
                + ", comfort class=" + comfortClass
                + ", weight=" + getWeight() + " tons"
                + ", maximum load=" + getMaxLoad() + " tons"
                + ", track gauge=" + getTrackGauge() + " mm"
                + "}";
    }

}
