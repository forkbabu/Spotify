package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.ContextPage;
import java.util.Map;

final class AutoValue_ContextPage extends ContextPage {
    private final ImmutableMap<String, String> metadata;
    private final String nextPageUrl;
    private final String pageUrl;
    private final Optional<ImmutableList<ContextTrack>> tracks;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ContextPage.Builder {
        private ImmutableMap<String, String> metadata;
        private String nextPageUrl;
        private String pageUrl;
        private Optional<ImmutableList<ContextTrack>> tracks;

        @Override // com.spotify.player.model.ContextPage.Builder
        public ContextPage build() {
            String str = this.pageUrl == null ? " pageUrl" : "";
            if (this.nextPageUrl == null) {
                str = je.x0(str, " nextPageUrl");
            }
            if (this.metadata == null) {
                str = je.x0(str, " metadata");
            }
            if (str.isEmpty()) {
                return new AutoValue_ContextPage(this.pageUrl, this.nextPageUrl, this.tracks, this.metadata);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.ContextPage.Builder
        public ContextPage.Builder metadata(Map<String, String> map) {
            this.metadata = ImmutableMap.copyOf(map);
            return this;
        }

        @Override // com.spotify.player.model.ContextPage.Builder
        public ContextPage.Builder nextPageUrl(String str) {
            if (str != null) {
                this.nextPageUrl = str;
                return this;
            }
            throw new NullPointerException("Null nextPageUrl");
        }

        @Override // com.spotify.player.model.ContextPage.Builder
        public ContextPage.Builder pageUrl(String str) {
            if (str != null) {
                this.pageUrl = str;
                return this;
            }
            throw new NullPointerException("Null pageUrl");
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.player.model.ContextPage.Builder
        public ContextPage.Builder tracks(ImmutableList<ContextTrack> immutableList) {
            this.tracks = Optional.of(immutableList);
            return this;
        }

        Builder() {
            this.tracks = Optional.absent();
        }

        private Builder(ContextPage contextPage) {
            this.tracks = Optional.absent();
            this.pageUrl = contextPage.pageUrl();
            this.nextPageUrl = contextPage.nextPageUrl();
            this.tracks = contextPage.tracks();
            this.metadata = contextPage.metadata();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextPage)) {
            return false;
        }
        ContextPage contextPage = (ContextPage) obj;
        if (!this.pageUrl.equals(contextPage.pageUrl()) || !this.nextPageUrl.equals(contextPage.nextPageUrl()) || !this.tracks.equals(contextPage.tracks()) || !this.metadata.equals(contextPage.metadata())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.nextPageUrl.hashCode()) * 1000003) ^ this.tracks.hashCode()) * 1000003) ^ this.metadata.hashCode();
    }

    @Override // com.spotify.player.model.ContextPage
    @JsonProperty("metadata")
    public ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    @Override // com.spotify.player.model.ContextPage
    @JsonProperty("next_page_url")
    public String nextPageUrl() {
        return this.nextPageUrl;
    }

    @Override // com.spotify.player.model.ContextPage
    @JsonProperty("page_url")
    public String pageUrl() {
        return this.pageUrl;
    }

    @Override // com.spotify.player.model.ContextPage
    public ContextPage.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextPage{pageUrl=");
        V0.append(this.pageUrl);
        V0.append(", nextPageUrl=");
        V0.append(this.nextPageUrl);
        V0.append(", tracks=");
        V0.append(this.tracks);
        V0.append(", metadata=");
        V0.append(this.metadata);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.ContextPage
    @JsonProperty("tracks")
    public Optional<ImmutableList<ContextTrack>> tracks() {
        return this.tracks;
    }

    private AutoValue_ContextPage(String str, String str2, Optional<ImmutableList<ContextTrack>> optional, ImmutableMap<String, String> immutableMap) {
        this.pageUrl = str;
        this.nextPageUrl = str2;
        this.tracks = optional;
        this.metadata = immutableMap;
    }
}
