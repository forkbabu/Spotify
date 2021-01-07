package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager;

/* access modifiers changed from: package-private */
public final class c implements FeatureManager.b {
    c() {
    }

    @Override // com.facebook.internal.FeatureManager.b
    public void a(boolean z) {
        if (z) {
            tf.a();
            if (FeatureManager.e(FeatureManager.Feature.CrashShield)) {
                b.a();
                uf.a();
            }
            FeatureManager.e(FeatureManager.Feature.ThreadCheck);
        }
    }
}
