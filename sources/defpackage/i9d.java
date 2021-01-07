package defpackage;

import defpackage.n8d;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: i9d  reason: default package */
public final class i9d<Upstream, Downstream> implements w<n8d.f, o8d> {
    final /* synthetic */ x7d a;

    /* renamed from: i9d$a */
    static final class a<T, R> implements l<n8d.f, e> {
        final /* synthetic */ i9d a;

        a(i9d i9d) {
            this.a = i9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(n8d.f fVar) {
            n8d.f fVar2 = fVar;
            h.e(fVar2, "notifyCoreGroupSessionActive");
            if (fVar2.a()) {
                return this.a.a.setActive();
            }
            return this.a.a.a();
        }
    }

    i9d(x7d x7d) {
        this.a = x7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.f> sVar) {
        h.e(sVar, "upstream");
        return sVar.K0(new a(this)).g(o.a);
    }
}
