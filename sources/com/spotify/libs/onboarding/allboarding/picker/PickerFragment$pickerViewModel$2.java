package com.spotify.libs.onboarding.allboarding.picker;

import androidx.lifecycle.g0;
import com.spotify.libs.onboarding.allboarding.flow.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PickerFragment$pickerViewModel$2 extends Lambda implements cmf<g0.b> {
    final /* synthetic */ PickerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickerFragment$pickerViewModel$2(PickerFragment pickerFragment) {
        super(0);
        this.this$0 = pickerFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0.b invoke() {
        PickerFragment pickerFragment = this.this$0;
        v vVar = pickerFragment.k0;
        if (vVar != null) {
            return new b(vVar, pickerFragment, PickerFragment.L4(pickerFragment).c());
        }
        h.k("pickerViewModelFactory");
        throw null;
    }
}
