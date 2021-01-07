package com.facebook.appevents;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;

public class g {

    /* access modifiers changed from: package-private */
    public static class a implements FeatureManager.b {
        a() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                re.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements FeatureManager.b {
        b() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                hf.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements FeatureManager.b {
        c() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                ModelManager.e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements FeatureManager.b {
        d() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                ff.a();
            }
        }
    }

    public static void a() {
        FeatureManager.a(FeatureManager.Feature.AAM, new a());
        FeatureManager.a(FeatureManager.Feature.RestrictiveDataFiltering, new b());
        FeatureManager.a(FeatureManager.Feature.PrivacyProtection, new c());
        FeatureManager.a(FeatureManager.Feature.EventDeactivation, new d());
    }
}
