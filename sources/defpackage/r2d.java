package defpackage;

import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import defpackage.g2d;
import defpackage.h2d;
import defpackage.i2d;
import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: r2d  reason: default package */
public final class r2d implements w<h2d.c, i2d> {
    private final i1d a;
    private final qzc b;

    /* renamed from: r2d$a */
    public static final class a {
        private final i1d a;

        public a(i1d i1d) {
            h.e(i1d, "shareableStickerService");
            this.a = i1d;
        }

        public final r2d a(qzc qzc) {
            return new r2d(this.a, qzc);
        }
    }

    /* renamed from: r2d$b */
    static final class b<T, R> implements l<h2d.c, v<? extends i2d>> {
        final /* synthetic */ r2d a;

        b(r2d r2d) {
            this.a = r2d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends i2d> apply(h2d.c cVar) {
            szc szc;
            h2d.c cVar2 = cVar;
            h.e(cVar2, "effect");
            io.reactivex.l a2 = r2d.a(this.a, cVar2.a());
            r2d r2d = this.a;
            pzc a3 = cVar2.a();
            r2d.getClass();
            com.spotify.share.sharedata.w orNull = a3.m().orNull();
            if (orNull != null) {
                szc = szc.b(orNull.h(), orNull.b());
            } else {
                q orNull2 = a3.j().orNull();
                szc = orNull2 != null ? szc.b(orNull2.h(), orNull2.b()) : null;
            }
            if (szc == null) {
                o orNull3 = a3.i().orNull();
                szc = orNull3 != null ? szc.b(orNull3.h(), orNull3.b()) : null;
            }
            MaybeSwitchIfEmpty maybeSwitchIfEmpty = new MaybeSwitchIfEmpty(a2, szc != null ? io.reactivex.l.k(szc) : io.reactivex.internal.operators.maybe.b.a);
            r2d r2d2 = this.a;
            pzc a4 = cVar2.a();
            i1d i1d = this.a.a;
            r2d2.getClass();
            z<R> A = i1d.b(a4.k().g()).A(u2d.a);
            h.d(A, "shareableStickerService.…)\n            )\n        }");
            return maybeSwitchIfEmpty.r(A).A(s2d.a).E(t2d.a).P().G0((R) new i2d.d(new g2d.b(null, 1)));
        }
    }

    public r2d(i1d i1d, qzc qzc) {
        h.e(i1d, "shareableStickerService");
        this.a = i1d;
        this.b = qzc;
    }

    public static final io.reactivex.l a(r2d r2d, pzc pzc) {
        io.reactivex.l<szc> b2;
        io.reactivex.internal.operators.maybe.b bVar = io.reactivex.internal.operators.maybe.b.a;
        qzc qzc = r2d.b;
        if (qzc != null && (b2 = qzc.b(pzc.k())) != null) {
            return b2.o(Functions.j(bVar));
        }
        h.d(bVar, "Maybe.empty()");
        return bVar;
    }

    @Override // io.reactivex.w
    public v<i2d> apply(s<h2d.c> sVar) {
        h.e(sVar, "upstream");
        s<R> W = sVar.W(new b(this), false, Integer.MAX_VALUE);
        h.d(W, "upstream.flatMap { effec…rce.Loading()))\n        }");
        return W;
    }
}
