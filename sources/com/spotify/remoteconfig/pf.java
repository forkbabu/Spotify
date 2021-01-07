package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsNewplayingScrollWidgetsBtlProperties;

final class pf extends AndroidLibsNewplayingScrollWidgetsBtlProperties {
    private final AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment a;

    static final class b extends AndroidLibsNewplayingScrollWidgetsBtlProperties.a {
        private AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment a;

        b() {
        }

        public AndroidLibsNewplayingScrollWidgetsBtlProperties.a a(AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment btlSnpvTreatment) {
            if (btlSnpvTreatment != null) {
                this.a = btlSnpvTreatment;
                return this;
            }
            throw new NullPointerException("Null btlSnpvTreatment");
        }

        public AndroidLibsNewplayingScrollWidgetsBtlProperties b() {
            String str = this.a == null ? " btlSnpvTreatment" : "";
            if (str.isEmpty()) {
                return new pf(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    pf(AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment btlSnpvTreatment, a aVar) {
        this.a = btlSnpvTreatment;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsNewplayingScrollWidgetsBtlProperties
    public AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsNewplayingScrollWidgetsBtlProperties) {
            return this.a.equals(((AndroidLibsNewplayingScrollWidgetsBtlProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsNewplayingScrollWidgetsBtlProperties{btlSnpvTreatment=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
