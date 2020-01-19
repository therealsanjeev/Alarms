package com.therealsanjeev.alarms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSchedule =findViewById(R.id.btnSchedule);

        btnSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getBaseContext(),Main2Activity.class);

                PendingIntent pi = PendingIntent.getActivity(getBaseContext(),12345,i,PendingIntent.FLAG_ONE_SHOT);

                AlarmManager alarmManager =(AlarmManager)getSystemService(ALARM_SERVICE);
                alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+60000,pi);

            }
        });
    }
}
