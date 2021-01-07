package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$Policy;
import io.reactivex.s;
import java.util.Map;
import kotlin.jvm.internal.h;

public interface c0 {

    public static final class a {
        private final Optional<Integer> a;
        private final Optional<ane> b;
        private final Optional<String> c;
        private final Optional<ShowsPolicy$Policy> d;
        private final Optional<Show.MediaType> e;
        private final Optional<Show.MediaType> f;
        private final Optional<r> g;

        public a() {
            this(null, null, null, null, null, null, null, 127);
        }

        public a(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, int i) {
            Optional<Integer> optional8;
            Optional<ane> optional9;
            Optional<String> optional10;
            Optional<Show.MediaType> optional11;
            Optional<r> optional12 = null;
            if ((i & 1) != 0) {
                optional8 = Optional.of(100);
                h.d(optional8, "Optional.of(QUERY_THROTTLING_DEFAULT_VALUE)");
            } else {
                optional8 = null;
            }
            if ((i & 2) != 0) {
                zxd zxd = zxd.b;
                optional9 = Optional.of(zxd.a());
                h.d(optional9, "Optional.of(SORT_LATEST_EPISODE_TIME)");
            } else {
                optional9 = null;
            }
            if ((i & 4) != 0) {
                optional10 = Optional.of("protobuf");
                h.d(optional10, "Optional.of(PROTOBUF_FORMAT)");
            } else {
                optional10 = null;
            }
            if ((i & 8) != 0) {
                optional4 = Optional.absent();
                h.d(optional4, "Optional.absent()");
            }
            if ((i & 16) != 0) {
                optional11 = Optional.absent();
                h.d(optional11, "Optional.absent()");
            } else {
                optional11 = null;
            }
            if ((i & 32) != 0) {
                optional6 = Optional.absent();
                h.d(optional6, "Optional.absent()");
            }
            if ((i & 64) != 0) {
                optional12 = Optional.absent();
                h.d(optional12, "Optional.absent()");
            }
            h.e(optional8, "updateThrottlingInMs");
            h.e(optional9, "sortOrder");
            h.e(optional10, "format");
            h.e(optional4, "showPolicy");
            h.e(optional11, "includeMediaType");
            h.e(optional6, "excludeMediaType");
            h.e(optional12, "range");
            this.a = optional8;
            this.b = optional9;
            this.c = optional10;
            this.d = optional4;
            this.e = optional11;
            this.f = optional6;
            this.g = optional12;
        }

        public final Map<String, String> a() {
            byd byd;
            if (this.e.isPresent()) {
                byd = new byd();
                byd.b("mediaTypeEnum", Optional.of(Integer.valueOf(this.e.get().ordinal())));
            } else if (this.f.isPresent()) {
                byd = new byd();
                byd.f("mediaTypeEnum", Optional.of(Integer.valueOf(this.f.get().ordinal())));
            } else {
                byd = new byd();
            }
            cyd cyd = new cyd();
            cyd.f("sort", this.b);
            cyd.e("start", "length", this.g);
            cyd.c("updateThrottling", this.a);
            cyd.d("filter", byd.g());
            cyd.g("responseFormat", this.c);
            Map<String, String> h = cyd.h();
            h.d(h, "QueryParamsBuilder()\n   …\n                .build()");
            return h;
        }

        public final Optional<ShowsPolicy$Policy> b() {
            return this.d;
        }
    }

    s<ryd> a(String str, a aVar);
}
