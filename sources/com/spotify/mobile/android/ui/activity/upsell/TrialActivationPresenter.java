package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.container.app.foregroundstate.d;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class TrialActivationPresenter {
    private final s<SessionState> a;
    private final g b;
    private final d c;
    private final jz1 d;
    private final cqe e;
    private b f;

    protected static class ActivationRequestFailed extends Exception {
        private static final long serialVersionUID = -6312514027692230924L;

        protected ActivationRequestFailed() {
        }
    }

    public TrialActivationPresenter(yz1 yz1, g gVar, d dVar, jz1 jz1, cqe cqe, a aVar, y yVar, y yVar2, g<SessionState> gVar2) {
        this.b = gVar;
        s<Boolean> a2 = yz1.a();
        gVar2.getClass();
        v vVar = new v(gVar2);
        this.c = dVar;
        this.d = jz1;
        this.e = cqe;
        this.a = a2.J0(new e(vVar)).J0(b.a).Q(f.a).N0(1).T0(3, TimeUnit.MINUTES, yVar).o0(yVar2).H(aVar);
    }

    public void a() {
        ((PremiumActivationNotificationStyleStrategy) this.b).a();
        b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public /* synthetic */ void b(SessionState sessionState) {
        ((PremiumActivationNotificationStyleStrategy) this.b).a();
        if (!this.c.a()) {
            ((PremiumActivationNotificationStyleStrategy) this.b).c();
        }
    }

    public void c(Throwable th) {
        this.d.a(new da1(null, kfd.y1.getName(), ViewUris.c1.toString(), th.toString(), 0, null, "trial_activation_failed", "notification", (double) this.e.d()));
        ((PremiumActivationNotificationStyleStrategy) this.b).a();
        if (!(th instanceof IllegalStateException)) {
            ((PremiumActivationNotificationStyleStrategy) this.b).d();
        }
    }

    public void d() {
        this.d.a(new da1(null, kfd.y1.getName(), ViewUris.c1.toString(), null, 0, null, "trial_activation_started", "notification", (double) this.e.d()));
        ((PremiumActivationNotificationStyleStrategy) this.b).e();
        this.f = this.a.subscribe(new c(this), new d(this));
    }
}
