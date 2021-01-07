package com.spotify.music.features.carepackage;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class CarePackageInjector$createLoopFactory$2 extends FunctionReferenceImpl implements nmf<String, f> {
    CarePackageInjector$createLoopFactory$2(vh4 vh4) {
        super(1, vh4, vh4.class, "requestUndo", "requestUndo(Ljava/lang/String;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(String str) {
        String str2 = str;
        h.e(str2, "p1");
        ((vh4) this.receiver).a(str2);
        return f.a;
    }
}
