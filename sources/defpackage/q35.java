package defpackage;

import com.spotify.music.features.followfeed.network.c;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: q35  reason: default package */
public final class q35 {
    private final c a;
    private final u35 b;
    private final com.spotify.music.features.followfeed.persistence.a c;

    /* access modifiers changed from: package-private */
    /* renamed from: q35$a */
    public static final class a<T, R> implements l<k35, r25> {
        final /* synthetic */ q35 a;

        a(q35 q35) {
            this.a = q35;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public r25 apply(k35 k35) {
            k35 k352 = k35;
            h.e(k352, "response");
            return q35.a(this.a, k352);
        }
    }

    public q35(c cVar, u35 u35, com.spotify.music.features.followfeed.persistence.a aVar) {
        h.e(cVar, "dataSource");
        h.e(u35, "feedDataToMobiusTranslator");
        h.e(aVar, "cacheManager");
        this.a = cVar;
        this.b = u35;
        this.c = aVar;
    }

    public static final r25 a(q35 q35, k35 k35) {
        return new r25(q35.b.apply(k35), false, null, null, false, false, false, 126);
    }

    public final z<r25> b() {
        r25 b2 = this.c.b();
        if (b2 != null) {
            return z.z(b2);
        }
        z<R> A = this.a.a(null).A(new a(this));
        h.d(A, "dataSource.fetchFeed(nul…sponse)\n                }");
        return A;
    }
}
