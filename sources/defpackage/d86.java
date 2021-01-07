package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: d86  reason: default package */
public class d86 {
    private final wlf<y76> a;
    private final wlf<OffliningLogger> b;
    private final wlf<y> c;
    private final wlf<String> d;
    private final wlf<v> e;
    private final wlf<i> f;
    private final wlf<m8c> g;
    private final wlf<t> h;

    d86(wlf<y76> wlf, wlf<OffliningLogger> wlf2, wlf<y> wlf3, wlf<String> wlf4, wlf<v> wlf5, wlf<i> wlf6, wlf<m8c> wlf7, wlf<t> wlf8) {
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
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public b86 b() {
        y76 y76 = this.a.get();
        a(y76, 1);
        y76 y762 = y76;
        OffliningLogger offliningLogger = this.b.get();
        a(offliningLogger, 2);
        OffliningLogger offliningLogger2 = offliningLogger;
        y yVar = this.c.get();
        a(yVar, 3);
        y yVar2 = yVar;
        String str = this.d.get();
        a(str, 4);
        String str2 = str;
        v vVar = this.e.get();
        a(vVar, 5);
        v vVar2 = vVar;
        i iVar = this.f.get();
        a(iVar, 6);
        i iVar2 = iVar;
        m8c m8c = this.g.get();
        a(m8c, 7);
        m8c m8c2 = m8c;
        t tVar = this.h.get();
        a(tVar, 8);
        return new b86(y762, offliningLogger2, yVar2, str2, vVar2, iVar2, m8c2, tVar);
    }
}
