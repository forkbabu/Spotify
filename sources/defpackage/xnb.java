package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: xnb  reason: default package */
public final class xnb implements fjf<wnb> {
    private final wlf<g<ContextTrack>> a;

    public xnb(wlf<g<ContextTrack>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wnb(this.a.get());
    }
}
