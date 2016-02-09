package bilta.gpsbackgroundservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GpsBackgroundServiceReveiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(intent.getAction(), "uniq");
        //context.startService(new Intent(context, GpsBackgroundService.class));

    }
}
