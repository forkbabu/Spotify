package defpackage;

import com.spotify.music.premiummini.k;

/* renamed from: a66  reason: default package */
public final class a66 implements fjf<z56> {
    private final wlf<kcb> a;
    private final wlf<k> b;
    private final wlf<zec> c;

    public a66(wlf<kcb> wlf, wlf<k> wlf2, wlf<zec> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z56(this.a.get(), this.b.get(), this.c.get());
    }
}
