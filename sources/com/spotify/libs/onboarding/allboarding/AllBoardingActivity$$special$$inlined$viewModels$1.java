package com.spotify.libs.onboarding.allboarding;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

public final class AllBoardingActivity$$special$$inlined$viewModels$1 extends Lambda implements cmf<g0.b> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllBoardingActivity$$special$$inlined$viewModels$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0.b invoke() {
        g0.b l1 = this.$this_viewModels.l1();
        h.b(l1, "defaultViewModelProviderFactory");
        return l1;
    }
}
