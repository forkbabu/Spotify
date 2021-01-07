package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.lifecycle.a0;
import com.spotify.music.features.tasteonboarding.logging.b;
import kotlin.jvm.internal.h;

public final class f implements k<e> {
    private final iw0 a;
    private final b b;

    public f(iw0 iw0, b bVar) {
        h.e(iw0, "allboardingProvider");
        h.e(bVar, "sessionIdProvider");
        this.a = iw0;
        this.b = bVar;
    }

    /* Return type fixed from 'androidx.lifecycle.e0' to match base method */
    @Override // com.spotify.libs.onboarding.allboarding.flow.k
    public e a(a0 a0Var, Bundle bundle) {
        h.e(a0Var, "handle");
        h.e(bundle, "defaultArgs");
        return new e(this.a, this.b, a0Var);
    }
}
