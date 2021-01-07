package defpackage;

import android.app.Activity;
import com.spotify.music.share.logging.ShareMenuLogger;
import defpackage.h2d;
import defpackage.xzc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: v2d  reason: default package */
public final class v2d implements w<h2d.d, i2d> {
    private final Activity a;
    private final xzc b;
    private final u2e c;
    private final ShareMenuLogger d;

    /* renamed from: v2d$a */
    public static final class a {
        private final xzc.a a;
        private final u2e b;
        private final ShareMenuLogger c;

        public a(xzc.a aVar, u2e u2e, ShareMenuLogger shareMenuLogger) {
            h.e(aVar, "shareDataBuilderFactory");
            h.e(u2e, "shareService");
            h.e(shareMenuLogger, "shareMenuLogger");
            this.a = aVar;
            this.b = u2e;
            this.c = shareMenuLogger;
        }

        public final v2d a(Activity activity, qzc qzc) {
            h.e(activity, "activity");
            return new v2d(activity, this.a.a(qzc), this.b, this.c, null);
        }
    }

    /* renamed from: v2d$b */
    static final class b<T, R> implements l<h2d.d, v<? extends i2d>> {
        final /* synthetic */ v2d a;

        b(v2d v2d) {
            this.a = v2d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends i2d> apply(h2d.d dVar) {
            h2d.d dVar2 = dVar;
            h.e(dVar2, "effect");
            return this.a.b.a(dVar2.c(), dVar2.b()).s(new w2d(this, dVar2)).A(new x2d(this, dVar2)).E(new y2d(this, dVar2)).P();
        }
    }

    public v2d(Activity activity, xzc xzc, u2e u2e, ShareMenuLogger shareMenuLogger, f fVar) {
        this.a = activity;
        this.b = xzc;
        this.c = u2e;
        this.d = shareMenuLogger;
    }

    public static final void d(v2d v2d, h2d.d dVar, String str) {
        ShareMenuLogger shareMenuLogger = v2d.d;
        int a2 = dVar.c().a();
        int a3 = dVar.a();
        String g = dVar.b().k().g();
        h.d(g, "effect.shareData.linkShareData().entityUri()");
        shareMenuLogger.e(a2, a3, g, str);
    }

    @Override // io.reactivex.w
    public v<i2d> apply(s<h2d.d> sVar) {
        h.e(sVar, "upstream");
        s<R> W = sVar.W(new b(this), false, Integer.MAX_VALUE);
        h.d(W, "upstream.flatMap { effec….toObservable()\n        }");
        return W;
    }
}
