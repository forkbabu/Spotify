package defpackage;

import com.spotify.music.playlist.ui.h0;
import defpackage.iw4;

/* renamed from: jw4  reason: default package */
public final class jw4 implements iw4.a {
    private final wlf<h0> a;

    public jw4(wlf<h0> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.iw4.a
    public iw4 a(iw4.b bVar) {
        h0 h0Var = this.a.get();
        b(h0Var, 1);
        b(bVar, 2);
        return new iw4(h0Var, bVar);
    }
}
