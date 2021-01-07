package retrofit2;

import kotlin.coroutines.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.b;

/* access modifiers changed from: package-private */
@b(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {112, 119}, m = "suspendAndThrow")
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$suspendAndThrow$1(a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object f(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.c(null, this);
    }
}
