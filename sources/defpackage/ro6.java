package defpackage;

import com.spotify.music.features.playlistentity.configuration.f;
import defpackage.po6;

/* access modifiers changed from: package-private */
/* renamed from: ro6  reason: default package */
public final class ro6 implements po6.a {
    private final wlf<jo6> a;
    private final wlf<mo6> b;
    private final wlf<bre> c;

    ro6(wlf<jo6> wlf, wlf<mo6> wlf2, wlf<bre> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.po6.a
    public po6 a(a76 a76, f fVar) {
        jo6 jo6 = this.a.get();
        b(jo6, 1);
        jo6 jo62 = jo6;
        mo6 mo6 = this.b.get();
        b(mo6, 2);
        mo6 mo62 = mo6;
        bre bre = this.c.get();
        b(bre, 3);
        b(a76, 4);
        b(fVar, 5);
        return new qo6(jo62, mo62, bre, a76, fVar);
    }
}
