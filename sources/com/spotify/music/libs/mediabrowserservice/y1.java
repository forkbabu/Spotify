package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.connection.l;
import io.reactivex.y;

public class y1 {
    private final wlf<l> a;
    private final wlf<o2> b;
    private final wlf<y> c;

    public y1(wlf<l> wlf, wlf<o2> wlf2, wlf<y> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public x1 b(MediaSessionCompat mediaSessionCompat, h3 h3Var) {
        l lVar = this.a.get();
        a(lVar, 1);
        l lVar2 = lVar;
        o2 o2Var = this.b.get();
        a(o2Var, 2);
        o2 o2Var2 = o2Var;
        y yVar = this.c.get();
        a(yVar, 3);
        a(mediaSessionCompat, 4);
        a(h3Var, 5);
        return new x1(lVar2, o2Var2, yVar, mediaSessionCompat, h3Var);
    }
}
