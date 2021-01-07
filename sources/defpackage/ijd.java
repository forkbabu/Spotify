package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;

/* renamed from: ijd  reason: default package */
public final class ijd implements fjf<hjd> {
    private final wlf<jz1> a;
    private final wlf<LegacyPlayerState> b;
    private final wlf<ere> c;

    public ijd(wlf<jz1> wlf, wlf<LegacyPlayerState> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hjd(this.a.get(), this.b, this.c.get());
    }
}
