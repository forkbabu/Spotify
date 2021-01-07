package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureNavigationProperties;

final class xd extends AndroidFeatureNavigationProperties {
    private final AndroidFeatureNavigationProperties.EnableLabelRemoval a;
    private final boolean b;

    static final class b extends AndroidFeatureNavigationProperties.a {
        private AndroidFeatureNavigationProperties.EnableLabelRemoval a;
        private Boolean b;

        b() {
        }

        public AndroidFeatureNavigationProperties a() {
            String str = this.a == null ? " enableLabelRemoval" : "";
            if (this.b == null) {
                str = je.x0(str, " showPremiumLabel");
            }
            if (str.isEmpty()) {
                return new xd(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureNavigationProperties.a b(AndroidFeatureNavigationProperties.EnableLabelRemoval enableLabelRemoval) {
            if (enableLabelRemoval != null) {
                this.a = enableLabelRemoval;
                return this;
            }
            throw new NullPointerException("Null enableLabelRemoval");
        }

        public AndroidFeatureNavigationProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    xd(AndroidFeatureNavigationProperties.EnableLabelRemoval enableLabelRemoval, boolean z, a aVar) {
        this.a = enableLabelRemoval;
        this.b = z;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureNavigationProperties
    public AndroidFeatureNavigationProperties.EnableLabelRemoval a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureNavigationProperties
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeatureNavigationProperties)) {
            return false;
        }
        AndroidFeatureNavigationProperties androidFeatureNavigationProperties = (AndroidFeatureNavigationProperties) obj;
        if (!this.a.equals(androidFeatureNavigationProperties.a()) || this.b != androidFeatureNavigationProperties.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureNavigationProperties{enableLabelRemoval=");
        V0.append(this.a);
        V0.append(", showPremiumLabel=");
        return je.P0(V0, this.b, "}");
    }
}
