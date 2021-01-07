package defpackage;

import com.spotify.podcast.endpoints.policy.ShowDecorationPolicy;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import defpackage.r27;
import kotlin.jvm.internal.h;

/* renamed from: y27  reason: default package */
public final class y27 implements fjf<ShowPolicy> {
    private final wlf<ShowDecorationPolicy> a;

    public y27(wlf<ShowDecorationPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ShowDecorationPolicy showDecorationPolicy = this.a.get();
        r27.a aVar = r27.a;
        h.e(showDecorationPolicy, "showDecorationPolicy");
        ShowPolicy.a builder = ShowPolicy.builder();
        builder.a(showDecorationPolicy);
        ShowPolicy build = builder.build();
        h.d(build, "ShowPolicy.builder()\n   …\n                .build()");
        return build;
    }
}
