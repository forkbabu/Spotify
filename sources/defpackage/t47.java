package defpackage;

import com.spotify.music.features.podcast.entity.loadedpage.data.a;

/* renamed from: t47  reason: default package */
public final class t47 {
    private final wlf<u47> a;
    private final wlf<y47> b;

    public t47(wlf<u47> wlf, wlf<y47> wlf2) {
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

    public s47 b(a aVar) {
        u47 u47 = this.a.get();
        a(u47, 1);
        y47 y47 = this.b.get();
        a(y47, 2);
        a(aVar, 3);
        return new s47(u47, y47, aVar);
    }
}
