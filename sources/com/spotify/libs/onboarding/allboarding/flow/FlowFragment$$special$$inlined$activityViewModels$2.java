package com.spotify.libs.onboarding.allboarding.flow;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

public final class FlowFragment$$special$$inlined$activityViewModels$2 extends Lambda implements cmf<g0.b> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowFragment$$special$$inlined$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0.b invoke() {
        c j4 = this.$this_activityViewModels.j4();
        h.b(j4, "requireActivity()");
        g0.b l1 = j4.l1();
        h.b(l1, "requireActivity().defaultViewModelProviderFactory");
        return l1;
    }
}
