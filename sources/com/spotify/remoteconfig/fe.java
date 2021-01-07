package com.spotify.remoteconfig;

import com.spotify.remoteconfig.q6;

final class fe extends q6 {
    private final boolean a;

    static final class b extends q6.a {
        private Boolean a;

        b() {
        }

        public q6 a() {
            String str = this.a == null ? " podcastLinkedPageEnabled" : "";
            if (str.isEmpty()) {
                return new fe(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    fe(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.q6
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q6) || this.a != ((q6) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeaturePodcastInspectorTracklistProperties{podcastLinkedPageEnabled="), this.a, "}");
    }
}
