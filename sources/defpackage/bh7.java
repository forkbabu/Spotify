package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: bh7  reason: default package */
public final class bh7<Upstream, Downstream> implements w<wg7, gg7> {
    final /* synthetic */ ih7 a;

    /* renamed from: bh7$a */
    static final class a<T, R> implements l<wg7, v<? extends gg7>> {
        final /* synthetic */ bh7 a;

        a(bh7 bh7) {
            this.a = bh7;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends gg7> apply(wg7 wg7) {
            wg7 wg72 = wg7;
            h.e(wg72, "it");
            String a2 = hh7.a(wg72.b());
            return (wg72.a() ? this.a.a.b(a2) : this.a.a.a(a2)).B().g(s.i0(new mg7(wg72.a())));
        }
    }

    bh7(ih7 ih7) {
        this.a = ih7;
    }

    @Override // io.reactivex.w
    public final v<gg7> apply(s<wg7> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
