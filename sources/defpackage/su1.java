package defpackage;

import com.spotify.playlist.endpoints.d;

/* renamed from: su1  reason: default package */
public final class su1 implements fjf<ru1> {
    private final wlf<d> a;

    public su1(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ru1(this.a.get());
    }
}
