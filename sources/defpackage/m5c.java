package defpackage;

import com.spotify.music.nowplaying.common.view.logging.c;

/* renamed from: m5c  reason: default package */
public final class m5c implements fjf<l5c> {
    private final wlf<c> a;

    public m5c(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l5c(this.a.get());
    }
}
