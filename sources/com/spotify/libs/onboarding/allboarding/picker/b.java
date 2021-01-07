package com.spotify.libs.onboarding.allboarding.picker;

import androidx.lifecycle.v;
import com.spotify.libs.onboarding.allboarding.a;
import com.spotify.libs.onboarding.allboarding.picker.r;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.mobile.android.util.Assertion;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: java-style lambda group */
public final class b<T> implements v<PickerStepData> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: androidx.lifecycle.u */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: androidx.lifecycle.u */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.v
    public final void a(PickerStepData pickerStepData) {
        int i = this.a;
        if (i == 0) {
            PickerStepData pickerStepData2 = pickerStepData;
            u uVar = (u) this.b;
            uVar.w(d.a(uVar.n(), null, pickerStepData2, null, false, false, 29));
            ((u) this.b).x();
        } else if (i == 1) {
            PickerStepData pickerStepData3 = pickerStepData;
            if (pickerStepData3 != null && pickerStepData3.b() != ((u) this.b).m) {
                PickerStepData.AllboardingScreenType m = pickerStepData3.m();
                if (m == null) {
                    Assertion.g("The type of the step is null - which is unexpected");
                    return;
                }
                int ordinal = m.ordinal();
                if (ordinal == 0) {
                    String c = pickerStepData3.c();
                    if (c != null) {
                        ((u) this.b).d.n(new a(new r.b(c), null));
                    }
                } else if (ordinal == 1) {
                    ((u) this.b).d.n(new a(new r.c(pickerStepData3.b()), null));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            throw null;
        }
    }
}
