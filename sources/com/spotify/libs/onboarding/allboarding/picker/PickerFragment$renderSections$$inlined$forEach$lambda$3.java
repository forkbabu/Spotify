package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.libs.onboarding.allboarding.room.j;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PickerFragment$renderSections$$inlined$forEach$lambda$3 extends Lambda implements smf<j, Integer, Boolean, f> {
    final /* synthetic */ g $setPickerItemSelectedClickHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickerFragment$renderSections$$inlined$forEach$lambda$3(g gVar) {
        super(3);
        this.$setPickerItemSelectedClickHandler = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public f c(j jVar, Integer num, Boolean bool) {
        j jVar2 = jVar;
        int intValue = num.intValue();
        bool.booleanValue();
        h.e(jVar2, "item");
        this.$setPickerItemSelectedClickHandler.b(jVar2, intValue);
        return f.a;
    }
}
