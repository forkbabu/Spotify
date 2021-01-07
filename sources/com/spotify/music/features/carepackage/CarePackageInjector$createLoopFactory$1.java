package com.spotify.music.features.carepackage;

import com.spotify.mobius.e0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class CarePackageInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<dh4, bh4, e0<dh4, ah4>> {
    public static final CarePackageInjector$createLoopFactory$1 a = new CarePackageInjector$createLoopFactory$1();

    CarePackageInjector$createLoopFactory$1() {
        super(2, ch4.class, "update", "update(Lcom/spotify/music/features/carepackage/domain/CarePackageModel;Lcom/spotify/music/features/carepackage/domain/CarePackageEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<dh4, ah4> invoke(dh4 dh4, bh4 bh4) {
        dh4 dh42 = dh4;
        bh4 bh42 = bh4;
        h.e(dh42, "p1");
        h.e(bh42, "p2");
        return ch4.b(dh42, bh42);
    }
}
