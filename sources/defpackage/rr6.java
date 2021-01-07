package defpackage;

import com.spotify.playlist.endpoints.d;

/* renamed from: rr6  reason: default package */
public final class rr6 implements fjf<qr6> {
    private final wlf<d> a;

    public rr6(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qr6(this.a.get());
    }
}
