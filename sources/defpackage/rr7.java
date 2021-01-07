package defpackage;

import android.app.Activity;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.features.profile.entity.i;

/* renamed from: rr7  reason: default package */
public final class rr7 implements fjf<qr7> {
    private final wlf<Activity> a;
    private final wlf<d> b;
    private final wlf<lqa> c;
    private final wlf<ek7> d;
    private final wlf<i> e;
    private final wlf<hq7> f;
    private final wlf<gk7> g;
    private final wlf<il7> h;
    private final wlf<Boolean> i;

    public rr7(wlf<Activity> wlf, wlf<d> wlf2, wlf<lqa> wlf3, wlf<ek7> wlf4, wlf<i> wlf5, wlf<hq7> wlf6, wlf<gk7> wlf7, wlf<il7> wlf8, wlf<Boolean> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static rr7 a(wlf<Activity> wlf, wlf<d> wlf2, wlf<lqa> wlf3, wlf<ek7> wlf4, wlf<i> wlf5, wlf<hq7> wlf6, wlf<gk7> wlf7, wlf<il7> wlf8, wlf<Boolean> wlf9) {
        return new rr7(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qr7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
