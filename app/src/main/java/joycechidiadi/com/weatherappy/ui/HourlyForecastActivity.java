package joycechidiadi.com.weatherappy.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

import joycechidiadi.com.weatherappy.R;
import joycechidiadi.com.weatherappy.weather.Hour;

public class HourlyForecastActivity extends AppCompatActivity {
    private Hour[] Hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(AppyActivity.HOURLY_FORECAST);
        Hours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }
}






