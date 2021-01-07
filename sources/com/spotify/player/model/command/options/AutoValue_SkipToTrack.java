package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.command.options.SkipToTrack;

final class AutoValue_SkipToTrack extends SkipToTrack {
    private final Optional<Long> pageIndex;
    private final Optional<String> pageUrl;
    private final Optional<Long> trackIndex;
    private final Optional<String> trackUid;
    private final Optional<String> trackUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SkipToTrack.Builder {
        private Optional<Long> pageIndex;
        private Optional<String> pageUrl;
        private Optional<Long> trackIndex;
        private Optional<String> trackUid;
        private Optional<String> trackUri;

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack build() {
            return new AutoValue_SkipToTrack(this.pageUrl, this.pageIndex, this.trackUid, this.trackUri, this.trackIndex);
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder pageIndex(Long l) {
            this.pageIndex = Optional.of(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder pageUrl(String str) {
            this.pageUrl = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackIndex(Long l) {
            this.trackIndex = Optional.of(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackUid(String str) {
            this.trackUid = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToTrack.Builder
        public SkipToTrack.Builder trackUri(String str) {
            this.trackUri = Optional.of(str);
            return this;
        }

        Builder() {
            this.pageUrl = Optional.absent();
            this.pageIndex = Optional.absent();
            this.trackUid = Optional.absent();
            this.trackUri = Optional.absent();
            this.trackIndex = Optional.absent();
        }

        private Builder(SkipToTrack skipToTrack) {
            this.pageUrl = Optional.absent();
            this.pageIndex = Optional.absent();
            this.trackUid = Optional.absent();
            this.trackUri = Optional.absent();
            this.trackIndex = Optional.absent();
            this.pageUrl = skipToTrack.pageUrl();
            this.pageIndex = skipToTrack.pageIndex();
            this.trackUid = skipToTrack.trackUid();
            this.trackUri = skipToTrack.trackUri();
            this.trackIndex = skipToTrack.trackIndex();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkipToTrack)) {
            return false;
        }
        SkipToTrack skipToTrack = (SkipToTrack) obj;
        if (!this.pageUrl.equals(skipToTrack.pageUrl()) || !this.pageIndex.equals(skipToTrack.pageIndex()) || !this.trackUid.equals(skipToTrack.trackUid()) || !this.trackUri.equals(skipToTrack.trackUri()) || !this.trackIndex.equals(skipToTrack.trackIndex())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.pageIndex.hashCode()) * 1000003) ^ this.trackUid.hashCode()) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.trackIndex.hashCode();
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    @JsonProperty("page_index")
    public Optional<Long> pageIndex() {
        return this.pageIndex;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    @JsonProperty("page_url")
    public Optional<String> pageUrl() {
        return this.pageUrl;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    public SkipToTrack.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SkipToTrack{pageUrl=");
        V0.append(this.pageUrl);
        V0.append(", pageIndex=");
        V0.append(this.pageIndex);
        V0.append(", trackUid=");
        V0.append(this.trackUid);
        V0.append(", trackUri=");
        V0.append(this.trackUri);
        V0.append(", trackIndex=");
        return je.F0(V0, this.trackIndex, "}");
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    @JsonProperty("track_index")
    public Optional<Long> trackIndex() {
        return this.trackIndex;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    @JsonProperty("track_uid")
    public Optional<String> trackUid() {
        return this.trackUid;
    }

    @Override // com.spotify.player.model.command.options.SkipToTrack
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public Optional<String> trackUri() {
        return this.trackUri;
    }

    private AutoValue_SkipToTrack(Optional<String> optional, Optional<Long> optional2, Optional<String> optional3, Optional<String> optional4, Optional<Long> optional5) {
        this.pageUrl = optional;
        this.pageIndex = optional2;
        this.trackUid = optional3;
        this.trackUri = optional4;
        this.trackIndex = optional5;
    }
}
