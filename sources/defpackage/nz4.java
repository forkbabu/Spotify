package defpackage;

import defpackage.hz4;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: nz4  reason: default package */
public final class nz4<Upstream, Downstream> implements w<hz4.b, iz4> {
    final /* synthetic */ z a;

    /* renamed from: nz4$a */
    static final class a<T, R> implements l<hz4.b, v<? extends iz4>> {
        final /* synthetic */ nz4 a;

        a(nz4 nz4) {
            this.a = nz4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends iz4> apply(hz4.b bVar) {
            hz4.b bVar2 = bVar;
            h.e(bVar2, "effect");
            return this.a.a.A(new lz4(bVar2)).E(mz4.a).P();
        }
    }

    nz4(z zVar) {
        this.a = zVar;
    }

    @Override // io.reactivex.w
    public final v<iz4> apply(s<hz4.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
