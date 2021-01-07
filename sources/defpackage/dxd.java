package defpackage;

import com.spotify.player.play.f;

/* renamed from: dxd  reason: default package */
public final class dxd implements fjf<f> {
    private final wlf<bxd> a;

    public dxd(wlf<bxd> wlf) {
        this.a = wlf;
    }

    public static f a(bxd bxd) {
        f c = bxd.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
