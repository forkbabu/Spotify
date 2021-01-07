package defpackage;

import defpackage.onc;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: sjc  reason: default package */
public final class sjc {

    /* renamed from: sjc$a */
    static final class a<T, R> implements l<wjc, v<? extends wjc>> {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends wjc> apply(wjc wjc) {
            wjc wjc2 = wjc;
            h.e(wjc2, "model");
            if (wjc2.e()) {
                return s.i0(wjc2);
            }
            return new io.reactivex.internal.operators.observable.v(this.a.O(new rjc(wjc2)));
        }
    }

    /* renamed from: sjc$b */
    static final class b<T, R> implements l<wjc, d0<? extends wjc>> {
        final /* synthetic */ g a;

        b(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends wjc> apply(wjc wjc) {
            wjc wjc2 = wjc;
            h.e(wjc2, "model");
            if (wjc2.e()) {
                return z.z(wjc2);
            }
            return this.a.C(tjc.a).D((T) onc.b.a).A(new ujc(wjc2));
        }
    }

    public static final s<wjc> a(s<wjc> sVar, g<onc> gVar) {
        h.e(sVar, "$this$composeWithPlayerState");
        h.e(gVar, "playerStateFlowable");
        return sVar.W(new a(gVar), false, Integer.MAX_VALUE);
    }

    public static final z<wjc> b(z<wjc> zVar, g<onc> gVar) {
        h.e(zVar, "$this$composeWithPlayerState");
        h.e(gVar, "playerStateFlowable");
        z<R> s = zVar.s(new b(gVar));
        h.d(s, "flatMap { model ->\n     …e = it) }\n        }\n    }");
        return s;
    }
}
