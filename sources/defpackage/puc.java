package defpackage;

import defpackage.wtc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: puc  reason: default package */
final class puc<Upstream, Downstream> implements w<wtc.e, xtc> {
    final /* synthetic */ vuc a;

    /* renamed from: puc$a */
    static final class a<T, R> implements l<wtc.e, v<? extends xtc>> {
        final /* synthetic */ puc a;

        a(puc puc) {
            this.a = puc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends xtc> apply(wtc.e eVar) {
            h.e(eVar, "it");
            return this.a.a.b().j0(nuc.a).r0(ouc.a);
        }
    }

    puc(vuc vuc) {
        this.a = vuc;
    }

    @Override // io.reactivex.w
    public final v<xtc> apply(s<wtc.e> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
