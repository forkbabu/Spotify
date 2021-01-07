package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: onb  reason: default package */
public final class onb implements fjf<nnb> {
    private final wlf<g<ContextTrack>> a;

    public onb(wlf<g<ContextTrack>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nnb(this.a.get());
    }
}
