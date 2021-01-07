package com.spotify.mobile.android.hubframework.model.immutable;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HubsImmutableComponentBundle$intValue$2 extends FunctionReferenceImpl implements nmf<Number, Integer> {
    public static final HubsImmutableComponentBundle$intValue$2 a = new HubsImmutableComponentBundle$intValue$2();

    HubsImmutableComponentBundle$intValue$2() {
        super(1, Number.class, "toInt", "intValue()I", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Integer invoke(Number number) {
        Number number2 = number;
        h.e(number2, "p1");
        return Integer.valueOf(number2.intValue());
    }
}
