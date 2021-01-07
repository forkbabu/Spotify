package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: li4  reason: default package */
public final class li4 {
    private final d a;
    private final ri4 b;

    /* access modifiers changed from: package-private */
    /* renamed from: li4$a */
    public static final class a<T, R> implements l<String, v<? extends k>> {
        final /* synthetic */ li4 a;

        a(li4 li4) {
            this.a = li4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends k> apply(String str) {
            String str2 = str;
            h.e(str2, "playlistUri");
            d dVar = this.a.a;
            d.b.a aVar = new d.b.a(null, null, null, null, null, false, null, false, null, null, null, 0, null, null, 16383);
            aVar.f(Boolean.FALSE);
            Policy.a a2 = Policy.Companion.a();
            DecorationPolicy.a a3 = DecorationPolicy.Companion.a();
            ListPolicy.a a4 = ListPolicy.Companion.a();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            Boolean bool = Boolean.TRUE;
            builder.mo51put("link", bool);
            builder.mo51put("name", bool);
            builder.mo51put("rowId", bool);
            builder.mo51put("previewId", bool);
            builder.mo51put("covers", bool);
            ImmutableMap build = builder.build();
            h.d(build, "ImmutableMap.builder<Str…                 .build()");
            a4.d(build);
            ImmutableMap.Builder builder2 = ImmutableMap.builder();
            builder2.mo51put("name", bool);
            builder2.mo51put("covers", bool);
            ImmutableMap build2 = builder2.build();
            h.d(build2, "ImmutableMap.builder<Str…                 .build()");
            a4.b(build2);
            ImmutableMap of = ImmutableMap.of("name", bool);
            h.d(of, "ImmutableMap.of(\"name\", true)");
            a4.c(of);
            ImmutableMap of2 = ImmutableMap.of();
            h.d(of2, "ImmutableMap.of()");
            a4.a(of2);
            ImmutableMap.Builder builder3 = ImmutableMap.builder();
            builder3.mo51put("name", bool);
            builder3.mo51put("covers", bool);
            ImmutableMap build3 = builder3.build();
            h.d(build3, "ImmutableMap.builder<Str…                 .build()");
            a4.g(build3);
            a3.c(a4.e());
            a2.b(a3.a());
            aVar.g(a2.a());
            return dVar.a(str2, aVar.b());
        }
    }

    public li4(d dVar, ri4 ri4) {
        h.e(dVar, "playlistEndpoint");
        h.e(ri4, "playlistUriProvider");
        this.a = dVar;
        this.b = ri4;
    }

    public final s<k> b() {
        ri4 ri4 = this.b;
        ri4.getClass();
        z s = z.y(new pi4(ri4)).s(new qi4(ri4));
        h.d(s, "Single.fromCallable<Bool…)\n            }\n        }");
        s<k> v = s.v(new a(this));
        h.d(v, "playlistUriProvider.retr…          )\n            }");
        return v;
    }
}
