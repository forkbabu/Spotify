package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;

public final class SkipDialogFragment$$special$$inlined$navArgs$1 extends Lambda implements cmf<Bundle> {
    final /* synthetic */ Fragment $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkipDialogFragment$$special$$inlined$navArgs$1(Fragment fragment) {
        super(0);
        this.$this_navArgs = fragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Bundle invoke() {
        Bundle D2 = this.$this_navArgs.D2();
        if (D2 != null) {
            return D2;
        }
        StringBuilder V0 = je.V0("Fragment ");
        V0.append(this.$this_navArgs);
        V0.append(" has null arguments");
        throw new IllegalStateException(V0.toString());
    }
}
