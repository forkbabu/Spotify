package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.navigation.d;

public final class h implements d {
    private final String a;
    private final String b;

    public h(String str, String str2) {
        kotlin.jvm.internal.h.e(str, "loadingText");
        kotlin.jvm.internal.h.e(str2, "onboardingSessionId");
        this.a = str;
        this.b = str2;
    }

    public static final h fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(h.class.getClassLoader());
        if (bundle.containsKey("loadingText")) {
            String string = bundle.getString("loadingText");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"loadingText\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("onboardingSessionId")) {
                String string2 = bundle.getString("onboardingSessionId");
                if (string2 != null) {
                    return new h(string, string2);
                }
                throw new IllegalArgumentException("Argument \"onboardingSessionId\" is marked as non-null but was passed a null value.");
            } else {
                throw new IllegalArgumentException("Required argument \"onboardingSessionId\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new IllegalArgumentException("Required argument \"loadingText\" is missing and does not have an android:defaultValue");
        }
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("loadingText", this.a);
        bundle.putString("onboardingSessionId", this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b);
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
        StringBuilder V0 = je.V0("ShowLoadingFragmentArgs(loadingText=");
        V0.append(this.a);
        V0.append(", onboardingSessionId=");
        return je.I0(V0, this.b, ")");
    }
}
