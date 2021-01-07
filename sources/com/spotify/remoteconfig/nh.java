package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;

final class nh extends AndroidMediaBrowserServiceProperties {
    private final AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck a;
    private final boolean b;

    static final class b extends AndroidMediaBrowserServiceProperties.a {
        private AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck a;
        private Boolean b;

        b() {
        }

        public AndroidMediaBrowserServiceProperties a() {
            String str = this.a == null ? " bypassAuthHadoukenWithInitCheck" : "";
            if (this.b == null) {
                str = je.x0(str, " enableAuthForMbs");
            }
            if (str.isEmpty()) {
                return new nh(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidMediaBrowserServiceProperties.a b(AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck bypassAuthHadoukenWithInitCheck) {
            if (bypassAuthHadoukenWithInitCheck != null) {
                this.a = bypassAuthHadoukenWithInitCheck;
                return this;
            }
            throw new NullPointerException("Null bypassAuthHadoukenWithInitCheck");
        }

        public AndroidMediaBrowserServiceProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    nh(AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck bypassAuthHadoukenWithInitCheck, boolean z, a aVar) {
        this.a = bypassAuthHadoukenWithInitCheck;
        this.b = z;
    }

    @Override // com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties
    public AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidMediaBrowserServiceProperties)) {
            return false;
        }
        AndroidMediaBrowserServiceProperties androidMediaBrowserServiceProperties = (AndroidMediaBrowserServiceProperties) obj;
        if (!this.a.equals(androidMediaBrowserServiceProperties.a()) || this.b != androidMediaBrowserServiceProperties.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidMediaBrowserServiceProperties{bypassAuthHadoukenWithInitCheck=");
        V0.append(this.a);
        V0.append(", enableAuthForMbs=");
        return je.P0(V0, this.b, "}");
    }
}
