package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import java.util.Set;

/* renamed from: yva  reason: default package */
public final class yva {
    private final wlf<pwa<Entity>> a;
    private final wlf<hsa<Entity>> b;
    private final wlf<fwa> c;
    private final wlf<isa> d;
    private final wlf<uua> e;
    private final wlf<Set<axa<Entity>>> f;

    public yva(wlf<pwa<Entity>> wlf, wlf<hsa<Entity>> wlf2, wlf<fwa> wlf3, wlf<isa> wlf4, wlf<uua> wlf5, wlf<Set<axa<Entity>>> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public xva b(Entity entity, wsa wsa, String str) {
        pwa<Entity> pwa = this.a.get();
        a(pwa, 1);
        pwa<Entity> pwa2 = pwa;
        hsa<Entity> hsa = this.b.get();
        a(hsa, 2);
        hsa<Entity> hsa2 = hsa;
        fwa fwa = this.c.get();
        a(fwa, 3);
        fwa fwa2 = fwa;
        isa isa = this.d.get();
        a(isa, 4);
        isa isa2 = isa;
        uua uua = this.e.get();
        a(uua, 5);
        uua uua2 = uua;
        Set<axa<Entity>> set = this.f.get();
        a(set, 6);
        a(entity, 7);
        a(wsa, 8);
        a(str, 9);
        return new xva(pwa2, hsa2, fwa2, isa2, uua2, set, entity, wsa, str);
    }
}
