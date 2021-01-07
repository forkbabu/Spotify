package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.c;

public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(a<Object> aVar) {
        super(aVar);
        if (aVar != null) {
            if (!(aVar.getContext() == EmptyCoroutineContext.a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.a
    public c getContext() {
        return EmptyCoroutineContext.a;
    }
}
