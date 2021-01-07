package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class l0 implements RxDogTag.NonCheckingPredicate {
    public static final /* synthetic */ l0 a = new l0();

    private /* synthetic */ l0() {
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingPredicate
    public final boolean test(Object obj) {
        return RxDogTag.STACK_ELEMENT_TRACE_HEADER.equals(((StackTraceElement) obj).getClassName());
    }
}
