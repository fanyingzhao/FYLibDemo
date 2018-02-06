package fyz.general;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by fyz on 2017/9/22.
 */

public class TimerUtils {

    /*
     * 延迟执行帮助方法
     */
    public static Timer schedluePostDelay(long delay, final DelayTaskSchedlueListener taskSchedlueListener) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                taskSchedlueListener.onDelayTaskSchedlued();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, delay);
        return timer;
    }

    public interface DelayTaskSchedlueListener {
        void onDelayTaskSchedlued();
    }
}
