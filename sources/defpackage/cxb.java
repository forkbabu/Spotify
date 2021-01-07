package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: cxb  reason: default package */
public final class cxb {
    private final wlf<g<PlayerState>> a;

    public cxb(wlf<g<PlayerState>> wlf) {
        if (wlf != null) {
            this.a = wlf;
            return;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
