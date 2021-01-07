package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.navigation.d;
import kotlin.jvm.internal.h;

public final class x implements d {
    private final boolean a;

    public x(boolean z) {
        this.a = z;
    }

    public static final x fromBundle(Bundle bundle) {
        h.e(bundle, "bundle");
        bundle.setClassLoader(x.class.getClassLoader());
        if (bundle.containsKey("isSkippable")) {
            return new x(bundle.getBoolean("isSkippable"));
        }
        throw new IllegalArgumentException("Required argument \"isSkippable\" is missing and does not have an android:defaultValue");
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof x) && this.a == ((x) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("SkipDialogFragmentArgs(isSkippable="), this.a, ")");
    }
}
