package com.epam.jwd.rail_transport.entity.train;

import com.epam.jwd.rail_transport.entity.locomotive.Locomotive;
import com.epam.jwd.rail_transport.entity.carriage.CargoCarriage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * Class describes cargo trains and extend class {@link Train}.
 * A cargo train is the use of railroads and trains to transport cargo as
 * opposed to human passengers.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class CargoTrain extends Train {
    /** Field carriages - list of cargo carriages {@link CargoCarriage}
     * in the cargo train {@link CargoTrain}.
     */
    private List<CargoCarriage> carriages = new ArrayList<>();

    /** Constructor - new object creation with certain values.
     * @param trainNumber {@link Train#getTrainNumber()} - train number;
     * @param locomotive {@link Train#getLocomotive()} - train locomotive
     *  {@link Locomotive}.
     */
    public CargoTrain(int trainNumber, Locomotive locomotive) {
        super(trainNumber, locomotive);
    }

    /**
     * Field value get method {@link CargoTrain#carriages}.
     * @return list of cargo carriages.
     */
    public List<CargoCarriage> getCarriages() {
        return carriages;
    }

    /**
     * Field value set method {@link Train#getLocomotive()}.
     * @param locomotive {@link Locomotive}.
     */
    public void setLocomotive(Locomotive locomotive) {
        super.setLocomotive(locomotive);
    }

    /**
     * Method for adding new cargo carriage {@link CargoCarriage}
     * into the carriages list {@link CargoTrain#carriages}.
     * @param cargoCarriage {@link CargoCarriage}.
     */
    public void add(CargoCarriage cargoCarriage) {
        carriages.add(cargoCarriage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        CargoTrain that = (CargoTrain) obj;

        return this.getTrainNumber() == that.getTrainNumber()
                && (Objects.equals(this.carriages, that.carriages))
                && (this.getLocomotive() == that.getLocomotive()
                || (this.getLocomotive() != null
                    && this.getLocomotive().equals(that.getLocomotive())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.carriages == null)
                                    ? 0
                                    : this.carriages.hashCode());
        result = prime * result + this.getTrainNumber();
        result = prime * result + ((this.getLocomotive() == null)
                                    ? 0
                                    : this.getLocomotive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CargoTrain{"
                + "train number=" + getTrainNumber()
                + "locomotive=" + getLocomotive().getModel()
                + "carriages=" + carriages.size()
                + "}";
    }

}
