package defpackage;

import com.spotify.music.features.madeforyouhub.view.b;

/* renamed from: ip5  reason: default package */
public final class ip5 implements fjf<b> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public ip5(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
