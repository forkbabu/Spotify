package defpackage;

import com.spotify.playlist.models.o;

/* renamed from: h62  reason: default package */
public final class h62 implements fjf<g62<o>> {
    private final wlf<d8a> a;

    public h62(wlf<d8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g62(this.a.get());
    }
}
