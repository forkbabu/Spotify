package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class InitialLoadingFragment$initialLoadingViewModel$2 extends Lambda implements cmf<g0.b> {
    final /* synthetic */ InitialLoadingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitialLoadingFragment$initialLoadingViewModel$2(InitialLoadingFragment initialLoadingFragment) {
        super(0);
        this.this$0 = initialLoadingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0.b invoke() {
        InitialLoadingFragment initialLoadingFragment = this.this$0;
        f fVar = initialLoadingFragment.i0;
        if (fVar != null) {
            Bundle bundle = Bundle.EMPTY;
            h.d(bundle, "Bundle.EMPTY");
            return new b(fVar, initialLoadingFragment, bundle);
        }
        h.k("initialLoadingViewModelFactory");
        throw null;
    }
}
