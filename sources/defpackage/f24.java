package defpackage;

import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: f24  reason: default package */
public final class f24 implements fjf<e24> {
    private final wlf<m> a;
    private final wlf<p71> b;
    private final wlf<c8b> c;

    public f24(wlf<m> wlf, wlf<p71> wlf2, wlf<c8b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e24(this.a.get(), this.b.get(), this.c.get());
    }
}
