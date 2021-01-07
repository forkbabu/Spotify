package com.spotify.eventsender;

import com.google.common.base.Optional;
import com.spotify.messages.RejectedClientEventNonAuth;
import io.reactivex.g;
import io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.a;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class m0 implements hl0 {
    private final g0 a;
    private final kl0 b;
    private final f0 c;
    private final PublishProcessor<q0> d;

    m0(g0 g0Var, kl0 kl0, f0 f0Var) {
        PublishProcessor<q0> r0 = PublishProcessor.r0();
        this.d = r0;
        this.a = g0Var;
        this.b = kl0;
        this.c = f0Var;
        g<q0> Q = r0.R().Q(a.d());
        j jVar = new j(this);
        io.reactivex.internal.functions.a.d(2, "prefetch");
        new FlowableConcatMapCompletable(Q, jVar, ErrorMode.IMMEDIATE, 2).G(a.d()).subscribe(m.a, new k(this));
    }

    private void e(q0 q0Var, String str) {
        try {
            if (q0Var.c().length <= 5120) {
                this.a.a(q0Var.b(), q0Var.c(), q0Var.a(), str);
                return;
            }
            g0 g0Var = this.a;
            String b2 = q0Var.b();
            RejectedClientEventNonAuth.b l = RejectedClientEventNonAuth.l();
            l.m(b2);
            l.n("PAYLOAD_SIZE_LIMIT_EXCEEDED");
            g0Var.a("RejectedClientEventNonAuth", l.build().toByteArray(), false, null);
            this.b.w(String.format(Locale.US, "Size of event %s exceeds maximum allowed payload size of %d bytes", q0Var.b(), 5120));
        } catch (Exception e) {
            this.b.a(e, "Error persisting event.");
        }
    }

    @Override // defpackage.hl0
    public void a(String str, byte[] bArr) {
        this.d.onNext(new y(str, bArr, false));
    }

    @Override // defpackage.hl0
    public void b(String str, byte[] bArr) {
        this.d.onNext(new y(str, bArr, true));
    }

    public void c(q0 q0Var) {
        Optional<String> a2 = this.c.a();
        if (!q0Var.a()) {
            e(q0Var, null);
        } else if (!this.c.b(a2)) {
            this.b.w(String.format("An authenticated event %s was dropped by EventSender because the SDK failed to obtain user name.\nEither you are trying to log an authenticated event before login happens, or you are trying to log before EventSender is been properly initialized.\n\nFor more information see: https://backstage.spotify.net/docs/gabito-docs/event-delivery-sdks/android/limitations/#music-app-only-sending-authenticated-events or reach out to #gabito-users slack channel.", q0Var.b()));
            String b2 = q0Var.b();
            RejectedClientEventNonAuth.b l = RejectedClientEventNonAuth.l();
            l.m(b2);
            l.n("UNKNOWN_OWNER");
            e(new y("RejectedClientEventNonAuth", l.build().toByteArray(), false), null);
        } else {
            e(q0Var, a2.get());
        }
    }

    public /* synthetic */ void d(Throwable th) {
        this.b.a(th, "Error persisting event.");
    }
}
