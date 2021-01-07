package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.a;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.f;

public final class h extends l {
    public static <T> T a(e<? extends T> eVar) {
        kotlin.jvm.internal.h.e(eVar, "$this$firstOrNull");
        w4 w4Var = (w4) ((v4) eVar).iterator();
        if (!w4Var.hasNext()) {
            return null;
        }
        return (T) w4Var.next();
    }

    public static <T> e<T> b(cmf<? extends T> cmf) {
        kotlin.jvm.internal.h.e(cmf, "nextFunction");
        d dVar = new d(cmf, new SequencesKt__SequencesKt$generateSequence$1(cmf));
        kotlin.jvm.internal.h.e(dVar, "$this$constrainOnce");
        return dVar instanceof a ? (a) dVar : new a(dVar);
    }

    public static <T> Iterator<T> c(rmf<? super g<? super T>, ? super a<? super f>, ? extends Object> rmf) {
        kotlin.jvm.internal.h.e(rmf, "block");
        f fVar = new f();
        kotlin.jvm.internal.h.e(rmf, "$this$createCoroutineUnintercepted");
        kotlin.jvm.internal.h.e(fVar, "completion");
        kotlin.jvm.internal.h.e(fVar, "completion");
        fVar.e(((BaseContinuationImpl) rmf).d(fVar, fVar));
        return fVar;
    }

    public static <T> e<T> d(e<? extends T> eVar, int i) {
        kotlin.jvm.internal.h.e(eVar, "$this$take");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(je.q0("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return c.a;
        } else {
            if (eVar instanceof b) {
                return ((b) eVar).a(i);
            }
            return new m(eVar, i);
        }
    }
}
