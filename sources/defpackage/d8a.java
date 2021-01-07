package defpackage;

import com.spotify.mobile.android.util.decorator.d;
import io.reactivex.y;

/* renamed from: d8a  reason: default package */
public class d8a implements d {
    private final wlf<f8a> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public d8a(wlf<f8a> wlf, wlf<y> wlf2, wlf<y> wlf3) {
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

    /* renamed from: b */
    public c8a create() {
        f8a f8a = this.a.get();
        a(f8a, 1);
        y yVar = this.b.get();
        a(yVar, 2);
        y yVar2 = this.c.get();
        a(yVar2, 3);
        return new c8a(f8a, yVar, yVar2);
    }
}
