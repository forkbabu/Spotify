package com.spotify.remoteconfig;

import com.spotify.remoteconfig.oc;

final class xh extends oc {
    private final boolean a;

    static final class b extends oc.a {
        private Boolean a;

        b() {
        }

        public oc a() {
            String str = this.a == null ? " enableTopics" : "";
            if (str.isEmpty()) {
                return new xh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public oc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    xh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.oc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oc) || this.a != ((oc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsTopicConfigProperties{enableTopics="), this.a, "}");
    }
}
