package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;

/* access modifiers changed from: package-private */
public final class id extends AndroidFeatureAllboardingProperties {
    private final AndroidFeatureAllboardingProperties.EnableAllboarding a;

    static final class b extends AndroidFeatureAllboardingProperties.a {
        private AndroidFeatureAllboardingProperties.EnableAllboarding a;

        b() {
        }

        public AndroidFeatureAllboardingProperties a() {
            String str = this.a == null ? " enableAllboarding" : "";
            if (str.isEmpty()) {
                return new id(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureAllboardingProperties.a b(AndroidFeatureAllboardingProperties.EnableAllboarding enableAllboarding) {
            if (enableAllboarding != null) {
                this.a = enableAllboarding;
                return this;
            }
            throw new NullPointerException("Null enableAllboarding");
        }
    }

    id(AndroidFeatureAllboardingProperties.EnableAllboarding enableAllboarding, a aVar) {
        this.a = enableAllboarding;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureAllboardingProperties
    public AndroidFeatureAllboardingProperties.EnableAllboarding a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidFeatureAllboardingProperties) {
            return this.a.equals(((AndroidFeatureAllboardingProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureAllboardingProperties{enableAllboarding=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
