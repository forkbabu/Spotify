package com.spotify.libs.onboarding.allboarding.picker;

import androidx.lifecycle.v;
import com.spotify.libs.onboarding.allboarding.room.j;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

final class k<T> implements v<List<? extends j>> {
    final /* synthetic */ AllboardingRvAdapter a;
    final /* synthetic */ com.spotify.libs.onboarding.allboarding.room.v b;
    final /* synthetic */ PickerFragment c;

    k(AllboardingRvAdapter allboardingRvAdapter, com.spotify.libs.onboarding.allboarding.room.v vVar, PickerFragment pickerFragment, Ref$IntRef ref$IntRef) {
        this.a = allboardingRvAdapter;
        this.b = vVar;
        this.c = pickerFragment;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.libs.onboarding.allboarding.picker.AllboardingRvAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.v
    public void a(List<? extends j> list) {
        this.a.c0(list, new j(this));
        PickerFragment.K4(this.c);
    }
}
