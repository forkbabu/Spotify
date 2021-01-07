package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeaturePremiumHubProperties;

final class ge extends AndroidFeaturePremiumHubProperties {
    private final AndroidFeaturePremiumHubProperties.PremiumHubPhase2 a;

    static final class b extends AndroidFeaturePremiumHubProperties.a {
        private AndroidFeaturePremiumHubProperties.PremiumHubPhase2 a;

        b() {
        }

        public AndroidFeaturePremiumHubProperties a() {
            String str = this.a == null ? " premiumHubPhase2" : "";
            if (str.isEmpty()) {
                return new ge(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeaturePremiumHubProperties.a b(AndroidFeaturePremiumHubProperties.PremiumHubPhase2 premiumHubPhase2) {
            if (premiumHubPhase2 != null) {
                this.a = premiumHubPhase2;
                return this;
            }
            throw new NullPointerException("Null premiumHubPhase2");
        }
    }

    ge(AndroidFeaturePremiumHubProperties.PremiumHubPhase2 premiumHubPhase2, a aVar) {
        this.a = premiumHubPhase2;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePremiumHubProperties
    public AndroidFeaturePremiumHubProperties.PremiumHubPhase2 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidFeaturePremiumHubProperties) {
            return this.a.equals(((AndroidFeaturePremiumHubProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeaturePremiumHubProperties{premiumHubPhase2=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
