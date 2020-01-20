package com.therealsanjeev.alarms;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

public class DemoJob extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Toast.makeText(this,"Job Scheduler is : Start",Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Toast.makeText(this,"Job Scheduler is : Stop",Toast.LENGTH_SHORT).show();
        return false;

    }
}
