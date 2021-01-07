package com.spotify.music.libs.search.ondemand.editorial.cache;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo;

final class AutoValue_EditorialOnDemandCachedInfo extends EditorialOnDemandCachedInfo {
    private final long playedTimeInMillis;
    private final String playlistUri;

    /* access modifiers changed from: package-private */
    public static final class b implements EditorialOnDemandCachedInfo.a {
        private String a;
        private Long b;

        b() {
        }

        @Override // com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo.a
        public EditorialOnDemandCachedInfo build() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " playedTimeInMillis");
            }
            if (str.isEmpty()) {
                return new AutoValue_EditorialOnDemandCachedInfo(this.a, this.b.longValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo.a
        public EditorialOnDemandCachedInfo.a playedTimeInMillis(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo.a
        public EditorialOnDemandCachedInfo.a playlistUri(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditorialOnDemandCachedInfo)) {
            return false;
        }
        EditorialOnDemandCachedInfo editorialOnDemandCachedInfo = (EditorialOnDemandCachedInfo) obj;
        if (!this.playlistUri.equals(editorialOnDemandCachedInfo.playlistUri()) || this.playedTimeInMillis != editorialOnDemandCachedInfo.playedTimeInMillis()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.playedTimeInMillis;
        return ((this.playlistUri.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo
    @JsonProperty("playedTimeInMillis")
    public long playedTimeInMillis() {
        return this.playedTimeInMillis;
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.cache.EditorialOnDemandCachedInfo
    @JsonProperty("playlistUri")
    public String playlistUri() {
        return this.playlistUri;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EditorialOnDemandCachedInfo{playlistUri=");
        V0.append(this.playlistUri);
        V0.append(", playedTimeInMillis=");
        return je.E0(V0, this.playedTimeInMillis, "}");
    }

    private AutoValue_EditorialOnDemandCachedInfo(String str, long j) {
        this.playlistUri = str;
        this.playedTimeInMillis = j;
    }
}
