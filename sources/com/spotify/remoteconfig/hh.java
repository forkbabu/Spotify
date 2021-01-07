package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties;

final class hh extends AndroidLibsWakeWordSensoryProperties {
    private final boolean a;
    private final AndroidLibsWakeWordSensoryProperties.OperatingPoint b;
    private final boolean c;

    static final class b extends AndroidLibsWakeWordSensoryProperties.a {
        private Boolean a;
        private AndroidLibsWakeWordSensoryProperties.OperatingPoint b;
        private Boolean c;

        b() {
        }

        public AndroidLibsWakeWordSensoryProperties a() {
            String str = this.a == null ? " enableSeamlessWakeWord" : "";
            if (this.b == null) {
                str = je.x0(str, " operatingPoint");
            }
            if (this.c == null) {
                str = je.x0(str, " voiceEnableWakeWord");
            }
            if (str.isEmpty()) {
                return new hh(this.a.booleanValue(), this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsWakeWordSensoryProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsWakeWordSensoryProperties.a c(AndroidLibsWakeWordSensoryProperties.OperatingPoint operatingPoint) {
            if (operatingPoint != null) {
                this.b = operatingPoint;
                return this;
            }
            throw new NullPointerException("Null operatingPoint");
        }

        public AndroidLibsWakeWordSensoryProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    hh(boolean z, AndroidLibsWakeWordSensoryProperties.OperatingPoint operatingPoint, boolean z2, a aVar) {
        this.a = z;
        this.b = operatingPoint;
        this.c = z2;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties
    public AndroidLibsWakeWordSensoryProperties.OperatingPoint b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsWakeWordSensoryProperties)) {
            return false;
        }
        AndroidLibsWakeWordSensoryProperties androidLibsWakeWordSensoryProperties = (AndroidLibsWakeWordSensoryProperties) obj;
        if (this.a == androidLibsWakeWordSensoryProperties.a() && this.b.equals(androidLibsWakeWordSensoryProperties.b()) && this.c == androidLibsWakeWordSensoryProperties.c()) {
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
        StringBuilder V0 = je.V0("AndroidLibsWakeWordSensoryProperties{enableSeamlessWakeWord=");
        V0.append(this.a);
        V0.append(", operatingPoint=");
        V0.append(this.b);
        V0.append(", voiceEnableWakeWord=");
        return je.P0(V0, this.c, "}");
    }
}
