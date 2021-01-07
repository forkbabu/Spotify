package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.e1;

/* renamed from: ig9  reason: default package */
public final class ig9 implements fjf<hg9> {
    private final wlf<e1> a;
    private final wlf<jg9> b;

    public ig9(wlf<e1> wlf, wlf<jg9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hg9(this.a.get(), this.b.get());
    }
}
