package com.spotify.remoteconfig;

import com.spotify.remoteconfig.h8;

/* renamed from: com.spotify.remoteconfig.if  reason: invalid class name */
final class Cif extends h8 {
    private final boolean a;

    /* renamed from: com.spotify.remoteconfig.if$b */
    static final class b extends h8.a {
        private Boolean a;

        b() {
        }

        public h8 a() {
            String str = this.a == null ? " enablePlaylistsWithStories" : "";
            if (str.isEmpty()) {
                return new Cif(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public h8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    Cif(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.h8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h8) || this.a != ((h8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsFullscreenStoryPrefetcherProperties{enablePlaylistsWithStories="), this.a, "}");
    }
}
