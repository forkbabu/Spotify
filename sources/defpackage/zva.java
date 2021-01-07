package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import java.util.Set;

/* renamed from: zva  reason: default package */
public final class zva implements fjf<yva> {
    private final wlf<pwa<Entity>> a;
    private final wlf<hsa<Entity>> b;
    private final wlf<fwa> c;
    private final wlf<isa> d;
    private final wlf<uua> e;
    private final wlf<Set<axa<Entity>>> f;

    public zva(wlf<pwa<Entity>> wlf, wlf<hsa<Entity>> wlf2, wlf<fwa> wlf3, wlf<isa> wlf4, wlf<uua> wlf5, wlf<Set<axa<Entity>>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static zva a(wlf<pwa<Entity>> wlf, wlf<hsa<Entity>> wlf2, wlf<fwa> wlf3, wlf<isa> wlf4, wlf<uua> wlf5, wlf<Set<axa<Entity>>> wlf6) {
        return new zva(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yva(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
