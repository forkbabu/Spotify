package defpackage;

import android.content.Context;
import com.spotify.mobile.android.rx.w;

/* renamed from: yg1  reason: default package */
public final class yg1 implements fjf<xg1> {
    private final wlf<Context> a;
    private final wlf<w> b;

    public yg1(wlf<Context> wlf, wlf<w> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xg1(this.a.get(), this.b.get());
    }
}
