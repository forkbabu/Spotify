package defpackage;

import com.spotify.mobile.android.util.o0;
import com.spotify.remoteconfig.sc;

/* renamed from: s9b  reason: default package */
public final class s9b implements fjf<r9b> {
    private final wlf<o0> a;
    private final wlf<fwc> b;
    private final wlf<t9b> c;
    private final wlf<sc> d;

    public s9b(wlf<o0> wlf, wlf<fwc> wlf2, wlf<t9b> wlf3, wlf<sc> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r9b(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
