package joycechidiadi.com.weatherappy.weather;

import joycechidiadi.com.weatherappy.R;

public class Forecast {
    private Current Current;
    private Hour[] HourlyForecast;
    private Day[] DailyForecast;

    public joycechidiadi.com.weatherappy.weather.Current getCurrent() {
        return Current;
    }

    public void setCurrent(joycechidiadi.com.weatherappy.weather.Current current) {
        Current = current;
    }

    public Hour[] getHourlyForecast() {
        return HourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        HourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return DailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        DailyForecast = dailyForecast;
    }
    public static  int getIconId(String iconString) {

        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear_day")) {
            iconId = R.drawable.clear_day;
        }
        else if (iconString.equals("clear_night")) {
            iconId = R.drawable.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }
        return iconId;
    }

}
