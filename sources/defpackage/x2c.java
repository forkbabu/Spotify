package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: x2c  reason: default package */
public final class x2c {
    private final wlf<g<PlayerState>> a;

    public x2c(wlf<g<PlayerState>> wlf) {
        if (wlf != null) {
            this.a = wlf;
            return;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
