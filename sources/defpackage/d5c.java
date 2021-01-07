package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: d5c  reason: default package */
public final class d5c implements fjf<c5c> {
    private final wlf<g<Boolean>> a;
    private final wlf<g<ContextTrack>> b;

    public d5c(wlf<g<Boolean>> wlf, wlf<g<ContextTrack>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c5c(this.a.get(), this.b.get());
    }
}
