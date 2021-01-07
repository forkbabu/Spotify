package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

final class n implements androidx.navigation.n {
    private final String a;
    private final long b;

    public n(String str, long j) {
        h.e(str, "onboardingSessionId");
        this.a = str;
        this.b = j;
    }

    @Override // androidx.navigation.n
    public int a() {
        return C0707R.id.action_pickerFragment_self;
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.a(this.a, nVar.a) && this.b == nVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + e.a(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionPickerFragmentSelf(onboardingSessionId=");
        V0.append(this.a);
        V0.append(", stepId=");
        return je.E0(V0, this.b, ")");
    }
}
