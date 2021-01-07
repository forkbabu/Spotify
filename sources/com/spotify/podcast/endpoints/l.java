package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

public interface l {

    public static final class a {
        private final Optional<Integer> a;
        private final Optional<Boolean> b;
        private final Optional<String> c;

        public a(Optional optional, Optional optional2, Optional optional3, int i) {
            Optional<Integer> optional4;
            Optional<Boolean> optional5;
            Optional<String> optional6 = null;
            if ((i & 1) != 0) {
                optional4 = Optional.of(100);
                h.d(optional4, "Optional.of(QUERY_THROTTLING_DEFAULT_VALUE)");
            } else {
                optional4 = null;
            }
            if ((i & 2) != 0) {
                optional5 = Optional.of(Boolean.TRUE);
                h.d(optional5, "Optional.of(true)");
            } else {
                optional5 = null;
            }
            if ((i & 4) != 0) {
                optional6 = Optional.of("protobuf");
                h.d(optional6, "Optional.of(RESPONSE_FORMAT_PROTOBUF)");
            }
            h.e(optional4, "updateThrottlingInMs");
            h.e(optional5, "preferredCached");
            h.e(optional6, "format");
            this.a = optional4;
            this.b = optional5;
            this.c = optional6;
        }

        public final Map<String, String> a() {
            if (this.b.isPresent()) {
                Optional.of(String.valueOf(this.b.get().booleanValue()));
            }
            cyd cyd = new cyd();
            cyd.c("updateThrottling", this.a);
            cyd.g("responseFormat", this.c);
            Optional<String> of = Optional.of(String.valueOf(this.b.get().booleanValue()));
            h.d(of, "Optional.of(preferredCached.get().toString())");
            cyd.g("preferCached", of);
            Map<String, String> h = cyd.h();
            h.d(h, "QueryParamsBuilder()\n   …\n                .build()");
            return h;
        }
    }

    z<Map<String, Show>> a(ImmutableList<String> immutableList, a aVar);

    z<Map<String, Episode>> b(ImmutableList<String> immutableList, a aVar);
}
