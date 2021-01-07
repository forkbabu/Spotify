package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;

/* renamed from: yx5  reason: default package */
public final class yx5 implements fjf<xx5> {
    private final wlf<o> a;
    private final wlf<Context> b;

    public yx5(wlf<o> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xx5(this.a.get(), this.b.get());
    }
}
