package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties;

final class he extends AndroidFeaturePremiumReactivationProperties {
    private final AndroidFeaturePremiumReactivationProperties.ContentProvider a;
    private final AndroidFeaturePremiumReactivationProperties.UserPolicy b;

    static final class b extends AndroidFeaturePremiumReactivationProperties.a {
        private AndroidFeaturePremiumReactivationProperties.ContentProvider a;
        private AndroidFeaturePremiumReactivationProperties.UserPolicy b;

        b() {
        }

        public AndroidFeaturePremiumReactivationProperties a() {
            String str = this.a == null ? " contentProvider" : "";
            if (this.b == null) {
                str = je.x0(str, " userPolicy");
            }
            if (str.isEmpty()) {
                return new he(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeaturePremiumReactivationProperties.a b(AndroidFeaturePremiumReactivationProperties.ContentProvider contentProvider) {
            if (contentProvider != null) {
                this.a = contentProvider;
                return this;
            }
            throw new NullPointerException("Null contentProvider");
        }

        public AndroidFeaturePremiumReactivationProperties.a c(AndroidFeaturePremiumReactivationProperties.UserPolicy userPolicy) {
            if (userPolicy != null) {
                this.b = userPolicy;
                return this;
            }
            throw new NullPointerException("Null userPolicy");
        }
    }

    he(AndroidFeaturePremiumReactivationProperties.ContentProvider contentProvider, AndroidFeaturePremiumReactivationProperties.UserPolicy userPolicy, a aVar) {
        this.a = contentProvider;
        this.b = userPolicy;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties
    public AndroidFeaturePremiumReactivationProperties.ContentProvider a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties
    public AndroidFeaturePremiumReactivationProperties.UserPolicy d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeaturePremiumReactivationProperties)) {
            return false;
        }
        AndroidFeaturePremiumReactivationProperties androidFeaturePremiumReactivationProperties = (AndroidFeaturePremiumReactivationProperties) obj;
        if (!this.a.equals(androidFeaturePremiumReactivationProperties.a()) || !this.b.equals(androidFeaturePremiumReactivationProperties.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeaturePremiumReactivationProperties{contentProvider=");
        V0.append(this.a);
        V0.append(", userPolicy=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
