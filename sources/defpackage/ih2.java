package defpackage;

import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ih2  reason: default package */
public final class ih2 implements fjf<hh2> {
    private final wlf<y> a;
    private final wlf<g<SetupSubscriptionEvent>> b;

    public ih2(wlf<y> wlf, wlf<g<SetupSubscriptionEvent>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hh2(this.a.get(), this.b.get());
    }
}
