package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.h;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: ob6  reason: default package */
public class ob6 {
    private final wlf<lb6> a;
    private final wlf<hb6> b;
    private final wlf<v> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;

    ob6(wlf<lb6> wlf, wlf<hb6> wlf2, wlf<v> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6) {
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

    /* access modifiers changed from: package-private */
    public nb6 b(h hVar, Optional<kb6> optional) {
        lb6 lb6 = this.a.get();
        a(lb6, 1);
        lb6 lb62 = lb6;
        hb6 hb6 = this.b.get();
        a(hb6, 2);
        hb6 hb62 = hb6;
        v vVar = this.c.get();
        a(vVar, 3);
        v vVar2 = vVar;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        String str = this.e.get();
        a(str, 5);
        String str2 = str;
        y yVar = this.f.get();
        a(yVar, 6);
        a(hVar, 7);
        a(optional, 8);
        return new nb6(lb62, hb62, vVar2, wVar2, str2, yVar, hVar, optional);
    }
}
