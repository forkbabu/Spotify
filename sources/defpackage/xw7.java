package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.r;

/* renamed from: xw7  reason: default package */
public final class xw7 implements fjf<a> {
    private final wlf<g<PlayerState>> a;

    public xw7(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get().O(uw7.a).C(tw7.a).h0(1));
    }
}
