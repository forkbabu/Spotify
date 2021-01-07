package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements nmf<T, T> {
    final /* synthetic */ cmf $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$generateSequence$1(cmf cmf) {
        super(1);
        this.$nextFunction = cmf;
    }

    @Override // defpackage.nmf
    public final T invoke(T t) {
        h.e(t, "it");
        return (T) this.$nextFunction.invoke();
    }
}
