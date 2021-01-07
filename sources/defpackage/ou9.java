package defpackage;

import com.spotify.music.imagepicker.b;
import defpackage.ju9;
import io.reactivex.y;

/* renamed from: ou9  reason: default package */
public final class ou9 implements ju9.a {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<eu9> c;
    private final wlf<b.a> d;

    public ou9(wlf<y> wlf, wlf<y> wlf2, wlf<eu9> wlf3, wlf<b.a> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public ju9 b(qu9 qu9) {
        y yVar = this.a.get();
        a(yVar, 1);
        y yVar2 = yVar;
        y yVar3 = this.b.get();
        a(yVar3, 2);
        y yVar4 = yVar3;
        eu9 eu9 = this.c.get();
        a(eu9, 3);
        eu9 eu92 = eu9;
        b.a aVar = this.d.get();
        a(aVar, 4);
        a(qu9, 5);
        return new nu9(yVar2, yVar4, eu92, aVar, qu9);
    }
}
