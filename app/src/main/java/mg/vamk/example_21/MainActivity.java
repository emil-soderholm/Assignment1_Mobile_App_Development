package mg.vamk.example_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.example.example2_1.R;

public class MainActivity extends AppCompatActivity {
    String tag="EVH_Demo: ";
    private long lastEventTime = 0;

    private void logEvent(String eventName) {
        long currentTime = SystemClock.elapsedRealtime();
        long elapsedTime = (lastEventTime == 0) ? 0 : currentTime - lastEventTime;
        Log.d(tag, tag + eventName + " elapsed time: " + elapsedTime + " ms");
        lastEventTime = currentTime;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logEvent("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logEvent("onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logEvent("onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logEvent("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logEvent("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logEvent("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logEvent("onDestroy()");
    }
}
