package defpackage;

import com.spotify.mobile.android.service.media.i2;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: xx8  reason: default package */
public class xx8 {
    private final wlf<g<PlayerState>> a;

    public xx8(wlf<g<PlayerState>> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public wx8 b(i2 i2Var) {
        g<PlayerState> gVar = this.a.get();
        a(gVar, 1);
        a(i2Var, 2);
        return new wx8(gVar, i2Var);
    }
}
