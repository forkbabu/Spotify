package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.i0;
import com.spotify.podcast.endpoints.policy.DecorationPolicy;
import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;
import com.spotify.podcast.endpoints.policy.KeyValuePolicy;
import com.spotify.podcast.endpoints.policy.Policy;
import com.spotify.podcast.endpoints.r;
import io.reactivex.z;

public class f implements i0 {
    private static final i0.a b;
    private final i0 a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("isNew", bool);
        builder.mo51put("isInListenLater", bool);
        builder.mo51put("isPlayed", bool);
        builder.mo51put("length", bool);
        builder.mo51put("timeLeft", bool);
        builder.mo51put("playable", bool);
        builder.mo51put("available", bool);
        builder.mo51put("covers", bool);
        builder.mo51put("isExplicit", bool);
        builder.mo51put("freezeFrames", bool);
        builder.mo51put("manifestId", bool);
        builder.mo51put("mediaTypeEnum", bool);
        builder.mo51put("description", bool);
        builder.mo51put("publishDate", bool);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("name", bool);
        builder2.mo51put("link", bool);
        builder2.mo51put("inCollection", bool);
        builder2.mo51put("covers", bool);
        KeyValuePolicy.a builder3 = KeyValuePolicy.builder();
        builder3.a(builder2.build());
        KeyValuePolicy build = builder3.build();
        EpisodeDecorationPolicy.a builder4 = EpisodeDecorationPolicy.builder();
        builder4.b(build);
        builder4.a(builder.build());
        EpisodeDecorationPolicy build2 = builder4.build();
        DecorationPolicy.a builder5 = DecorationPolicy.builder();
        builder5.a(build2);
        DecorationPolicy build3 = builder5.build();
        Policy.a builder6 = Policy.builder();
        builder6.a(build3);
        Policy build4 = builder6.build();
        i0.a.AbstractC0382a b2 = i0.a.b();
        b2.b(Optional.of(build4));
        b2.i(Optional.of(bool));
        b2.a(Optional.of(bool));
        b2.f(Optional.of(Double.valueOf(0.1d)));
        b2.h(Optional.of(120));
        b2.g(Optional.of(10));
        b2.e(Optional.of(30));
        b2.d(r.a(0, 3));
        b2.c(Optional.of(bool));
        b = b2.build();
    }

    public f(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.i0
    public z<i<Episode>> a() {
        return this.a.a(b);
    }
}
