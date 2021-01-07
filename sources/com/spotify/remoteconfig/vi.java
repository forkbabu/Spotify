package com.spotify.remoteconfig;

import com.spotify.remoteconfig.PremiumDestinationProperties;

final class vi extends PremiumDestinationProperties {
    private final boolean a;
    private final PremiumDestinationProperties.PremiumTabTitle b;
    private final boolean c;

    static final class b extends PremiumDestinationProperties.a {
        private Boolean a;
        private PremiumDestinationProperties.PremiumTabTitle b;
        private Boolean c;

        b() {
        }

        public PremiumDestinationProperties a() {
            String str = this.a == null ? " premiumTabShowsOnTablets" : "";
            if (this.b == null) {
                str = je.x0(str, " premiumTabTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " v2PageEnabled");
            }
            if (str.isEmpty()) {
                return new vi(this.a.booleanValue(), this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public PremiumDestinationProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public PremiumDestinationProperties.a c(PremiumDestinationProperties.PremiumTabTitle premiumTabTitle) {
            if (premiumTabTitle != null) {
                this.b = premiumTabTitle;
                return this;
            }
            throw new NullPointerException("Null premiumTabTitle");
        }

        public PremiumDestinationProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    vi(boolean z, PremiumDestinationProperties.PremiumTabTitle premiumTabTitle, boolean z2, a aVar) {
        this.a = z;
        this.b = premiumTabTitle;
        this.c = z2;
    }

    @Override // com.spotify.remoteconfig.PremiumDestinationProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.PremiumDestinationProperties
    public PremiumDestinationProperties.PremiumTabTitle b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.PremiumDestinationProperties
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PremiumDestinationProperties)) {
            return false;
        }
        PremiumDestinationProperties premiumDestinationProperties = (PremiumDestinationProperties) obj;
        if (this.a == premiumDestinationProperties.a() && this.b.equals(premiumDestinationProperties.b()) && this.c == premiumDestinationProperties.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PremiumDestinationProperties{premiumTabShowsOnTablets=");
        V0.append(this.a);
        V0.append(", premiumTabTitle=");
        V0.append(this.b);
        V0.append(", v2PageEnabled=");
        return je.P0(V0, this.c, "}");
    }
}
