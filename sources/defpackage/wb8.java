package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: wb8  reason: default package */
public final class wb8 implements fjf<ob8> {
    private final wlf<zb8> a;
    private final wlf<q3> b;

    public wb8(wlf<zb8> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().e(ViewUris.f2.toString()).a());
    }
}
