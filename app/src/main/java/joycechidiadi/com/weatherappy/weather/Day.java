package joycechidiadi.com.weatherappy.weather;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Day implements Parcelable {
    private long Time;
    private String Summary;
    private double TemperatureMax;
    private String Icon;
    private String Timezone;

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

    public int getTemperatureMax() {
        return (int) Math.round(TemperatureMax);
    }

    public void setTemperatureMax(double temperatureMax) {
        TemperatureMax = temperatureMax;
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

    public int getIconId() {
        return Forecast.getIconId(Icon);
    }

    public String getDayOfTheWeek() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        formatter.setTimeZone(TimeZone.getTimeZone(Timezone));
        Date dateTime = new Date(Time * 1000);
        return formatter.format(dateTime);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(Time);
        dest.writeString(Summary);
        dest.writeDouble(TemperatureMax);
        dest.writeString(Icon);
        dest.writeString(Timezone);
    }

    private Day(Parcel in) {
        Time = in.readLong();
        Summary = in.readString();
        TemperatureMax = in.readDouble();
        Icon = in.readString();
        Timezone = in.readString();
    }

    public Day() { }

    public static final Creator<Day> CREATOR = new Creator<Day>() {
        @Override
        public Day createFromParcel(Parcel source) {
            return new Day(source);
        }

        @Override
        public Day[] newArray(int size) {
            return new Day[size];
        }
    };


}
