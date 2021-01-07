package io.reactivex.flowables;

import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.operators.flowable.v;

public abstract class a<T> extends g<T> {
    public abstract void q0(io.reactivex.functions.g<? super b> gVar);

    public g<T> r0() {
        a<T> aVar;
        if (this instanceof v) {
            v vVar = (v) this;
            aVar = new FlowablePublishAlt<>(vVar.a(), vVar.c());
        } else {
            aVar = this;
        }
        return new FlowableRefCount(aVar);
    }
}
