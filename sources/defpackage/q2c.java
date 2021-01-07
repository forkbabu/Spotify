package defpackage;

import com.spotify.music.nowplaying.common.view.logging.c;

/* renamed from: q2c  reason: default package */
public final class q2c implements fjf<p2c> {
    private final wlf<c> a;

    public q2c(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p2c(this.a.get());
    }
}
