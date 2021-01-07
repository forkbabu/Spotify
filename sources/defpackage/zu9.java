package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.t;

/* renamed from: zu9  reason: default package */
public final class zu9 implements fjf<yu9> {
    private final wlf<Activity> a;
    private final wlf<zk4> b;
    private final wlf<t> c;
    private final wlf<q71> d;
    private final wlf<wu9> e;

    public zu9(wlf<Activity> wlf, wlf<zk4> wlf2, wlf<t> wlf3, wlf<q71> wlf4, wlf<wu9> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yu9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
