package defpackage;

import com.spotify.libs.search.history.j;
import com.spotify.libs.search.history.k;

/* renamed from: x68  reason: default package */
public final class x68 implements fjf<w68> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;
    private final wlf<String> c;
    private final wlf<j> d;
    private final wlf<k> e;
    private final wlf<bc8> f;

    public x68(wlf<Boolean> wlf, wlf<Boolean> wlf2, wlf<String> wlf3, wlf<j> wlf4, wlf<k> wlf5, wlf<bc8> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static x68 a(wlf<Boolean> wlf, wlf<Boolean> wlf2, wlf<String> wlf3, wlf<j> wlf4, wlf<k> wlf5, wlf<bc8> wlf6) {
        return new x68(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w68(this.a.get().booleanValue(), this.b.get().booleanValue(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
