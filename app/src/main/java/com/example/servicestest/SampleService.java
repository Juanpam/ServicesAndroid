package com.example.servicestest;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class SampleService extends IntentService {

    private static final String TAG = "SampleService";

    public SampleService() {
        super("SampleService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "Executing IntentService");
    }
}
