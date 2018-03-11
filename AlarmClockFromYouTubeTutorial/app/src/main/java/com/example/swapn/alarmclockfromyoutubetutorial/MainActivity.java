package com.example.swapn.alarmclockfromyoutubetutorial;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //-----VARIABLES-----//

    //To make the alarm manager:
    AlarmManager alarm_manager; //The alarm manager
    TimePicker alarm_timepicker; //The time picker
    TextView update_text; //For when we want to update the text to say "set" or "not set"
    Context context;
    PendingIntent pending_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.context = this; //Not really sure why we need to do this

        //Initialize the alarm manager:
        alarm_manager = (AlarmManager) getSystemService(ALARM_SERVICE); //this is a system service

        //Initialize our time picker:
        alarm_timepicker = (TimePicker) findViewById(R.id.timePicker);

        //Initialize the text update box:
        update_text = (TextView) findViewById(R.id.update_text);

        //Create an instance of a calendar:
        final Calendar calendar = Calendar.getInstance();

        //Create an intent to the alarm receiver class:
        Intent my_intent = new Intent(this.context, Alarm_Receiver.class);


        //-----Initialize start button-----//
        final Button alarm_on = (Button) findViewById(R.id.alarm_on);

        //-----Create onclick listener to start the alarm-----//
        alarm_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Setting calendar instance with the hour and minute that we picked on the time picker
                calendar.set(Calendar.HOUR_OF_DAY, alarm_timepicker.getHour());//For the hour
                calendar.set(Calendar.MINUTE, alarm_timepicker.getMinute());//For the minute

                // get the int values of the hour and minute
                int hour = alarm_timepicker.getHour();
                int minute = alarm_timepicker.getMinute();

                // Converting the int values above to strings so they can be displayed.
                String hour_string = String.valueOf(hour);
                String minute_string = String.valueOf(minute);

                //Convert 24-hour time to 12-hour time
                if (hour > 12) {
                    hour_string = String.valueOf(hour - 12);
                }

                //From 10:7 to 10:07
                if (minute < 10) {
                    minute_string = "0" + String.valueOf(minute);
                }

                if (hour == 0) {
                    hour_string = String.valueOf("12");
                }

                //Method that changes the update text TextBox to say alarm off:
                set_alarm_text("Alarm set to: " + hour_string + ":" + minute_string);

                //Create a pending intent that delays the intent until the specified calendar time:
                pending_intent = PendingIntent.getBroadcast(MainActivity.this, 0, my_intent, PendingIntent.FLAG_UPDATE_CURRENT);

                //Set the alarm manager now that we have the intent set
                alarm_manager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pending_intent);


            }
        });

        //-----Initialize the stop button-----//
        Button alarm_off = (Button) findViewById(R.id.alarm_off);

        //-----Create onclick listener to stop the alarm-----//
        alarm_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Method that changes the update text TextBox to say alarm off
                set_alarm_text("Alarm off!");
            }
        });






    }

    //the set_alarm_text method/function that is used above ^
    private void set_alarm_text(String output) {
        update_text.setText(output);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
