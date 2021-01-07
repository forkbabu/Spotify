package com.spotify.remoteconfig;

import com.spotify.remoteconfig.b7;

/* access modifiers changed from: package-private */
public final class oe extends b7 {
    private final boolean a;

    static final class b extends b7.a {
        private Boolean a;

        b() {
        }

        public b7 a() {
            String str = this.a == null ? " disableLoadingContent" : "";
            if (str.isEmpty()) {
                return new oe(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public b7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    oe(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.b7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b7) || this.a != ((b7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureVoiceAssistantProperties{disableLoadingContent="), this.a, "}");
    }
}
