package defpackage;

import com.spotify.music.nowplaying.common.view.heart.f;

/* renamed from: srb  reason: default package */
public final class srb implements fjf<f> {
    private final wlf<Boolean> a;

    public srb(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        if (this.a.get().booleanValue()) {
            return f.d();
        }
        return f.c();
    }
}
