package com.spotify.podcast.endpoints.collection;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.podcast.endpoints.r;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface i {

    public static final class a {
        private final Optional<Integer> a;
        private final Optional<String> b;
        private final Optional<CollectionEpisodesPolicy$Policy> c;
        private final Optional<r> d;
        private final Optional<AbstractC0379a> e;
        private final Optional<ane> f;
        private final Optional<Boolean> g;
        private final Optional<Boolean> h;
        private final Optional<b> i;
        private final Optional<Boolean> j;

        /* renamed from: com.spotify.podcast.endpoints.collection.i$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0379a {
            private final Episode.MediaType a;

            /* renamed from: com.spotify.podcast.endpoints.collection.i$a$a$a  reason: collision with other inner class name */
            public static final class C0380a extends AbstractC0379a {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0380a(Episode.MediaType mediaType) {
                    super(mediaType, null);
                    h.e(mediaType, "mediaType");
                }
            }

            public AbstractC0379a(Episode.MediaType mediaType, f fVar) {
                this.a = mediaType;
            }

            public final Episode.MediaType a() {
                return this.a;
            }
        }

        public static abstract class b {
            private final int a;

            /* renamed from: com.spotify.podcast.endpoints.collection.i$a$b$a  reason: collision with other inner class name */
            public static final class C0381a extends b {
                public C0381a(int i) {
                    super(i, null);
                }
            }

            public b(int i, f fVar) {
                this.a = i;
            }

            public final int a() {
                return this.a;
            }
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, 1023);
        }

        public a(Optional<Integer> optional, Optional<String> optional2, Optional<CollectionEpisodesPolicy$Policy> optional3, Optional<r> optional4, Optional<AbstractC0379a> optional5, Optional<ane> optional6, Optional<Boolean> optional7, Optional<Boolean> optional8, Optional<b> optional9, Optional<Boolean> optional10) {
            h.e(optional, "updateThrottlingInMs");
            h.e(optional2, "format");
            h.e(optional3, "policy");
            h.e(optional4, "range");
            h.e(optional5, "filterMediaType");
            h.e(optional6, "sortOrder");
            h.e(optional7, "availableOnly");
            h.e(optional8, "withGrouping");
            h.e(optional9, "filterTimeLeftInSec");
            h.e(optional10, "filterPlayed");
            this.a = optional;
            this.b = optional2;
            this.c = optional3;
            this.d = optional4;
            this.e = optional5;
            this.f = optional6;
            this.g = optional7;
            this.h = optional8;
            this.i = optional9;
            this.j = optional10;
        }

        public static a a(a aVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, int i2) {
            Optional<Boolean> optional11 = null;
            Optional<Integer> optional12 = (i2 & 1) != 0 ? aVar.a : null;
            Optional<String> optional13 = (i2 & 2) != 0 ? aVar.b : null;
            Optional<CollectionEpisodesPolicy$Policy> optional14 = (i2 & 4) != 0 ? aVar.c : null;
            Optional optional15 = (i2 & 8) != 0 ? aVar.d : optional4;
            Optional<AbstractC0379a> optional16 = (i2 & 16) != 0 ? aVar.e : null;
            Optional<ane> optional17 = (i2 & 32) != 0 ? aVar.f : null;
            Optional<Boolean> optional18 = (i2 & 64) != 0 ? aVar.g : null;
            Optional<Boolean> optional19 = (i2 & 128) != 0 ? aVar.h : null;
            Optional<b> optional20 = (i2 & 256) != 0 ? aVar.i : null;
            if ((i2 & 512) != 0) {
                optional11 = aVar.j;
            }
            aVar.getClass();
            h.e(optional12, "updateThrottlingInMs");
            h.e(optional13, "format");
            h.e(optional14, "policy");
            h.e(optional15, "range");
            h.e(optional16, "filterMediaType");
            h.e(optional17, "sortOrder");
            h.e(optional18, "availableOnly");
            h.e(optional19, "withGrouping");
            h.e(optional20, "filterTimeLeftInSec");
            h.e(optional11, "filterPlayed");
            return new a(optional12, optional13, optional14, optional15, optional16, optional17, optional18, optional19, optional20, optional11);
        }

        public final Optional<CollectionEpisodesPolicy$Policy> b() {
            return this.c;
        }

        public final Map<String, String> c() {
            byd byd = new byd();
            byd.b("available", this.g);
            h.d(byd, "FilterParamsBuilder()\n  …AVAILABLE, availableOnly)");
            Optional<AbstractC0379a> optional = this.e;
            if (optional.isPresent()) {
                AbstractC0379a aVar = optional.get();
                if (aVar instanceof AbstractC0379a.C0380a) {
                    byd.f("mediaTypeEnum", Optional.of(Integer.valueOf(aVar.a().ordinal())));
                }
            }
            Optional<b> optional2 = this.i;
            if (optional2.isPresent()) {
                b bVar = optional2.get();
                if (bVar instanceof b.C0381a) {
                    byd.d("timeLeft", Optional.of(Integer.valueOf(bVar.a())));
                }
            }
            byd.b("isPlayed", this.j);
            List<String> g2 = byd.g();
            cyd cyd = new cyd();
            cyd.f("sort", this.f);
            cyd.e("start", "length", this.d);
            cyd.c("updateThrottling", this.a);
            cyd.g("responseFormat", this.b);
            cyd.d("filter", g2);
            cyd.a("group", this.h);
            Map<String, String> h2 = cyd.h();
            h.d(h2, "QueryParamsBuilder()\n   …\n                .build()");
            return h2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && h.a(this.j, aVar.j);
        }

        public int hashCode() {
            Optional<Integer> optional = this.a;
            int i2 = 0;
            int hashCode = (optional != null ? optional.hashCode() : 0) * 31;
            Optional<String> optional2 = this.b;
            int hashCode2 = (hashCode + (optional2 != null ? optional2.hashCode() : 0)) * 31;
            Optional<CollectionEpisodesPolicy$Policy> optional3 = this.c;
            int hashCode3 = (hashCode2 + (optional3 != null ? optional3.hashCode() : 0)) * 31;
            Optional<r> optional4 = this.d;
            int hashCode4 = (hashCode3 + (optional4 != null ? optional4.hashCode() : 0)) * 31;
            Optional<AbstractC0379a> optional5 = this.e;
            int hashCode5 = (hashCode4 + (optional5 != null ? optional5.hashCode() : 0)) * 31;
            Optional<ane> optional6 = this.f;
            int hashCode6 = (hashCode5 + (optional6 != null ? optional6.hashCode() : 0)) * 31;
            Optional<Boolean> optional7 = this.g;
            int hashCode7 = (hashCode6 + (optional7 != null ? optional7.hashCode() : 0)) * 31;
            Optional<Boolean> optional8 = this.h;
            int hashCode8 = (hashCode7 + (optional8 != null ? optional8.hashCode() : 0)) * 31;
            Optional<b> optional9 = this.i;
            int hashCode9 = (hashCode8 + (optional9 != null ? optional9.hashCode() : 0)) * 31;
            Optional<Boolean> optional10 = this.j;
            if (optional10 != null) {
                i2 = optional10.hashCode();
            }
            return hashCode9 + i2;
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
            V0.append(", filterMediaType=");
            V0.append(this.e);
            V0.append(", sortOrder=");
            V0.append(this.f);
            V0.append(", availableOnly=");
            V0.append(this.g);
            V0.append(", withGrouping=");
            V0.append(this.h);
            V0.append(", filterTimeLeftInSec=");
            V0.append(this.i);
            V0.append(", filterPlayed=");
            return je.F0(V0, this.j, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(com.google.common.base.Optional r12, com.google.common.base.Optional r13, com.google.common.base.Optional r14, com.google.common.base.Optional r15, com.google.common.base.Optional r16, com.google.common.base.Optional r17, com.google.common.base.Optional r18, com.google.common.base.Optional r19, com.google.common.base.Optional r20, com.google.common.base.Optional r21, int r22) {
            /*
                r11 = this;
                r0 = r22
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0017
                r1 = 100
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
                java.lang.String r3 = "Optional.of(QUERY_THROTTLING_DEFAULT_VALUE)"
                kotlin.jvm.internal.h.d(r1, r3)
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0028
                java.lang.String r3 = "protobuf"
                com.google.common.base.Optional r3 = com.google.common.base.Optional.of(r3)
                java.lang.String r4 = "Optional.of(PROTOBUF_FORMAT)"
                kotlin.jvm.internal.h.d(r3, r4)
                goto L_0x0029
            L_0x0028:
                r3 = r2
            L_0x0029:
                r4 = r0 & 4
                java.lang.String r5 = "Optional.absent()"
                if (r4 == 0) goto L_0x0037
                com.google.common.base.Optional r4 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r4, r5)
                goto L_0x0038
            L_0x0037:
                r4 = r14
            L_0x0038:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0043
                com.google.common.base.Optional r2 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r2, r5)
            L_0x0043:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x004f
                com.google.common.base.Optional r6 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r6, r5)
                goto L_0x0051
            L_0x004f:
                r6 = r16
            L_0x0051:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0065
                com.spotify.podcast.endpoints.collection.c r7 = com.spotify.podcast.endpoints.collection.c.c
                ane r7 = r7.a()
                com.google.common.base.Optional r7 = com.google.common.base.Optional.of(r7)
                java.lang.String r8 = "Optional.of(SORT_ORDER_ADD_TIME_AND_NAME)"
                kotlin.jvm.internal.h.d(r7, r8)
                goto L_0x0067
            L_0x0065:
                r7 = r17
            L_0x0067:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0073
                com.google.common.base.Optional r8 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r8, r5)
                goto L_0x0075
            L_0x0073:
                r8 = r18
            L_0x0075:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0081
                com.google.common.base.Optional r9 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r9, r5)
                goto L_0x0083
            L_0x0081:
                r9 = r19
            L_0x0083:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x008f
                com.google.common.base.Optional r10 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r10, r5)
                goto L_0x0091
            L_0x008f:
                r10 = r20
            L_0x0091:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x009d
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                kotlin.jvm.internal.h.d(r0, r5)
                goto L_0x009f
            L_0x009d:
                r0 = r21
            L_0x009f:
                r12 = r11
                r13 = r1
                r14 = r3
                r15 = r4
                r16 = r2
                r17 = r6
                r18 = r7
                r19 = r8
                r20 = r9
                r21 = r10
                r22 = r0
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.podcast.endpoints.collection.i.a.<init>(com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, com.google.common.base.Optional, int):void");
        }
    }

    z<com.spotify.playlist.models.i<Episode>> a(String str, a aVar);

    s<com.spotify.playlist.models.i<Episode>> b(String str, a aVar);
}
