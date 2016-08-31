package com.example.android.quakereport;

/**
 * Created by bat on 28/8/16.
 */
public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;

    /**
     * Date of the earthquake
     */
    private String mDate;

    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
