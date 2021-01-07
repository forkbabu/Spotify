package com.spotify.music.features.carepackage;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class CarePackageInjector$createController$1 extends FunctionReferenceImpl implements nmf<dh4, s<dh4, ah4>> {
    public static final CarePackageInjector$createController$1 a = new CarePackageInjector$createController$1();

    CarePackageInjector$createController$1() {
        super(1, ch4.class, "init", "init(Lcom/spotify/music/features/carepackage/domain/CarePackageModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<dh4, ah4> invoke(dh4 dh4) {
        dh4 dh42 = dh4;
        h.e(dh42, "p1");
        h.e(dh42, "model");
        s<dh4, ah4> b = s.b(dh42);
        h.d(b, "First.first(model)");
        return b;
    }
}
