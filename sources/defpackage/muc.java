package defpackage;

import defpackage.wtc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: muc  reason: default package */
final class muc<Upstream, Downstream> implements w<wtc.d, xtc> {
    final /* synthetic */ jvc a;

    /* renamed from: muc$a */
    static final class a<T, R> implements l<wtc.d, v<? extends xtc>> {
        final /* synthetic */ muc a;

        a(muc muc) {
            this.a = muc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends xtc> apply(wtc.d dVar) {
            wtc.d dVar2 = dVar;
            h.e(dVar2, "it");
            return this.a.a.b(dVar2.a()).A(kuc.a).E(luc.a).P();
        }
    }

    muc(jvc jvc) {
        this.a = jvc;
    }

    @Override // io.reactivex.w
    public final v<xtc> apply(s<wtc.d> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
