package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;

final class AutoValue_SongsMetadataFromTracks extends SongsMetadataFromTracks {
    private final boolean isLoading;
    private final int length;
    private final com.spotify.playlist.models.offline.a offlineState;

    /* access modifiers changed from: package-private */
    public static final class b extends SongsMetadataFromTracks.a {
        private com.spotify.playlist.models.offline.a a;
        private Integer b;
        private Boolean c;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a
        public SongsMetadataFromTracks a() {
            String str = this.a == null ? " offlineState" : "";
            if (this.b == null) {
                str = je.x0(str, " length");
            }
            if (this.c == null) {
                str = je.x0(str, " isLoading");
            }
            if (str.isEmpty()) {
                return new AutoValue_SongsMetadataFromTracks(this.a, this.b.intValue(), this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a
        public SongsMetadataFromTracks.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a
        public SongsMetadataFromTracks.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks.a
        public SongsMetadataFromTracks.a d(com.spotify.playlist.models.offline.a aVar) {
            if (aVar != null) {
                this.a = aVar;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        b(SongsMetadataFromTracks songsMetadataFromTracks, a aVar) {
            this.a = songsMetadataFromTracks.offlineState();
            this.b = Integer.valueOf(songsMetadataFromTracks.length());
            this.c = Boolean.valueOf(songsMetadataFromTracks.isLoading());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SongsMetadataFromTracks)) {
            return false;
        }
        SongsMetadataFromTracks songsMetadataFromTracks = (SongsMetadataFromTracks) obj;
        if (this.offlineState.equals(songsMetadataFromTracks.offlineState()) && this.length == songsMetadataFromTracks.length() && this.isLoading == songsMetadataFromTracks.isLoading()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.length) * 1000003) ^ (this.isLoading ? 1231 : 1237);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks
    @JsonProperty(PlayerContext.Metadata.IS_LOADING)
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks
    @JsonProperty("length")
    public int length() {
        return this.length;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks
    @JsonProperty("offline_state")
    @JsonSerialize(using = SongsMetadataFromTracks.OfflineStateSerializer.class)
    public com.spotify.playlist.models.offline.a offlineState() {
        return this.offlineState;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks
    public SongsMetadataFromTracks.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SongsMetadataFromTracks{offlineState=");
        V0.append(this.offlineState);
        V0.append(", length=");
        V0.append(this.length);
        V0.append(", isLoading=");
        return je.P0(V0, this.isLoading, "}");
    }

    private AutoValue_SongsMetadataFromTracks(com.spotify.playlist.models.offline.a aVar, int i, boolean z) {
        this.offlineState = aVar;
        this.length = i;
        this.isLoading = z;
    }
}
