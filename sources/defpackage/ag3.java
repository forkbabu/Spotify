package defpackage;

import com.spotify.eventsender.j0;

/* renamed from: ag3  reason: default package */
public final class ag3 implements fjf<hl0> {
    private final wlf<j0> a;

    public ag3(wlf<j0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hl0 b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
