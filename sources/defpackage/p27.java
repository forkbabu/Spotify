package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.podcast.endpoints.r;
import com.spotify.podcast.endpoints.x;
import defpackage.o27;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: p27  reason: default package */
public final class p27 implements o27 {
    private final x a;
    private final String b;
    private final x.a c;
    private final b37 d;

    /* renamed from: p27$a */
    static final class a<T, R> implements l<Throwable, qyd> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public qyd apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "t");
            Assertion.v("An error was returned by ShowEntityEndpoint.");
            Logger.e(th2, "Error found in ShowEntityEndpoint", new Object[0]);
            return qyd.a().build();
        }
    }

    public p27(x xVar, String str, x.a aVar, b37 b37) {
        h.e(xVar, "showEntityEndpoint");
        h.e(str, "showUri");
        h.e(aVar, "showEndpointConfiguration");
        h.e(b37, "uriToIdMapper");
        this.a = xVar;
        this.b = str;
        this.c = aVar;
        this.d = b37;
    }

    @Override // defpackage.o27
    public s<qyd> a(o27.a aVar) {
        Optional<Boolean> optional;
        Optional<Boolean> optional2;
        Optional<ane> optional3;
        Boolean bool = Boolean.TRUE;
        h.e(aVar, "request");
        x xVar = this.a;
        String a2 = this.d.a(this.b);
        x.a.AbstractC0383a q = this.c.q();
        if (aVar.a() instanceof o27.a.AbstractC0653a.C0654a) {
            optional = Optional.of(bool);
            h.d(optional, "Optional.of(true)");
        } else {
            optional = Optional.absent();
            h.d(optional, "Optional.absent()");
        }
        q.i(optional);
        if (aVar.a() instanceof o27.a.AbstractC0653a.c) {
            optional2 = Optional.of(bool);
            h.d(optional2, "Optional.of(true)");
        } else {
            optional2 = Optional.absent();
            h.d(optional2, "Optional.absent()");
        }
        q.g(optional2);
        o27.a.c c2 = aVar.c();
        if (c2 instanceof o27.a.c.b) {
            optional3 = Optional.of(yxd.c);
            h.d(optional3, "Optional.of(CoreShowEnti…UBLISH_DATE_AND_NAME_ASC)");
        } else if (c2 instanceof o27.a.c.C0656c) {
            optional3 = Optional.of(yxd.d);
            h.d(optional3, "Optional.of(CoreShowEnti…BLISH_DATE_AND_NAME_DESC)");
        } else if (c2 instanceof o27.a.c.C0655a) {
            optional3 = Optional.of(yxd.e);
            h.d(optional3, "Optional.of(CoreShowEntityV1.BY_CONSUMPTION_ORDER)");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        q.a(optional3);
        q.d(r.a(aVar.b().a(), aVar.b().b()));
        s<qyd> r0 = xVar.a(a2, q.build()).r0(a.a);
        h.d(r0, "showEntityEndpoint.subsc…build()\n                }");
        return r0;
    }
}
