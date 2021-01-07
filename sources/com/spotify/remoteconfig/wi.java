package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ak;

/* access modifiers changed from: package-private */
public final class wi extends ak {
    private final boolean a;

    static final class b extends ak.a {
        private Boolean a;

        b() {
        }

        public ak a() {
            String str = this.a == null ? " registerMultipleOsChannels" : "";
            if (str.isEmpty()) {
                return new wi(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ak.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    wi(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ak
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak) || this.a != ((ak) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("PushNotificationsProperties{registerMultipleOsChannels="), this.a, "}");
    }
}
