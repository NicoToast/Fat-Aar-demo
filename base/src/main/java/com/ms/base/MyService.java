package com.ms.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = MyService.class.getSimpleName();

    private MyBinder binder = new MyBinder();

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind()");
        binder.setCount(getApplication().getResources().getInteger(R.integer.count));
        return binder;
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestory()");
        super.onDestroy();
    }
}
