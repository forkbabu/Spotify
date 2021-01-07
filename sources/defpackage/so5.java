package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.t;

/* renamed from: so5  reason: default package */
public final class so5 implements fjf<ro5> {
    private final wlf<qo5> a;
    private final wlf<cqe> b;
    private final wlf<t> c;
    private final wlf<String> d;
    private final wlf<Context> e;

    public so5(wlf<qo5> wlf, wlf<cqe> wlf2, wlf<t> wlf3, wlf<String> wlf4, wlf<Context> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ro5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
