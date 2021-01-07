package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties;

final class rf extends AndroidLibsNowplayingDrivingProperties {
    private final AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView a;
    private final boolean b;

    static final class b extends AndroidLibsNowplayingDrivingProperties.a {
        private AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView a;
        private Boolean b;

        b() {
        }

        public AndroidLibsNowplayingDrivingProperties a() {
            String str = this.a == null ? " drivingDontLockWhenInCarView" : "";
            if (this.b == null) {
                str = je.x0(str, " drivingEnableCarViewVoice");
            }
            if (str.isEmpty()) {
                return new rf(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsNowplayingDrivingProperties.a b(AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView drivingDontLockWhenInCarView) {
            if (drivingDontLockWhenInCarView != null) {
                this.a = drivingDontLockWhenInCarView;
                return this;
            }
            throw new NullPointerException("Null drivingDontLockWhenInCarView");
        }

        public AndroidLibsNowplayingDrivingProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    rf(AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView drivingDontLockWhenInCarView, boolean z, a aVar) {
        this.a = drivingDontLockWhenInCarView;
        this.b = z;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties
    public AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsNowplayingDrivingProperties)) {
            return false;
        }
        AndroidLibsNowplayingDrivingProperties androidLibsNowplayingDrivingProperties = (AndroidLibsNowplayingDrivingProperties) obj;
        if (!this.a.equals(androidLibsNowplayingDrivingProperties.a()) || this.b != androidLibsNowplayingDrivingProperties.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsNowplayingDrivingProperties{drivingDontLockWhenInCarView=");
        V0.append(this.a);
        V0.append(", drivingEnableCarViewVoice=");
        return je.P0(V0, this.b, "}");
    }
}
