package bilta.gpsbackgroundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class GpsBackgroundService extends Service {

    @Override
    public void onCreate(){
        Log.d("onCreate", "created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d("onStart", "startCommand");
        return startId;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("onBind", "bind");
        return null;
    }

    @Override
    public void onDestroy() {
        Log.d("onDestroy", "destroy");
    }
}
