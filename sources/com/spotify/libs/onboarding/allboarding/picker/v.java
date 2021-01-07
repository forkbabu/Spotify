package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.lifecycle.a0;
import com.spotify.libs.onboarding.allboarding.flow.k;
import kotlin.jvm.internal.h;

public final class v implements k<u> {
    private final iw0 a;
    private final rw0 b;
    private final vl8 c;

    public v(iw0 iw0, rw0 rw0, vl8 vl8) {
        h.e(iw0, "allboardingProvider");
        h.e(rw0, "pickerLogger");
        h.e(vl8, "artistPickerLogger");
        this.a = iw0;
        this.b = rw0;
        this.c = vl8;
    }

    /* Return type fixed from 'androidx.lifecycle.e0' to match base method */
    @Override // com.spotify.libs.onboarding.allboarding.flow.k
    public u a(a0 a0Var, Bundle bundle) {
        h.e(a0Var, "handle");
        h.e(bundle, "defaultArgs");
        h.e(bundle, "bundle");
        bundle.setClassLoader(m.class.getClassLoader());
        if (bundle.containsKey("onboardingSessionId")) {
            String string = bundle.getString("onboardingSessionId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"onboardingSessionId\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("stepId")) {
                m mVar = new m(string, bundle.getLong("stepId"));
                return new u(this.a, this.b, this.c, mVar.a(), mVar.b(), null, 32);
            } else {
                throw new IllegalArgumentException("Required argument \"stepId\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new IllegalArgumentException("Required argument \"onboardingSessionId\" is missing and does not have an android:defaultValue");
        }
    }
}
