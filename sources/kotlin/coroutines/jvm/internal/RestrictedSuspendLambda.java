package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements g<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i, a<Object> aVar) {
        super(aVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, java.lang.Object
    public String toString() {
        if (e() != null) {
            return super.toString();
        }
        String f = j.f(this);
        h.d(f, "Reflection.renderLambdaToString(this)");
        return f;
    }
}
