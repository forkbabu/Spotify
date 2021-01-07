package defpackage;

import com.spotify.mobile.android.sso.bakery.e;

/* renamed from: occ  reason: default package */
public final class occ implements fjf<lcc> {
    private final wlf<av1> a;
    private final wlf<e> b;

    public occ(wlf<av1> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lcc(this.a.get(), this.b.get());
    }
}
