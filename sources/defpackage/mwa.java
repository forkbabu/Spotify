package defpackage;

import android.app.Activity;
import com.spotify.searchview.proto.Entity;
import java.util.Set;

/* renamed from: mwa  reason: default package */
public final class mwa {
    private final wlf<pwa<Entity>> a;
    private final wlf<awa> b;
    private final wlf<gwa> c;
    private final wlf<Set<axa<Entity>>> d;
    private final wlf<hsa<Entity>> e;
    private final wlf<Activity> f;

    public mwa(wlf<pwa<Entity>> wlf, wlf<awa> wlf2, wlf<gwa> wlf3, wlf<Set<axa<Entity>>> wlf4, wlf<hsa<Entity>> wlf5, wlf<Activity> wlf6) {
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

    public lwa b(Entity entity, wsa wsa) {
        pwa<Entity> pwa = this.a.get();
        a(pwa, 1);
        pwa<Entity> pwa2 = pwa;
        awa awa = this.b.get();
        a(awa, 2);
        awa awa2 = awa;
        gwa gwa = this.c.get();
        a(gwa, 3);
        gwa gwa2 = gwa;
        Set<axa<Entity>> set = this.d.get();
        a(set, 4);
        Set<axa<Entity>> set2 = set;
        hsa<Entity> hsa = this.e.get();
        a(hsa, 5);
        hsa<Entity> hsa2 = hsa;
        Activity activity = this.f.get();
        a(activity, 6);
        a(entity, 7);
        a(wsa, 8);
        return new lwa(pwa2, awa2, gwa2, set2, hsa2, activity, entity, wsa);
    }
}
