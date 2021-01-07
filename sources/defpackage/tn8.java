package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.j;
import com.spotify.music.features.tasteonboarding.c;

/* renamed from: tn8  reason: default package */
public final class tn8 implements fjf<sn8> {
    private final wlf<c> a;
    private final wlf<j> b;
    private final wlf<sm8> c;
    private final wlf<mn8> d;

    public tn8(wlf<c> wlf, wlf<j> wlf2, wlf<sm8> wlf3, wlf<mn8> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sn8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
