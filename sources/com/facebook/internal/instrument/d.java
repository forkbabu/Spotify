package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager;

/* access modifiers changed from: package-private */
public final class d implements FeatureManager.b {
    d() {
    }

    @Override // com.facebook.internal.FeatureManager.b
    public void a(boolean z) {
        if (z) {
            zf.a();
        }
    }
}
