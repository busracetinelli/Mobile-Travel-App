package com.example.myserviceuygulamaapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d("onbind","onbind girdi......");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("onstart","onstart girdi......");

        //yapılacaklar...
        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onCreate() {

        super.onCreate();
        Log.d("oncreate","oncreate girdi......");

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Log.d("ondestroy","ondestroy girdi......");
    }
}