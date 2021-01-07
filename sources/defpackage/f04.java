package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.ui.k;

/* renamed from: f04  reason: default package */
public final class f04 {
    private final wlf<xz3> a;
    private final wlf<b61> b;
    private final wlf<e61> c;
    private final wlf<Resources> d;
    private final wlf<k> e;
    private final wlf<xv3> f;

    public f04(wlf<xz3> wlf, wlf<b61> wlf2, wlf<e61> wlf3, wlf<Resources> wlf4, wlf<k> wlf5, wlf<xv3> wlf6) {
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

    public e04 b(b91 b91) {
        xz3 xz3 = this.a.get();
        a(xz3, 1);
        xz3 xz32 = xz3;
        b61 b61 = this.b.get();
        a(b61, 2);
        b61 b612 = b61;
        e61 e61 = this.c.get();
        a(e61, 3);
        e61 e612 = e61;
        Resources resources = this.d.get();
        a(resources, 4);
        Resources resources2 = resources;
        k kVar = this.e.get();
        a(kVar, 5);
        k kVar2 = kVar;
        xv3 xv3 = this.f.get();
        a(xv3, 6);
        a(b91, 7);
        return new e04(xz32, b612, e612, resources2, kVar2, xv3, b91);
    }
}
