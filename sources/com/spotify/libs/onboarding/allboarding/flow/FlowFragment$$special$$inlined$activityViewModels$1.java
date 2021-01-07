package com.spotify.libs.onboarding.allboarding.flow;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

public final class FlowFragment$$special$$inlined$activityViewModels$1 extends Lambda implements cmf<h0> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowFragment$$special$$inlined$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public h0 invoke() {
        c j4 = this.$this_activityViewModels.j4();
        h.b(j4, "requireActivity()");
        h0 Z = j4.Z();
        h.b(Z, "requireActivity().viewModelStore");
        return Z;
    }
}
