package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.k;

/* renamed from: dsb  reason: default package */
public final class dsb implements fjf<csb> {
    private final wlf<Activity> a;
    private final wlf<k> b;

    public dsb(wlf<Activity> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new csb(this.a.get(), this.b.get());
    }
}
