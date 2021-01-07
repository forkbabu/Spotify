package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.t;

/* renamed from: tw9  reason: default package */
public final class tw9 implements fjf<sw9> {
    private final wlf<Context> a;
    private final wlf<sx9> b;
    private final wlf<wx9> c;
    private final wlf<t> d;

    public tw9(wlf<Context> wlf, wlf<sx9> wlf2, wlf<wx9> wlf3, wlf<t> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sw9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
