package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;
import com.spotify.podcast.endpoints.policy.KeyValuePolicy;
import com.spotify.podcast.endpoints.policy.ShowDecorationPolicy;
import defpackage.r27;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: w27  reason: default package */
public final class w27 implements fjf<ShowDecorationPolicy> {
    private final wlf<EpisodeDecorationPolicy> a;

    public w27(wlf<EpisodeDecorationPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EpisodeDecorationPolicy episodeDecorationPolicy = this.a.get();
        r27.a aVar = r27.a;
        h.e(episodeDecorationPolicy, "episodeDecorationPolicy");
        Boolean bool = Boolean.TRUE;
        Map y = d.y(new Pair("topics", bool), new Pair("trailer", bool), new Pair("htmlDescription", bool));
        ShowDecorationPolicy.a builder = ShowDecorationPolicy.builder();
        builder.a(episodeDecorationPolicy);
        KeyValuePolicy.a builder2 = KeyValuePolicy.builder();
        builder2.a(ImmutableMap.copyOf(y));
        builder.b(builder2.build());
        ShowDecorationPolicy build = builder.build();
        h.d(build, "ShowDecorationPolicy.bui…\n                .build()");
        return build;
    }
}
