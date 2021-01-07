package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidGoogleClockProperties;

final class qe extends AndroidGoogleClockProperties {
    private final AndroidGoogleClockProperties.GoogleClockTestContent a;

    static final class b extends AndroidGoogleClockProperties.a {
        private AndroidGoogleClockProperties.GoogleClockTestContent a;

        b() {
        }

        public AndroidGoogleClockProperties a() {
            String str = this.a == null ? " googleClockTestContent" : "";
            if (str.isEmpty()) {
                return new qe(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidGoogleClockProperties.a b(AndroidGoogleClockProperties.GoogleClockTestContent googleClockTestContent) {
            if (googleClockTestContent != null) {
                this.a = googleClockTestContent;
                return this;
            }
            throw new NullPointerException("Null googleClockTestContent");
        }
    }

    qe(AndroidGoogleClockProperties.GoogleClockTestContent googleClockTestContent, a aVar) {
        this.a = googleClockTestContent;
    }

    @Override // com.spotify.remoteconfig.AndroidGoogleClockProperties
    public AndroidGoogleClockProperties.GoogleClockTestContent a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidGoogleClockProperties) {
            return this.a.equals(((AndroidGoogleClockProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidGoogleClockProperties{googleClockTestContent=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
