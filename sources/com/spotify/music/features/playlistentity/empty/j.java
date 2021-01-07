package com.spotify.music.features.playlistentity.empty;

import com.spotify.music.navigation.t;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class j {
    private final wlf<f> a;
    private final wlf<wec> b;
    private final wlf<t> c;
    private final wlf<String> d;
    private final wlf<y> e;

    j(wlf<f> wlf, wlf<wec> wlf2, wlf<t> wlf3, wlf<String> wlf4, wlf<y> wlf5) {
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

    /* access modifiers changed from: package-private */
    public i b() {
        f fVar = this.a.get();
        a(fVar, 1);
        f fVar2 = fVar;
        wec wec = this.b.get();
        a(wec, 2);
        wec wec2 = wec;
        t tVar = this.c.get();
        a(tVar, 3);
        t tVar2 = tVar;
        String str = this.d.get();
        a(str, 4);
        String str2 = str;
        y yVar = this.e.get();
        a(yVar, 5);
        return new i(fVar2, wec2, tVar2, str2, yVar);
    }
}
