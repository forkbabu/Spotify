package com.spotify.mobile.android.hubframework.model.immutable;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HubsImmutableComponentBundle$floatValue$2 extends FunctionReferenceImpl implements nmf<Number, Float> {
    public static final HubsImmutableComponentBundle$floatValue$2 a = new HubsImmutableComponentBundle$floatValue$2();

    HubsImmutableComponentBundle$floatValue$2() {
        super(1, Number.class, "toFloat", "floatValue()F", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Float invoke(Number number) {
        Number number2 = number;
        h.e(number2, "p1");
        return Float.valueOf(number2.floatValue());
    }
}
