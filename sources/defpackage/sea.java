package defpackage;

import com.google.protobuf.u;
import com.spotify.libs.connect.providers.v;

/* renamed from: sea  reason: default package */
public final class sea implements fjf<qea> {
    private final wlf<gl0<u>> a;
    private final wlf<tea> b;
    private final wlf<v> c;
    private final wlf<ere> d;
    private final wlf<oea> e;
    private final wlf<lea> f;

    public sea(wlf<gl0<u>> wlf, wlf<tea> wlf2, wlf<v> wlf3, wlf<ere> wlf4, wlf<oea> wlf5, wlf<lea> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qea(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
