package defpackage;

import com.spotify.music.features.ads.audioplus.topbanner.carousel.a;
import com.spotify.music.features.ads.audioplus.topbanner.d;
import com.squareup.picasso.Picasso;

/* renamed from: zn3  reason: default package */
public final class zn3 {
    private final wlf<d> a;
    private final wlf<Picasso> b;
    private final wlf<nu3> c;

    public zn3(wlf<d> wlf, wlf<Picasso> wlf2, wlf<nu3> wlf3) {
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

    public yn3 b(a aVar) {
        a(aVar, 1);
        d dVar = this.a.get();
        a(dVar, 2);
        Picasso picasso = this.b.get();
        a(picasso, 3);
        nu3 nu3 = this.c.get();
        a(nu3, 4);
        return new yn3(aVar, dVar, picasso, nu3);
    }
}
