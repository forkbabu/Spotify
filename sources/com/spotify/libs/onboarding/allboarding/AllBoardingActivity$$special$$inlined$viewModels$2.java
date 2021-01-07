package com.spotify.libs.onboarding.allboarding;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

public final class AllBoardingActivity$$special$$inlined$viewModels$2 extends Lambda implements cmf<h0> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllBoardingActivity$$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public h0 invoke() {
        h0 Z = this.$this_viewModels.Z();
        h.b(Z, "viewModelStore");
        return Z;
    }
}
