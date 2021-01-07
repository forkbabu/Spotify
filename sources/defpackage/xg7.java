package defpackage;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: xg7  reason: default package */
public final class xg7<Upstream, Downstream> implements w<xf7, gg7> {
    final /* synthetic */ ih7 a;

    /* renamed from: xg7$a */
    static final class a<T, R> implements l<xf7, String> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(xf7 xf7) {
            xf7 xf72 = xf7;
            h.e(xf72, "it");
            return hh7.a(xf72.a());
        }
    }

    /* renamed from: xg7$b */
    static final class b<T, R> implements l<String, v<? extends gg7>> {
        final /* synthetic */ xg7 a;

        b(xg7 xg7) {
            this.a = xg7;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends gg7> apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return new o(this.a.a.c(str2).r(yg7.a).l(zg7.a), ah7.a).v();
        }
    }

    xg7(ih7 ih7) {
        this.a = ih7;
    }

    @Override // io.reactivex.w
    public final v<gg7> apply(s<xf7> sVar) {
        h.e(sVar, "upstream");
        return sVar.j0(a.a).J0(new b(this));
    }
}
