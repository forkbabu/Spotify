package defpackage;

import com.spotify.player.queue.f;
import kotlin.jvm.internal.h;

/* renamed from: dec  reason: default package */
public final class dec implements fjf<bec> {
    private final wlf<cec> a;
    private final wlf<f> b;

    public dec(wlf<cec> wlf, wlf<f> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static bec a(cec cec, f fVar) {
        h.e(cec, "playActionHandlerFactory");
        h.e(fVar, "playerQueueInteractor");
        bec a2 = cec.a(fVar);
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
