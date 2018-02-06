package fyz.general;

import android.content.Context;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by fyz on 2018/2/6.
 */

public class DimenUtils {

    /**
     * px 转dp
     * @param context
     * @param pxValue
     * @return
     */
    public static int px2dp(Context context, int pxValue){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f);
    }

    /**
     * dp转 px
     * @param context
     * @param dpValue
     * @return
     */
    public static int dp2px(Context context, int dpValue){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);
    }

    /**
     * sp值转化为px值
     * @param context
     * @param pxValue
     * @return
     */
    public static int sp2px(Context context,int pxValue){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return (int)(pxValue * dm.density + 0.5);
    }

    /**
     * 获取字体的高度
     * @param paint
     * @return
     */
    public static int getFontHeight(Paint paint) {
        Paint.FontMetrics fm = paint.getFontMetrics();
        return (int) Math.ceil(fm.descent - fm.ascent) + 2;
    }

    /**
     * 获取屏幕宽度，px
     * @param context
     * @return
     */
    public static int getWidthPx(Context context){
        DisplayMetrics dm = new DisplayMetrics();
        dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 获取屏幕高度，px
     * @param context
     * @return
     */
    public static int getHeightPx(Context context){
        DisplayMetrics dm = new DisplayMetrics();
        dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    public static int getViewHeight(View view) {
        return view.getLayoutParams().height;
    }

    public static int getViewWidth(View view) {
        return view.getLayoutParams().width;
    }

    /**
     * 获取屏幕宽度，dp
     * @param context
     * @return
     */
    public static int getWidthDp(Context context) {
        int px = getWidthPx(context);
        return px2dp(context, px);
    }
}
