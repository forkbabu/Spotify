package defpackage;

import android.util.DisplayMetrics;

/* renamed from: x55  reason: default package */
public final class x55 implements fjf<Integer> {
    private final wlf<DisplayMetrics> a;

    public x55(wlf<DisplayMetrics> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().widthPixels);
    }
}
