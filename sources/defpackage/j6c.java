package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: j6c  reason: default package */
public final class j6c implements fjf<i6c> {
    private final wlf<xr3> a;
    private final wlf<g<ContextTrack>> b;

    public j6c(wlf<xr3> wlf, wlf<g<ContextTrack>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i6c(this.a.get(), this.b.get());
    }
}
