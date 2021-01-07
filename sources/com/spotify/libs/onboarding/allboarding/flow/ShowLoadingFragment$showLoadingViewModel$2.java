package com.spotify.libs.onboarding.allboarding.flow;

import androidx.lifecycle.g0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ShowLoadingFragment$showLoadingViewModel$2 extends Lambda implements cmf<g0.b> {
    final /* synthetic */ ShowLoadingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShowLoadingFragment$showLoadingViewModel$2(ShowLoadingFragment showLoadingFragment) {
        super(0);
        this.this$0 = showLoadingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0.b invoke() {
        ShowLoadingFragment showLoadingFragment = this.this$0;
        j jVar = showLoadingFragment.p0;
        if (jVar != null) {
            return new b(jVar, showLoadingFragment, ShowLoadingFragment.K4(showLoadingFragment).c());
        }
        h.k("showLoadingViewModelFactory");
        throw null;
    }
}
