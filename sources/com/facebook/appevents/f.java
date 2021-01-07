package com.facebook.appevents;

import com.adjust.sdk.Constants;
import com.facebook.internal.w;
import com.facebook.k;

/* access modifiers changed from: package-private */
public final class f implements w.a {
    f() {
    }

    @Override // com.facebook.internal.w.a
    public void a(String str) {
        if (!uf.c(e.class)) {
            try {
                k.d().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString(Constants.INSTALL_REFERRER, str).apply();
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }
}
