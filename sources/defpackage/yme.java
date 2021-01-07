package defpackage;

import android.app.Activity;
import com.google.android.gms.common.d;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;

/* renamed from: yme  reason: default package */
public final class yme implements fjf<f> {
    private final wlf<Activity> a;
    private final wlf<d> b;
    private final wlf<j> c;

    public yme(wlf<Activity> wlf, wlf<d> wlf2, wlf<j> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
