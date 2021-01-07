package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: jwa  reason: default package */
public final class jwa {
    private final wlf<pwa<Entity>> a;
    private final wlf<awa> b;

    public jwa(wlf<pwa<Entity>> wlf, wlf<awa> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public iwa b(Entity entity, wsa wsa) {
        pwa<Entity> pwa = this.a.get();
        a(pwa, 1);
        awa awa = this.b.get();
        a(awa, 2);
        a(entity, 3);
        a(wsa, 4);
        return new iwa(pwa, awa, entity, wsa);
    }
}
