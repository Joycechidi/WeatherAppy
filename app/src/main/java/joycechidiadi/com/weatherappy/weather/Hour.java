package joycechidiadi.com.weatherappy.weather;

import android.os.Parcel;
import android.os.Parcelable;

public class Hour implements Parcelable {
    private long Time;
    private String Summary;
    private double Temperature;
    private String Icon;
    private String Timezone;

    public Hour() { }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double temperature) {
        Temperature = temperature;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String timezone) {
        Timezone = timezone;
    }

    @Override
    public int describeContents() {
        return 0; //ignore
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(Time);
        dest.writeDouble(Temperature);
        dest.writeString(Summary);
        dest.writeString(Icon);
        dest.writeString(Timezone);

    }

    private Hour(Parcel in) {
        Time = in.readLong();
        Temperature = in.readDouble();
        Summary = in.readString();
        Icon = in.readString();
        Timezone = in.readString();
    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel source) {
            return new Hour(source);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };
}
