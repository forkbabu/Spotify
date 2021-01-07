package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.h;

/* renamed from: s15  reason: default package */
public final class s15 implements fjf<Integer> {
    private final wlf<Activity> a;

    public s15(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        h.e(activity, "activity");
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        h.d(windowManager, "windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return Integer.valueOf(displayMetrics.heightPixels);
    }
}
