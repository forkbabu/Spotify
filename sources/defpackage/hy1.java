package defpackage;

import defpackage.qx1;
import defpackage.rx1;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: hy1  reason: default package */
public final class hy1<Upstream, Downstream> implements w<qx1.k, rx1> {
    final /* synthetic */ nmf a;

    /* renamed from: hy1$a */
    static final class a<T, R> implements l<qx1.k, v<? extends rx1>> {
        final /* synthetic */ hy1 a;

        a(hy1 hy1) {
            this.a = hy1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends rx1> apply(qx1.k kVar) {
            qx1.k kVar2 = kVar;
            h.e(kVar2, "effect");
            return ((io.reactivex.a) this.a.a.invoke(Integer.valueOf(kVar2.a()))).O(new gy1(kVar2)).F((T) new rx1.d(kVar2.a())).P();
        }
    }

    hy1(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.w
    public final v<rx1> apply(s<qx1.k> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
