package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.libs.search.history.l;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.music.libs.assistedcuration.presenter.n;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: v14  reason: default package */
public class v14 {
    private final wlf<y> a;
    private final wlf<g<SessionState>> b;
    private final wlf<l> c;
    private final wlf<AssistedCurationLogger.a> d;
    private final wlf<n> e;

    public v14(wlf<y> wlf, wlf<g<SessionState>> wlf2, wlf<l> wlf3, wlf<AssistedCurationLogger.a> wlf4, wlf<n> wlf5) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public u14 b(a aVar, r34 r34) {
        y yVar = this.a.get();
        a(yVar, 1);
        y yVar2 = yVar;
        g<SessionState> gVar = this.b.get();
        a(gVar, 2);
        g<SessionState> gVar2 = gVar;
        l lVar = this.c.get();
        a(lVar, 3);
        l lVar2 = lVar;
        AssistedCurationLogger.a aVar2 = this.d.get();
        a(aVar2, 4);
        AssistedCurationLogger.a aVar3 = aVar2;
        n nVar = this.e.get();
        a(nVar, 5);
        a(aVar, 6);
        a(r34, 7);
        return new u14(yVar2, gVar2, lVar2, aVar3, nVar, aVar, r34);
    }
}
