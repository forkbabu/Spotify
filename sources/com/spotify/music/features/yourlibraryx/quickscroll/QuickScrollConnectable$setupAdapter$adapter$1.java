package com.spotify.music.features.yourlibraryx.quickscroll;

import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class QuickScrollConnectable$setupAdapter$adapter$1 extends FunctionReferenceImpl implements nmf<Integer, String> {
    QuickScrollConnectable$setupAdapter$adapter$1(QuickScrollConnectable quickScrollConnectable) {
        super(1, quickScrollConnectable, QuickScrollConnectable.class, "getLabel", "getLabel(I)Ljava/lang/String;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public String invoke(Integer num) {
        return QuickScrollConnectable.d((QuickScrollConnectable) this.receiver, num.intValue());
    }
}
