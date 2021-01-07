package defpackage;

import com.spotify.mobile.android.util.LinkType;
import java.util.List;

/* renamed from: e2d  reason: default package */
public final class e2d implements fjf<d2d> {
    private final wlf<List<o8e>> a;
    private final wlf<f3e> b;
    private final wlf<q7e> c;
    private final wlf<List<LinkType>> d;
    private final wlf<r2e> e;

    public e2d(wlf<List<o8e>> wlf, wlf<f3e> wlf2, wlf<q7e> wlf3, wlf<List<LinkType>> wlf4, wlf<r2e> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d2d a(List<o8e> list, f3e f3e, q7e q7e, List<LinkType> list2, r2e r2e) {
        return new d2d(list, f3e, q7e, list2, r2e);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
