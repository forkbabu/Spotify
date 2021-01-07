package defpackage;

import com.spotify.android.flags.c;

/* renamed from: kk5  reason: default package */
public final class kk5 implements fjf<m9b> {
    private final wlf<c> a;
    private final wlf<g9b> b;

    public kk5(wlf<c> wlf, wlf<g9b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        m9b m9b = z42.y(this.a.get()) ? m9b.a : (m9b) ejf.a(this.b).get();
        yif.g(m9b, "Cannot return null from a non-@Nullable @Provides method");
        return m9b;
    }
}
