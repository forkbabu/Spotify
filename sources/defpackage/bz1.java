package defpackage;

import defpackage.uy1;
import defpackage.vy1;
import defpackage.wy1;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: bz1  reason: default package */
final class bz1<Upstream, Downstream> implements w<uy1.a, vy1> {
    final /* synthetic */ nmf a;

    /* renamed from: bz1$a */
    static final class a<T, R> implements l<uy1.a, v<? extends vy1>> {
        final /* synthetic */ bz1 a;

        a(bz1 bz1) {
            this.a = bz1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends vy1> apply(uy1.a aVar) {
            uy1.a aVar2 = aVar;
            h.e(aVar2, "effect");
            return ((z) this.a.a.invoke(Integer.valueOf(aVar2.a()))).A(zy1.a).F((R) wy1.a.a).A(az1.a).P().G0((R) new vy1.c(wy1.b.a));
        }
    }

    bz1(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.w
    public final v<vy1> apply(s<uy1.a> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
