package defpackage;

import com.spotify.mobile.android.util.o0;
import com.spotify.music.follow.m;

/* renamed from: mmd  reason: default package */
public final class mmd implements fjf<lmd> {
    private final wlf<o0> a;
    private final wlf<m> b;
    private final wlf<jmd> c;

    public mmd(wlf<o0> wlf, wlf<m> wlf2, wlf<jmd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lmd(this.a.get(), this.b.get(), this.c.get());
    }
}
