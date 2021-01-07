package defpackage;

import com.spotify.music.features.playlist.participants.presenter.a;
import com.spotify.playlist.endpoints.d;
import defpackage.l06;
import io.reactivex.s;

/* renamed from: m06  reason: default package */
public final class m06 implements l06.a {
    private final wlf<a> a;
    private final wlf<n06> b;

    public m06(wlf<a> wlf, wlf<n06> wlf2) {
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

    public l06 b(s<d.a> sVar) {
        a aVar = this.a.get();
        a(aVar, 1);
        n06 n06 = this.b.get();
        a(n06, 2);
        a(sVar, 3);
        return new l06(aVar, n06, sVar);
    }
}
