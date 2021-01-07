package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.navigation.d;
import kotlin.jvm.internal.h;

public final class m implements d {
    private final String a;
    private final long b;

    public m(String str, long j) {
        h.e(str, "onboardingSessionId");
        this.a = str;
        this.b = j;
    }

    public static final m fromBundle(Bundle bundle) {
        h.e(bundle, "bundle");
        bundle.setClassLoader(m.class.getClassLoader());
        if (bundle.containsKey("onboardingSessionId")) {
            String string = bundle.getString("onboardingSessionId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"onboardingSessionId\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("stepId")) {
                return new m(string, bundle.getLong("stepId"));
            } else {
                throw new IllegalArgumentException("Required argument \"stepId\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new IllegalArgumentException("Required argument \"onboardingSessionId\" is missing and does not have an android:defaultValue");
        }
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("onboardingSessionId", this.a);
        bundle.putLong("stepId", this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.a(this.a, mVar.a) && this.b == mVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + e.a(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PickerFragmentArgs(onboardingSessionId=");
        V0.append(this.a);
        V0.append(", stepId=");
        return je.E0(V0, this.b, ")");
    }
}
