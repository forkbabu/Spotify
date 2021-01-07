package com.spotify.android.goldenpath;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

public final class a {
    public static void a(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 19 && dialog.getWindow() != null) {
            dialog.getWindow().addFlags(67108864);
        }
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 19 && (context instanceof Activity)) {
            ((Activity) context).getWindow().addFlags(67108864);
        }
    }

    public static ViewGroup.LayoutParams c(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(C0707R.layout.paste_match_parent_width);
        while (layout.nextToken() != 2) {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return viewGroup.generateLayoutParams(layout);
    }

    public static int d(Context context) {
        return e(context.getResources());
    }

    public static int e(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static int f(Context context) {
        if (g(context)) {
            return e(context.getResources());
        }
        return 0;
    }

    public static boolean g(Context context) {
        if (Build.VERSION.SDK_INT >= 19 && (context instanceof Activity) && (((Activity) context).getWindow().getAttributes().flags & 67108864) != 0) {
            return true;
        }
        return false;
    }
}
