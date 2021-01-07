package defpackage;

import com.spotify.playlist.endpoints.i;

/* renamed from: bcb  reason: default package */
public final class bcb implements fjf<acb> {
    private final wlf<ccb> a;
    private final wlf<i> b;

    public bcb(wlf<ccb> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new acb(this.a.get(), this.b.get());
    }
}
