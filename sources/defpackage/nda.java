package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.volume.g;

/* renamed from: nda  reason: default package */
public final class nda implements fjf<mda> {
    private final wlf<g> a;
    private final wlf<j> b;

    public nda(wlf<g> wlf, wlf<j> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mda(this.a.get(), this.b.get());
    }
}
