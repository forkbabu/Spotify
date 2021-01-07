package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.features.queue.logging.c;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.m3;

/* renamed from: vw7  reason: default package */
public final class vw7 implements fjf<c> {
    private final wlf<ere> a;
    private final wlf<InteractionLogger> b;
    private final wlf<LegacyPlayerState> c;

    public vw7(wlf<ere> wlf, wlf<InteractionLogger> wlf2, wlf<LegacyPlayerState> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<LegacyPlayerState> wlf = this.c;
        return new c(this.a.get(), new m3(), this.b.get(), wlf);
    }
}
