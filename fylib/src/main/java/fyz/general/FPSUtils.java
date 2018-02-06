package fyz.general;

import android.util.Log;

/**
 * Created by fyz on 2018/1/31.
 */

public class FPSUtils {
    private static final String TAG = "FPSUtils";

    private static long currentTime;
    private static long lastFPSUpdate;
    private static int frames;

    public static void fps() {
        ++frames;

        currentTime = System.currentTimeMillis();
        if (currentTime - lastFPSUpdate > 1000) {
            if (frames != 1) {
                Log.e("帧数: ", "" + frames);
                frames = 0;
            }

            lastFPSUpdate = currentTime;
        }
    }
}
