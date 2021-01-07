package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsCarDetectionProperties;

final class cf extends AndroidLibsCarDetectionProperties {
    private final AndroidLibsCarDetectionProperties.CarDetectionIsEnabled a;

    static final class b extends AndroidLibsCarDetectionProperties.a {
        private AndroidLibsCarDetectionProperties.CarDetectionIsEnabled a;

        b() {
        }

        public AndroidLibsCarDetectionProperties a() {
            String str = this.a == null ? " carDetectionIsEnabled" : "";
            if (str.isEmpty()) {
                return new cf(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsCarDetectionProperties.a b(AndroidLibsCarDetectionProperties.CarDetectionIsEnabled carDetectionIsEnabled) {
            if (carDetectionIsEnabled != null) {
                this.a = carDetectionIsEnabled;
                return this;
            }
            throw new NullPointerException("Null carDetectionIsEnabled");
        }
    }

    cf(AndroidLibsCarDetectionProperties.CarDetectionIsEnabled carDetectionIsEnabled, a aVar) {
        this.a = carDetectionIsEnabled;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsCarDetectionProperties
    public AndroidLibsCarDetectionProperties.CarDetectionIsEnabled a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsCarDetectionProperties) {
            return this.a.equals(((AndroidLibsCarDetectionProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsCarDetectionProperties{carDetectionIsEnabled=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
