package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.navigation.n;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

final class d implements n {
    private final String a;
    private final long b;

    public d(String str, long j) {
        h.e(str, "onboardingSessionId");
        this.a = str;
        this.b = j;
    }

    @Override // androidx.navigation.n
    public int a() {
        return C0707R.id.action_initialLoadingFragment_to_pickerFragment;
    }

    @Override // androidx.navigation.n
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("onboardingSessionId", this.a);
        bundle.putLong("stepId", this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && this.b == dVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + e.a(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionInitialLoadingFragmentToPickerFragment(onboardingSessionId=");
        V0.append(this.a);
        V0.append(", stepId=");
        return je.E0(V0, this.b, ")");
    }
}
