package joycechidiadi.com.weatherappy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Bundle;

import java.util.Arrays;

import joycechidiadi.com.weatherappy.R;
import joycechidiadi.com.weatherappy.adapters.DayAdapter;
import joycechidiadi.com.weatherappy.weather.Day;

public class DailyForecastActivity extends ListActivity {
    private Day[] Days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(AppyActivity.DAILY_FORECAST);
        Days = Arrays.copyOf(parcelables, parcelables.length, Day[].class);

        DayAdapter adapter = new DayAdapter(this, Days);
        setListAdapter(adapter);

    }
}
