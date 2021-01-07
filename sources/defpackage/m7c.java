package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: m7c  reason: default package */
public final class m7c implements fjf<l7c> {
    private final wlf<g<ContextTrack>> a;

    public m7c(wlf<g<ContextTrack>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l7c(this.a.get());
    }
}
