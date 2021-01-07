package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;
import com.spotify.podcast.endpoints.policy.KeyValuePolicy;
import defpackage.g37;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: i37  reason: default package */
public final class i37 implements fjf<EpisodeDecorationPolicy> {
    private final wlf<Map<String, Boolean>> a;
    private final wlf<Map<String, Boolean>> b;
    private final wlf<Map<String, Boolean>> c;

    public i37(wlf<Map<String, Boolean>> wlf, wlf<Map<String, Boolean>> wlf2, wlf<Map<String, Boolean>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Map<String, Boolean> map = this.a.get();
        Map<String, Boolean> map2 = this.b.get();
        Map<String, Boolean> map3 = this.c.get();
        g37.a aVar = g37.a;
        h.e(map, "showAttributesMap");
        h.e(map2, "podcastSegmentsAttributesMap");
        h.e(map3, "episodeAttributesMap");
        EpisodeDecorationPolicy.a builder = EpisodeDecorationPolicy.builder();
        KeyValuePolicy.a builder2 = KeyValuePolicy.builder();
        builder2.a(ImmutableMap.copyOf(map));
        builder.b(builder2.build());
        KeyValuePolicy.a builder3 = KeyValuePolicy.builder();
        builder3.a(ImmutableMap.copyOf(map2));
        builder.c(builder3.build());
        builder.a(ImmutableMap.copyOf(map3));
        EpisodeDecorationPolicy build = builder.build();
        h.d(build, "EpisodeDecorationPolicy.…\n                .build()");
        return build;
    }
}
