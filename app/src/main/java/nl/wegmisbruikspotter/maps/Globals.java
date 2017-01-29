package nl.wegmisbruikspotter.maps;

import android.app.Application;

/**
 * Created by pmzq_ on 24-1-2017.
 */


public class Globals extends Application {

    private String kenteken;
    private String ergernis;
    private String merk;
    private String description;
    private String latitude;
    private String longitude;
    private String spotid;

    public String getkenteken() {
        return kenteken;
    }
    public void setkenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public String getergernis() {
        return ergernis;
    }
    public void setergernis(String ergernis) {
        this.ergernis = ergernis;
    }

    public String getmerk() {
        return merk;
    }
    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }

    public String getlatitude() {
        return latitude;
    }
    public void setlatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getspotid() {
        return spotid;
    }
    public void setspotid(String spotid) {
        this.spotid = spotid;
    }

    public String getlongitude() {
        return longitude;
    }
    public void setlongitude(String longitude) {
        this.longitude = longitude;
    }
}
