package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.mobile.android.service.media.z1;

public class g3 {
    private final wlf<Context> a;
    private final wlf<MediaSessionCompat> b;
    private final wlf<z1> c;
    private final wlf<h2> d;
    private final wlf<vja> e;
    private final wlf<pc1> f;
    private final wlf<y1> g;
    private final wlf<f2> h;

    public g3(wlf<Context> wlf, wlf<MediaSessionCompat> wlf2, wlf<z1> wlf3, wlf<h2> wlf4, wlf<vja> wlf5, wlf<pc1> wlf6, wlf<y1> wlf7, wlf<f2> wlf8) {
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

    public f3 b(h3 h3Var) {
        Context context = this.a.get();
        a(context, 1);
        Context context2 = context;
        MediaSessionCompat mediaSessionCompat = this.b.get();
        a(mediaSessionCompat, 2);
        MediaSessionCompat mediaSessionCompat2 = mediaSessionCompat;
        z1 z1Var = this.c.get();
        a(z1Var, 3);
        z1 z1Var2 = z1Var;
        h2 h2Var = this.d.get();
        a(h2Var, 4);
        h2 h2Var2 = h2Var;
        vja vja = this.e.get();
        a(vja, 5);
        vja vja2 = vja;
        pc1 pc1 = this.f.get();
        a(pc1, 6);
        pc1 pc12 = pc1;
        y1 y1Var = this.g.get();
        a(y1Var, 7);
        y1 y1Var2 = y1Var;
        a(h3Var, 8);
        f2 f2Var = this.h.get();
        a(f2Var, 9);
        return new f3(context2, mediaSessionCompat2, z1Var2, h2Var2, vja2, pc12, y1Var2, h3Var, f2Var);
    }
}
