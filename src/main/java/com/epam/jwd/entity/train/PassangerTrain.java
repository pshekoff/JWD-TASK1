package com.epam.jwd.rail_transport.entity.train;

import com.epam.jwd.rail_transport.entity.carriage.PassengerCarriage;
import com.epam.jwd.rail_transport.entity.locomotive.Locomotive;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * Class describes passenger trains and extend class {@link Train}.
 * A passenger train is a train used to transport people along a railroad line.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public class PassangerTrain extends Train {
    /** Field carriages - list of passenger carriages {@link PassengerCarriage}
     * in the passenger train {@link PassangerTrain}.
     */
    private List<PassengerCarriage> carriages = new ArrayList<>();

    /** Constructor - new object creation with certain values.
     * @param trainNumber {@link Train#getTrainNumber()} - train number;
     * @param locomotive {@link Train#getLocomotive()} - train locomotive
     *  {@link Locomotive}.
     */
    public PassangerTrain(int trainNumber, Locomotive locomotive) {
        super(trainNumber, locomotive);
    }

    /**
     * Field value get method {@link PassangerTrain#carriages}.
     * @return list of passenger carriages.
     */
    public List<PassengerCarriage> getCarriages() {
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
     * Method for adding new passenger carriage {@link PassengerCarriage}
     * into the carriages list {@link PassangerTrain#carriages}.
     * @param passangerCarriage {@link PassengerCarriage}.
     */
    public void add(PassengerCarriage passangerCarriage) {
        carriages.add(passangerCarriage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PassangerTrain that = (PassangerTrain) obj;

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
        return "PassengerTrain{"
                + "train number=" + getTrainNumber()
                + "locomotive=" + getLocomotive().getModel()
                + "carriages=" + carriages.size()
                + "}";
    }
}
