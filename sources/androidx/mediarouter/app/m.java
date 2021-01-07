package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.a;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public final class m {
    static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int p = p(contextThemeWrapper, C0707R.attr.mediaRouteTheme);
        return p != 0 ? new ContextThemeWrapper(contextThemeWrapper, p) : contextThemeWrapper;
    }

    static Context b(Context context, int i, boolean z) {
        if (i == 0) {
            i = p(context, !z ? C0707R.attr.dialogTheme : C0707R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return p(contextThemeWrapper, C0707R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int c(Context context) {
        int p = p(context, C0707R.attr.mediaRouteTheme);
        return p == 0 ? l(context) : p;
    }

    static int d(Context context) {
        int o = o(context, 0, C0707R.attr.colorPrimary);
        return s2.b(o, o(context, 0, 16842801)) < 3.0d ? o(context, 0, C0707R.attr.colorAccent) : o;
    }

    static Drawable e(Context context) {
        return j(context, C0707R.drawable.mr_cast_checkbox);
    }

    static int f(Context context, int i) {
        if (s2.b(-1, o(context, i, C0707R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    static Drawable g(Context context) {
        return i(context, C0707R.attr.mediaRouteDefaultIconDrawable);
    }

    static float h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    private static Drawable i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable l = a.l(obtainStyledAttributes.getDrawable(0));
        if (r(context)) {
            a.h(l, androidx.core.content.a.b(context, C0707R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return l;
    }

    private static Drawable j(Context context, int i) {
        Drawable l = a.l(androidx.core.content.a.d(context, i));
        if (r(context)) {
            a.h(l, androidx.core.content.a.b(context, C0707R.color.mr_dynamic_dialog_icon_light));
        }
        return l;
    }

    static Drawable k(Context context) {
        return j(context, C0707R.drawable.mr_cast_mute_button);
    }

    private static int l(Context context) {
        return r(context) ? f(context, 0) == -570425344 ? C0707R.style.res_2132083573_theme_mediarouter_light : C0707R.style.res_2132083574_theme_mediarouter_light_darkcontrolpanel : f(context, 0) == -570425344 ? C0707R.style.res_2132083575_theme_mediarouter_lightcontrolpanel : C0707R.style.res_2132083572_theme_mediarouter;
    }

    static Drawable m(Context context) {
        return i(context, C0707R.attr.mediaRouteSpeakerIconDrawable);
    }

    static Drawable n(Context context) {
        return i(context, C0707R.attr.mediaRouteSpeakerGroupIconDrawable);
    }

    private static int o(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    static int p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    static Drawable q(Context context) {
        return i(context, C0707R.attr.mediaRouteTvIconDrawable);
    }

    private static boolean r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C0707R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    static void s(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(androidx.core.content.a.b(context, r(context) ? C0707R.color.mr_dynamic_dialog_background_light : C0707R.color.mr_dynamic_dialog_background_dark));
    }

    static void t(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(androidx.core.content.a.b(context, r(context) ? C0707R.color.mr_cast_progressbar_progress_and_thumb_light : C0707R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    static void u(Context context, View view, View view2, boolean z) {
        int o = o(context, 0, C0707R.attr.colorPrimary);
        int o2 = o(context, 0, C0707R.attr.colorPrimaryDark);
        if (z && f(context, 0) == -570425344) {
            o2 = o;
            o = -1;
        }
        view.setBackgroundColor(o);
        view2.setBackgroundColor(o2);
        view.setTag(Integer.valueOf(o));
        view2.setTag(Integer.valueOf(o2));
    }

    static void v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int i;
        int i2;
        if (r(context)) {
            i2 = androidx.core.content.a.b(context, C0707R.color.mr_cast_progressbar_progress_and_thumb_light);
            i = androidx.core.content.a.b(context, C0707R.color.mr_cast_progressbar_background_light);
        } else {
            i2 = androidx.core.content.a.b(context, C0707R.color.mr_cast_progressbar_progress_and_thumb_dark);
            i = androidx.core.content.a.b(context, C0707R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(i2, i);
    }

    static void w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int f = f(context, 0);
        if (Color.alpha(f) != 255) {
            f = s2.e(f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(f, f);
    }
}
