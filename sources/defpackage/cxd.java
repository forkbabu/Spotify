package defpackage;

import com.spotify.player.controls.d;

/* renamed from: cxd  reason: default package */
public final class cxd implements fjf<d> {
    private final wlf<bxd> a;

    public cxd(wlf<bxd> wlf) {
        this.a = wlf;
    }

    public static d a(bxd bxd) {
        d b = bxd.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
