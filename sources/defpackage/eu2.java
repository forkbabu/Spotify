package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: eu2  reason: default package */
public final class eu2 implements fjf<DisplayMetrics> {
    private final wlf<Context> a;

    public eu2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        DisplayMetrics displayMetrics = this.a.get().getResources().getDisplayMetrics();
        yif.g(displayMetrics, "Cannot return null from a non-@Nullable @Provides method");
        return displayMetrics;
    }
}
