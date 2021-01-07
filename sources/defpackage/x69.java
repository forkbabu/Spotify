package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.e1;

/* renamed from: x69  reason: default package */
public final class x69 implements fjf<qg9> {
    private final wlf<e1> a;

    public x69(wlf<e1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qg9(this.a.get());
    }
}
