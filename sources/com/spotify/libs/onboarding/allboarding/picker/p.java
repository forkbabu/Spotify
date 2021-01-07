package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.navigation.n;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

final class p implements n {
    private final String a;
    private final String b;

    public p(String str, String str2) {
        h.e(str, "loadingText");
        h.e(str2, "onboardingSessionId");
        this.a = str;
        this.b = str2;
    }

    @Override // androidx.navigation.n
    public int a() {
        return C0707R.id.action_pickerFragment_to_postingDataFragment;
    }

    @Override // androidx.navigation.n
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("loadingText", this.a);
        bundle.putString("onboardingSessionId", this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a(this.a, pVar.a) && h.a(this.b, pVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionPickerFragmentToPostingDataFragment(loadingText=");
        V0.append(this.a);
        V0.append(", onboardingSessionId=");
        return je.I0(V0, this.b, ")");
    }
}
