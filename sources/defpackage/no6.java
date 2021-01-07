package defpackage;

import com.spotify.player.model.PlayOrigin;

/* renamed from: no6  reason: default package */
public final class no6 implements fjf<mo6> {
    private final wlf<PlayOrigin> a;

    public no6(wlf<PlayOrigin> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mo6(this.a);
    }
}
