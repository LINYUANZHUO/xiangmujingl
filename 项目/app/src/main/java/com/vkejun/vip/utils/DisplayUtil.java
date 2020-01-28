package com.vkejun.vip.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

public class DisplayUtil {
    public static int dp2px(Context paramContext, float paramFloat) {
        return (int)((paramContext.getResources().getDisplayMetrics()).density * paramFloat + 0.5F);
    }

    public static Point getScreenSize(Context paramContext) {
        Point point = new Point();
        ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static int px2dp(Context paramContext, float paramFloat) {
        return (int)(paramFloat / (paramContext.getResources().getDisplayMetrics()).density + 0.5F);
    }
}


