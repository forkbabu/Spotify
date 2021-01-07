package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.w2;

/* renamed from: ed7  reason: default package */
public final class ed7 implements fjf<dd7> {
    private final wlf<t> a;
    private final wlf<p71> b;
    private final wlf<ere> c;
    private final wlf<w2> d;

    public ed7(wlf<t> wlf, wlf<p71> wlf2, wlf<ere> wlf3, wlf<w2> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dd7(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
