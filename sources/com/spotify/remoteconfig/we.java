package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAdaptiveUiProperties;

final class we extends AndroidLibsAdaptiveUiProperties {
    private final AndroidLibsAdaptiveUiProperties.EnableSidebarLayout a;

    static final class b extends AndroidLibsAdaptiveUiProperties.a {
        private AndroidLibsAdaptiveUiProperties.EnableSidebarLayout a;

        b() {
        }

        public AndroidLibsAdaptiveUiProperties a() {
            String str = this.a == null ? " enableSidebarLayout" : "";
            if (str.isEmpty()) {
                return new we(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsAdaptiveUiProperties.a b(AndroidLibsAdaptiveUiProperties.EnableSidebarLayout enableSidebarLayout) {
            if (enableSidebarLayout != null) {
                this.a = enableSidebarLayout;
                return this;
            }
            throw new NullPointerException("Null enableSidebarLayout");
        }
    }

    we(AndroidLibsAdaptiveUiProperties.EnableSidebarLayout enableSidebarLayout, a aVar) {
        this.a = enableSidebarLayout;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdaptiveUiProperties
    public AndroidLibsAdaptiveUiProperties.EnableSidebarLayout a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsAdaptiveUiProperties) {
            return this.a.equals(((AndroidLibsAdaptiveUiProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsAdaptiveUiProperties{enableSidebarLayout=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
