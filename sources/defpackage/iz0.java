package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.messages.ZeroFrictionFeatureFlagExposureNonAuth;
import com.spotify.messages.ZeroFrictionFeatureFlagFallbackNonAuth;
import com.spotify.messages.ZeroFrictionSicComponentExposureNonAuth;
import com.spotify.music.spotlets.tracker.identifier.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: iz0  reason: default package */
public final class iz0 implements hz0 {
    private final a a;
    private final gl0<u> b;
    private final kx0 c;

    public iz0(a aVar, gl0<u> gl0, kx0 kx0) {
        h.e(aVar, "trackerIds");
        h.e(gl0, "eventPublisher");
        h.e(kx0, "requestIdProvider");
        this.a = aVar;
        this.b = gl0;
        this.c = kx0;
    }

    @Override // defpackage.hz0
    public void a(gz0 gz0) {
        h.e(gz0, "event");
        if (gz0 instanceof ez0) {
            ez0 ez0 = (ez0) gz0;
            ZeroFrictionFeatureFlagExposureNonAuth.b n = ZeroFrictionFeatureFlagExposureNonAuth.n();
            n.o(this.a.f());
            n.p(this.a.b());
            n.m(ez0.a());
            n.n(ez0.b());
            GeneratedMessageLite build = n.build();
            h.d(build, "ZeroFrictionFeatureFlagE…\n                .build()");
            this.b.d(build);
        } else if (gz0 instanceof fz0) {
            ZeroFrictionFeatureFlagFallbackNonAuth.b m = ZeroFrictionFeatureFlagFallbackNonAuth.m();
            m.n(this.a.f());
            m.o(this.a.b());
            m.m(((fz0) gz0).a());
            GeneratedMessageLite build2 = m.build();
            h.d(build2, "ZeroFrictionFeatureFlagF…\n                .build()");
            this.b.d(build2);
        } else if (gz0 instanceof kz0) {
            ZeroFrictionSicComponentExposureNonAuth.b m2 = ZeroFrictionSicComponentExposureNonAuth.m();
            m2.o(this.a.b());
            m2.n(this.c.a());
            m2.m(((kz0) gz0).a());
            GeneratedMessageLite build3 = m2.build();
            h.d(build3, "ZeroFrictionSicComponent…\n                .build()");
            this.b.d(build3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
