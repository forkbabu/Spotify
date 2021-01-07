package com.spotify.remoteconfig;

import com.spotify.remoteconfig.rb;

final class ih extends rb {
    private final boolean a;

    static final class b extends rb.a {
        private Boolean a;

        b() {
        }

        public rb a() {
            String str = this.a == null ? " wazeSdkEnabled" : "";
            if (str.isEmpty()) {
                return new ih(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public rb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ih(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.rb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb) || this.a != ((rb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsWazeProperties{wazeSdkEnabled="), this.a, "}");
    }
}
