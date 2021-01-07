package defpackage;

import android.util.DisplayMetrics;

/* renamed from: w55  reason: default package */
public final class w55 implements fjf<Integer> {
    private final wlf<DisplayMetrics> a;

    public w55(wlf<DisplayMetrics> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().heightPixels);
    }
}
