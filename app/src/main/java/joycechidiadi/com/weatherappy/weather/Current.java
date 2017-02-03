package joycechidiadi.com.weatherappy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import joycechidiadi.com.weatherappy.R;

public class Current {
    private String Icon;
    private long Time;
    private double Temperature;
    private String TimeZone;
    private double Humidity;
    private double PrecipChance;
    private String Summary;

    public double getHumidity() {

        return Humidity;
    }

    public void setHumidity(double humidity) {
        Humidity = humidity;
    }

    public String getTimeZone() {

        return TimeZone;
    }

    public void setTimeZone(String timeZone) {

        TimeZone = timeZone;
    }

    public String getIcon() {

        return Icon;
    }

    public void setIcon(String icon) {

        Icon = icon;
    }
    public int getIconId() {
        return Forecast.getIconId(Icon);
    }

    public long getTime() {

        return Time;
    }
    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(java.util.TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {

        Time = time;
}

    public int getTemperature() {

        return (int)Math.round(Temperature);
    }

    public void setTemperature(double temperature) {

        Temperature = temperature;
    }

    public double getPrecipChance() {
        double precipPercentage = PrecipChance * 100;
        return (int)Math.round(precipPercentage);

    }

    public void setPrecipChance(double precipChance) {

        PrecipChance = precipChance;
    }

    public String getSummary() {

        return Summary;
    }

    public void setSummary(String summary) {

        Summary = summary;
    }
}
