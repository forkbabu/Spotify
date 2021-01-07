package defpackage;

import com.spotify.music.features.browse.view.a;

/* renamed from: te4  reason: default package */
public final class te4 implements fjf<se4> {
    private final wlf<a> a;

    public te4(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new se4(this.a.get());
    }
}
