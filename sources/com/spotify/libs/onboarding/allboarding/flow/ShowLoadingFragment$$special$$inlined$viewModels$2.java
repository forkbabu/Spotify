package com.spotify.libs.onboarding.allboarding.flow;

import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

public final class ShowLoadingFragment$$special$$inlined$viewModels$2 extends Lambda implements cmf<h0> {
    final /* synthetic */ cmf $ownerProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowLoadingFragment$$special$$inlined$viewModels$2(cmf cmf) {
        super(0);
        this.$ownerProducer = cmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public h0 invoke() {
        h0 Z = ((i0) this.$ownerProducer.invoke()).Z();
        h.b(Z, "ownerProducer().viewModelStore");
        return Z;
    }
}
