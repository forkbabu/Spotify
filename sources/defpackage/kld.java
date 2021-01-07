package defpackage;

import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.subjects.c;
import kotlin.jvm.internal.h;

/* renamed from: kld  reason: default package */
public final class kld implements fjf<g<SetupSubscriptionEvent>> {
    private final wlf<c<SetupSubscriptionEvent>> a;

    public kld(wlf<c<SetupSubscriptionEvent>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c<SetupSubscriptionEvent> cVar = this.a.get();
        h.e(cVar, "subject");
        g<SetupSubscriptionEvent> Y0 = cVar.Y0(BackpressureStrategy.BUFFER);
        h.d(Y0, "subject.toFlowable(BackpressureStrategy.BUFFER)");
        return Y0;
    }
}
