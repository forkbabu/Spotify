package defpackage;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import com.spotify.podcast.endpoints.x;
import defpackage.r27;
import kotlin.jvm.internal.h;

/* renamed from: x27  reason: default package */
public final class x27 implements fjf<x.a> {
    private final wlf<ShowPolicy> a;

    public x27(wlf<ShowPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ShowPolicy showPolicy = this.a.get();
        r27.a aVar = r27.a;
        h.e(showPolicy, "showPolicy");
        x.a.AbstractC0383a b = x.a.b();
        b.b(Optional.of(showPolicy));
        b.c(Optional.of(Boolean.TRUE));
        b.f(Optional.absent());
        b.h(Optional.of(15));
        b.e(Optional.of("resumePoint"));
        b.j(Optional.of(Boolean.FALSE));
        x.a build = b.build();
        h.d(build, "ShowEntityEndpoint.Confi…\n                .build()");
        return build;
    }
}
