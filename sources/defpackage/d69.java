package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.view.n0;

/* renamed from: d69  reason: default package */
public final class d69 implements fjf<c69> {
    private final wlf<n0> a;

    public d69(wlf<n0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c69(this.a.get());
    }
}
