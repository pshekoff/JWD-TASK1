package com.epam.jwd.rail_transport.entity;

/**
 * Class describes rail transport (also known as train transport) is a means
 * of transferring passengers and goods on wheeled vehicles running on rails,
 * which are located on tracks.
 *
 * @author Pavel Kirvel
 * @version 1.0
 */
public abstract class RailTransport {

    /** Field model - rail transport model. */
    private final String model;

    /** Field trackGauge - track gauge in millimeters. */
    private final int trackGauge;

    /** Field weight - rail transport weight. */
    private final int weight;

    /** Constructor - new object creation with certain values.
     * @param model - rail transport model;
     * @param weight - rail transport weight in tons;
     * @param trackGauge - rail transport track gauge in millimeters.
     */
    public RailTransport(String model, int weight, int trackGauge) {
        this.model = model;
        this.weight = weight;
        this.trackGauge = trackGauge;
    }

    /**
     * Field value get method {@link RailTransport#model}.
     * @return rail transport model.
     */
    public String getModel() {
        return model;
    }

    /**
     * Field value get method {@link RailTransport#weight}.
     * @return rail transport weight in tons.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Field value get method {@link RailTransport#trackGauge}.
     * @return rail transport track gauge in millimeters.
     */
    public int getTrackGauge() {
        return trackGauge;
    }
}
