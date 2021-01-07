package com.spotify.mobile.android.hubframework.model.immutable;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HubsImmutableComponentBundle$longValue$2 extends FunctionReferenceImpl implements nmf<Number, Long> {
    public static final HubsImmutableComponentBundle$longValue$2 a = new HubsImmutableComponentBundle$longValue$2();

    HubsImmutableComponentBundle$longValue$2() {
        super(1, Number.class, "toLong", "longValue()J", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Long invoke(Number number) {
        Number number2 = number;
        h.e(number2, "p1");
        return Long.valueOf(number2.longValue());
    }
}
