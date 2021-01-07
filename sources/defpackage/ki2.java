package defpackage;

import android.os.Build;

/* renamed from: ki2  reason: default package */
public final class ki2 implements fjf<ni2> {
    private final wlf<ti2> a;
    private final wlf<ri2> b;

    public ki2(wlf<ti2> wlf, wlf<ri2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<ti2> wlf = this.a;
        ti2 ti2 = this.b.get();
        if (Build.VERSION.SDK_INT >= 25) {
            ti2 = wlf.get();
        }
        yif.g(ti2, "Cannot return null from a non-@Nullable @Provides method");
        return ti2;
    }
}
