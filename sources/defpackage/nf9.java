package defpackage;

import com.spotify.music.settings.a;

/* renamed from: nf9  reason: default package */
public final class nf9 implements fjf<mf9> {
    private final wlf<oh0> a;
    private final wlf<a> b;

    public nf9(wlf<oh0> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mf9(this.a.get(), this.b.get());
    }
}
