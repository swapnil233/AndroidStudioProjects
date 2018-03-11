package com.example.swapn.alarmclockfromyoutubetutorial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by swapn on 2018-03-11.
 */

public class Alarm_Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e("We are in the reviever.", "Yay!");

    }
}
