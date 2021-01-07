package defpackage;

import com.spotify.music.features.freetierartist.discographysortandfilter.a;

/* renamed from: f65  reason: default package */
public final class f65 implements fjf<d65> {
    private final wlf<a> a;

    public f65(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d65(this.a.get());
    }
}
