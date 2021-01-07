package defpackage;

import com.spotify.playlist.endpoints.d;

/* renamed from: eaa  reason: default package */
public final class eaa implements fjf<caa> {
    private final wlf<l31> a;
    private final wlf<d> b;

    public eaa(wlf<l31> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new caa(this.a.get(), this.b.get());
    }
}
