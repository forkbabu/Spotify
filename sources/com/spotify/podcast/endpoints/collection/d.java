package com.spotify.podcast.endpoints.collection;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.r;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

public interface d {

    public static final class a {
        private final Optional<Integer> a;
        private final Optional<String> b;
        private final Optional<CollectionEpisodesPolicy$Policy> c;
        private final Optional<r> d;
        private final Optional<ane> e;

        public a() {
            this(null, null, null, null, null, 31);
        }

        public a(Optional<Integer> optional, Optional<String> optional2, Optional<CollectionEpisodesPolicy$Policy> optional3, Optional<r> optional4, Optional<ane> optional5) {
            h.e(optional, "updateThrottlingInMs");
            h.e(optional2, "format");
            h.e(optional3, "policy");
            h.e(optional4, "range");
            h.e(optional5, "sortOrder");
            this.a = optional;
            this.b = optional2;
            this.c = optional3;
            this.d = optional4;
            this.e = optional5;
        }

        public static a a(a aVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, int i) {
            Optional<ane> optional6 = null;
            Optional<Integer> optional7 = (i & 1) != 0 ? aVar.a : null;
            Optional<String> optional8 = (i & 2) != 0 ? aVar.b : null;
            Optional<CollectionEpisodesPolicy$Policy> optional9 = (i & 4) != 0 ? aVar.c : null;
            if ((i & 8) != 0) {
                optional4 = aVar.d;
            }
            if ((i & 16) != 0) {
                optional6 = aVar.e;
            }
            aVar.getClass();
            h.e(optional7, "updateThrottlingInMs");
            h.e(optional8, "format");
            h.e(optional9, "policy");
            h.e(optional4, "range");
            h.e(optional6, "sortOrder");
            return new a(optional7, optional8, optional9, optional4, optional6);
        }

        public final Optional<CollectionEpisodesPolicy$Policy> b() {
            return this.c;
        }

        public final Map<String, String> c() {
            cyd cyd = new cyd();
            cyd.f("sort", this.e);
            cyd.e("start", "length", this.d);
            cyd.c("updateThrottling", this.a);
            cyd.g("responseFormat", this.b);
            Map<String, String> h = cyd.h();
            h.d(h, "QueryParamsBuilder()\n   …\n                .build()");
            return h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e);
        }

        public int hashCode() {
            Optional<Integer> optional = this.a;
            int i = 0;
            int hashCode = (optional != null ? optional.hashCode() : 0) * 31;
            Optional<String> optional2 = this.b;
            int hashCode2 = (hashCode + (optional2 != null ? optional2.hashCode() : 0)) * 31;
            Optional<CollectionEpisodesPolicy$Policy> optional3 = this.c;
            int hashCode3 = (hashCode2 + (optional3 != null ? optional3.hashCode() : 0)) * 31;
            Optional<r> optional4 = this.d;
            int hashCode4 = (hashCode3 + (optional4 != null ? optional4.hashCode() : 0)) * 31;
            Optional<ane> optional5 = this.e;
            if (optional5 != null) {
                i = optional5.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Configuration(updateThrottlingInMs=");
            V0.append(this.a);
            V0.append(", format=");
            V0.append(this.b);
            V0.append(", policy=");
            V0.append(this.c);
            V0.append(", range=");
            V0.append(this.d);
            V0.append(", sortOrder=");
            return je.F0(V0, this.e, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(com.google.common.base.Optional r7, com.google.common.base.Optional r8, com.google.common.base.Optional r9, com.google.common.base.Optional r10, com.google.common.base.Optional r11, int r12) {
            /*
                r6 = this;
                r7 = r12 & 1
                r8 = 0
                if (r7 == 0) goto L_0x0016
                r7 = 100
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                com.google.common.base.Optional r7 = com.google.common.base.Optional.of(r7)
                java.lang.String r10 = "Optional.of(QUERY_THROTTLING_DEFAULT_VALUE)"
                kotlin.jvm.internal.h.d(r7, r10)
                r1 = r7
                goto L_0x0017
            L_0x0016:
                r1 = r8
            L_0x0017:
                r7 = r12 & 2
                if (r7 == 0) goto L_0x0028
                java.lang.String r7 = "protobuf"
                com.google.common.base.Optional r7 = com.google.common.base.Optional.of(r7)
                java.lang.String r10 = "Optional.of(PROTOBUF_FORMAT)"
                kotlin.jvm.internal.h.d(r7, r10)
                r2 = r7
                goto L_0x0029
            L_0x0028:
                r2 = r8
            L_0x0029:
                r7 = r12 & 4
                java.lang.String r10 = "Optional.absent()"
                if (r7 == 0) goto L_0x0036
                com.google.common.base.Optional r9 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r9, r10)
            L_0x0036:
                r3 = r9
                r7 = r12 & 8
                if (r7 == 0) goto L_0x0044
                com.google.common.base.Optional r7 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r7, r10)
                r4 = r7
                goto L_0x0045
            L_0x0044:
                r4 = r8
            L_0x0045:
                r7 = r12 & 16
                if (r7 == 0) goto L_0x0058
                com.spotify.podcast.endpoints.collection.c r7 = com.spotify.podcast.endpoints.collection.c.c
                ane r7 = r7.a()
                com.google.common.base.Optional r8 = com.google.common.base.Optional.of(r7)
                java.lang.String r7 = "Optional.of(SORT_ORDER_ADD_TIME_AND_NAME)"
                kotlin.jvm.internal.h.d(r8, r7)
            L_0x0058:
                r5 = r8
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.podcast.endpoints.collection.d.a.<init>(com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, int):void");
        }
    }

    s<i<Episode>> a(String str, a aVar);

    z<i<Episode>> b(String str, a aVar);
}
