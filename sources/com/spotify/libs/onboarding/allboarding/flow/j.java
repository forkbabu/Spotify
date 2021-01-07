package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.h;

public final class j implements k<i> {
    private final iw0 a;

    public j(iw0 iw0) {
        h.e(iw0, "allboardingProvider");
        this.a = iw0;
    }

    /* Return type fixed from 'androidx.lifecycle.e0' to match base method */
    @Override // com.spotify.libs.onboarding.allboarding.flow.k
    public i a(a0 a0Var, Bundle bundle) {
        h.e(a0Var, "handle");
        h.e(bundle, "defaultArgs");
        h.e(bundle, "bundle");
        bundle.setClassLoader(h.class.getClassLoader());
        if (bundle.containsKey("loadingText")) {
            String string = bundle.getString("loadingText");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"loadingText\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("onboardingSessionId")) {
                String string2 = bundle.getString("onboardingSessionId");
                if (string2 != null) {
                    return new i(this.a, new h(string, string2).b());
                }
                throw new IllegalArgumentException("Argument \"onboardingSessionId\" is marked as non-null but was passed a null value.");
            } else {
                throw new IllegalArgumentException("Required argument \"onboardingSessionId\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new IllegalArgumentException("Required argument \"loadingText\" is missing and does not have an android:defaultValue");
        }
    }
}
