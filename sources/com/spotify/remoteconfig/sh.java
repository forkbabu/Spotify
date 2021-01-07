package com.spotify.remoteconfig;

import com.spotify.remoteconfig.fc;

/* access modifiers changed from: package-private */
public final class sh extends fc {
    private final boolean a;

    static final class b extends fc.a {
        private Boolean a;

        b() {
        }

        public fc a() {
            String str = this.a == null ? " enableNavigationLoggerEventSending" : "";
            if (str.isEmpty()) {
                return new sh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public fc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    sh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.fc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc) || this.a != ((fc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsInstrumentationNavigationLoggerIntegrationProperties{enableNavigationLoggerEventSending="), this.a, "}");
    }
}
