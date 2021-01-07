package defpackage;

import com.spotify.music.features.ads.a2;
import io.reactivex.y;

/* renamed from: mq3  reason: default package */
public final class mq3 {
    private final wlf<ds3> a;
    private final wlf<tt3> b;
    private final wlf<ms3> c;
    private final wlf<zr3> d;
    private final wlf<y> e;

    public mq3(wlf<ds3> wlf, wlf<tt3> wlf2, wlf<ms3> wlf3, wlf<zr3> wlf4, wlf<y> wlf5) {
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

    public lq3 b(a2 a2Var) {
        ds3 ds3 = this.a.get();
        a(ds3, 1);
        ds3 ds32 = ds3;
        tt3 tt3 = this.b.get();
        a(tt3, 2);
        tt3 tt32 = tt3;
        ms3 ms3 = this.c.get();
        a(ms3, 3);
        ms3 ms32 = ms3;
        zr3 zr3 = this.d.get();
        a(zr3, 4);
        zr3 zr32 = zr3;
        y yVar = this.e.get();
        a(yVar, 5);
        a(a2Var, 6);
        return new lq3(ds32, tt32, ms32, zr32, yVar, a2Var);
    }
}
