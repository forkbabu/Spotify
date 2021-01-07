package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureDrivingJumpstartProperties;

final class od extends AndroidFeatureDrivingJumpstartProperties {
    private final AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback a;

    static final class b extends AndroidFeatureDrivingJumpstartProperties.a {
        private AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback a;

        b() {
        }

        public AndroidFeatureDrivingJumpstartProperties a() {
            String str = this.a == null ? " drivingCarViewNpvHoldback" : "";
            if (str.isEmpty()) {
                return new od(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureDrivingJumpstartProperties.a b(AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback drivingCarViewNpvHoldback) {
            if (drivingCarViewNpvHoldback != null) {
                this.a = drivingCarViewNpvHoldback;
                return this;
            }
            throw new NullPointerException("Null drivingCarViewNpvHoldback");
        }
    }

    od(AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback drivingCarViewNpvHoldback, a aVar) {
        this.a = drivingCarViewNpvHoldback;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureDrivingJumpstartProperties
    public AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidFeatureDrivingJumpstartProperties) {
            return this.a.equals(((AndroidFeatureDrivingJumpstartProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureDrivingJumpstartProperties{drivingCarViewNpvHoldback=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
