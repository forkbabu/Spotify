package defpackage;

import android.app.Activity;
import com.spotify.searchview.proto.Entity;
import java.util.Set;

/* renamed from: nwa  reason: default package */
public final class nwa implements fjf<mwa> {
    private final wlf<pwa<Entity>> a;
    private final wlf<awa> b;
    private final wlf<gwa> c;
    private final wlf<Set<axa<Entity>>> d;
    private final wlf<hsa<Entity>> e;
    private final wlf<Activity> f;

    public nwa(wlf<pwa<Entity>> wlf, wlf<awa> wlf2, wlf<gwa> wlf3, wlf<Set<axa<Entity>>> wlf4, wlf<hsa<Entity>> wlf5, wlf<Activity> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static nwa a(wlf<pwa<Entity>> wlf, wlf<awa> wlf2, wlf<gwa> wlf3, wlf<Set<axa<Entity>>> wlf4, wlf<hsa<Entity>> wlf5, wlf<Activity> wlf6) {
        return new nwa(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mwa(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
