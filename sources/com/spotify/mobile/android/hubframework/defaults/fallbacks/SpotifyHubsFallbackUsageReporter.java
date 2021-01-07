package com.spotify.mobile.android.hubframework.defaults.fallbacks;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import java.util.HashSet;
import java.util.Set;

final class SpotifyHubsFallbackUsageReporter {
    private final Set<String> a = new HashSet();
    private final c.a b;

    private static final class FallbackUsage extends Exception {
        private static final long serialVersionUID = 9005131946731261203L;

        FallbackUsage(String str) {
            super(str);
        }
    }

    SpotifyHubsFallbackUsageReporter(c.a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, s81 s81) {
        if (!this.a.contains(s81.id())) {
            StringBuilder Z0 = je.Z0(str, ": ");
            Z0.append(String.format("model with id \"%s\" and componentId/category [%s, %s]", s81.id(), s81.componentId().id(), s81.componentId().category()));
            Z0.append(". Current ViewUri: ");
            Z0.append(this.b.getViewUri());
            Z0.append(']');
            Assertion.t(new FallbackUsage(Z0.toString()));
            this.a.add(s81.id());
        }
    }
}
