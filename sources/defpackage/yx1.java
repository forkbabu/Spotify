package defpackage;

import defpackage.px1;
import defpackage.qx1;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: yx1  reason: default package */
public final class yx1<Upstream, Downstream> implements w<qx1.b, rx1> {
    final /* synthetic */ z a;
    final /* synthetic */ nmf b;

    /* renamed from: yx1$a */
    static final class a<T, R> implements l<qx1.b, v<? extends rx1>> {
        final /* synthetic */ yx1 a;

        a(yx1 yx1) {
            this.a = yx1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends rx1> apply(qx1.b bVar) {
            h.e(bVar, "it");
            return this.a.a.p(new vx1(this)).A(wx1.a).P().G0((R) px1.c.a).s0((R) px1.a.a).j0(xx1.a);
        }
    }

    yx1(z zVar, nmf nmf) {
        this.a = zVar;
        this.b = nmf;
    }

    @Override // io.reactivex.w
    public final v<rx1> apply(s<qx1.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
