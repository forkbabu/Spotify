package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.view.p0;

/* renamed from: v59  reason: default package */
public final class v59 implements fjf<u59> {
    private final wlf<p0> a;

    public v59(wlf<p0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u59(this.a.get());
    }
}
