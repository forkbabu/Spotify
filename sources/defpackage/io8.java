package defpackage;

import com.spotify.music.features.tasteonboarding.f;

/* renamed from: io8  reason: default package */
public final class io8 implements fjf<ho8> {
    private final wlf<lo8> a;
    private final wlf<Boolean> b;
    private final wlf<f> c;

    public io8(wlf<lo8> wlf, wlf<Boolean> wlf2, wlf<f> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ho8(this.a.get(), this.b.get().booleanValue(), this.c.get());
    }
}
