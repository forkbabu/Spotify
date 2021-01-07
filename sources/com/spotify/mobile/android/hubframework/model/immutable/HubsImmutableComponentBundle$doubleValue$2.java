package com.spotify.mobile.android.hubframework.model.immutable;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HubsImmutableComponentBundle$doubleValue$2 extends FunctionReferenceImpl implements nmf<Number, Double> {
    public static final HubsImmutableComponentBundle$doubleValue$2 a = new HubsImmutableComponentBundle$doubleValue$2();

    HubsImmutableComponentBundle$doubleValue$2() {
        super(1, Number.class, "toDouble", "doubleValue()D", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Double invoke(Number number) {
        Number number2 = number;
        h.e(number2, "p1");
        return Double.valueOf(number2.doubleValue());
    }
}
