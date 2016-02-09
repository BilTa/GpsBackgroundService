package bilta.gpsbackgroundservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, GpsBackgroundService.class));
    }
}
