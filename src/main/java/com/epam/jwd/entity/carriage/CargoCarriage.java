package com.epam.jwd.rail_transport.entity.carriage;

/**
 *
 * Class describes cargo carriages and extend class {@link Carriage}.
 * A cargo carriages are exist in a wide variety of types, adapted to carry a
 * host of goods.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class CargoCarriage extends Carriage {
    /** Field CargoCarriageTypes {@link CargoCarriageTypes}. */
    private final CargoCarriageTypes type;

    /** Constructor - new object creation with certain values.
     * @param model {@link Carriage#getModel()} - carriage model;
     * @param type - cargo carriage type {@link  CargoCarriageTypes};
     * @param weight {@link Carriage#getWeight()} - carriage weight in tons;
     * @param maxLoad - maximum allowable load per carriage in tons;
     * @param trackGauge {@link Carriage#getTrackGauge()} - locomotive
     *  track gauge in millimeters.
     */
    public CargoCarriage(String model, CargoCarriageTypes type, int weight,
                         int maxLoad, int trackGauge) {
        super(model, weight, maxLoad, trackGauge);
        this.type = type;
    }

    /**
     * Field value get method {@link CargoCarriage#type}.
     * @return cargo carriage type {@link CargoCarriageTypes}.
     */
    public CargoCarriageTypes getType() {
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

        CargoCarriage that = (CargoCarriage) obj;

        return this.getTrackGauge() == that.getTrackGauge()
                && (this.getWeight() == that.getWeight())
                && (this.type == that.type)
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
        result = prime * result + ((type == null)
                                    ? 0
                                    : type.hashCode());
        result = prime * result + this.getMaxLoad();
        return result;
    }

    @Override
    public String toString() {
        return "CargoCarriage{"
                + "model=" + getModel()
                + ", type=" + type
                + ", weight=" + getWeight() + " tons"
                + ", maximum load=" + getMaxLoad() + " tons"
                + ", track gauge=" + getTrackGauge() + " mm"
                + "}";
    }

}
