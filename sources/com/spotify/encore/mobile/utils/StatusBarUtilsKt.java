package com.spotify.encore.mobile.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import kotlin.jvm.internal.h;

public final class StatusBarUtilsKt {
    public static final int getStatusBarHeight(Resources resources) {
        h.e(resources, "resources");
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static final int getTranslucentStatusBarHeight(Context context) {
        h.e(context, "context");
        if (!isStatusBarTranslucent(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return getStatusBarHeight(resources);
    }

    public static final boolean isStatusBarTranslucent(Context context) {
        h.e(context, "context");
        if (Build.VERSION.SDK_INT < 19 || !(context instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) context).getWindow();
        h.d(window, "context.window");
        if ((window.getAttributes().flags & 67108864) != 0) {
            return true;
        }
        return false;
    }
}
