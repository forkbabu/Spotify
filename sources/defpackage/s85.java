package defpackage;

import com.spotify.music.features.addtoplaylist.d;

/* renamed from: s85  reason: default package */
public final class s85 implements fjf<r85> {
    private final wlf<d> a;
    private final wlf<ere> b;
    private final wlf<p71> c;

    public s85(wlf<d> wlf, wlf<ere> wlf2, wlf<p71> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r85(this.a.get(), this.b.get(), this.c.get());
    }
}
