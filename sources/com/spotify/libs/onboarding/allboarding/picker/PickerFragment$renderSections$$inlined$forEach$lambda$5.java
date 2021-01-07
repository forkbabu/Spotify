package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.libs.onboarding.allboarding.room.j;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.h;

final class PickerFragment$renderSections$$inlined$forEach$lambda$5 extends Lambda implements rmf<j, Integer, f> {
    final /* synthetic */ Ref$IntRef $sectionIndex$inlined;
    final /* synthetic */ PickerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickerFragment$renderSections$$inlined$forEach$lambda$5(PickerFragment pickerFragment, Ref$IntRef ref$IntRef) {
        super(2);
        this.this$0 = pickerFragment;
        this.$sectionIndex$inlined = ref$IntRef;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int intValue = num.intValue();
        h.e(jVar2, "item");
        this.this$0.U4().c(this.$sectionIndex$inlined.element, intValue, jVar2);
        return f.a;
    }
}
