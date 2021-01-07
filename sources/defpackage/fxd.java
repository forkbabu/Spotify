package defpackage;

import com.spotify.player.queue.f;

/* renamed from: fxd  reason: default package */
public final class fxd implements fjf<f> {
    private final wlf<bxd> a;

    public fxd(wlf<bxd> wlf) {
        this.a = wlf;
    }

    public static f a(bxd bxd) {
        f a2 = bxd.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
