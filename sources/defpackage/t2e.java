package defpackage;

import com.spotify.remoteconfig.ua;
import java.util.List;

/* renamed from: t2e  reason: default package */
public final class t2e implements fjf<s2e> {
    private final wlf<List<o8e>> a;
    private final wlf<f3e> b;
    private final wlf<q7e> c;
    private final wlf<w7e> d;
    private final wlf<l9e> e;
    private final wlf<ua> f;
    private final wlf<u8e> g;

    public t2e(wlf<List<o8e>> wlf, wlf<f3e> wlf2, wlf<q7e> wlf3, wlf<w7e> wlf4, wlf<l9e> wlf5, wlf<ua> wlf6, wlf<u8e> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static s2e a(List<o8e> list, f3e f3e, q7e q7e, w7e w7e, l9e l9e, ua uaVar, u8e u8e) {
        return new s2e(list, f3e, q7e, w7e, l9e, uaVar, u8e);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
