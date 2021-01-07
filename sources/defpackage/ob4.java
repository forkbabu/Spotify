package defpackage;

import com.spotify.android.flags.c;

/* renamed from: ob4  reason: default package */
public final class ob4 implements fjf<m9b> {
    private final wlf<c> a;
    private final wlf<fm9> b;
    private final wlf<g9b> c;

    public ob4(wlf<c> wlf, wlf<fm9> wlf2, wlf<g9b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        m9b m9b = this.b.get().a(this.a.get()) ? (m9b) ejf.a(this.c).get() : m9b.a;
        yif.g(m9b, "Cannot return null from a non-@Nullable @Provides method");
        return m9b;
    }
}
