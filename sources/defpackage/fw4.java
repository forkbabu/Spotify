package defpackage;

import com.spotify.music.settings.a;

/* renamed from: fw4  reason: default package */
public final class fw4 implements fjf<ew4> {
    private final wlf<uda> a;
    private final wlf<a> b;

    public fw4(wlf<uda> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ew4(this.a.get(), this.b.get());
    }
}
