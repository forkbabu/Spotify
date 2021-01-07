package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.libs.onboarding.allboarding.picker.PickerFragment;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.v;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.h;

public final class g extends PickerFragment.a {
    final /* synthetic */ v b;
    final /* synthetic */ PickerFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(v vVar, int i, PickerFragment pickerFragment, Ref$IntRef ref$IntRef) {
        super(i);
        this.b = vVar;
        this.c = pickerFragment;
    }

    public void b(j jVar, int i) {
        h.e(jVar, "picker");
        PickerFragment.N4(this.c).z(jVar, a(), i - PickerFragment.P4(this.c).f0(this.b.c().hashCode()));
    }
}
