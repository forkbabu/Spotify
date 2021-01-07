package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;
import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public final class AutoValue_RxEpisodeDataLoader_ShowPolicy extends RxEpisodeDataLoader.ShowPolicy {
    private final boolean consumptionOrder;
    private final boolean covers;
    private final boolean description;
    private final boolean inCollection;
    private final boolean isExplicit;
    private final boolean language;
    private final boolean latestPlayedEpisodeLink;
    private final boolean link;
    private final boolean mediaTypeEnum;
    private final boolean name;
    private final boolean numEpisodes;
    private final boolean popularity;
    private final boolean publisher;
    private final boolean trailerUri;

    AutoValue_RxEpisodeDataLoader_ShowPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.link = z;
        this.name = z2;
        this.description = z3;
        this.popularity = z4;
        this.publisher = z5;
        this.language = z6;
        this.isExplicit = z7;
        this.covers = z8;
        this.numEpisodes = z9;
        this.consumptionOrder = z10;
        this.mediaTypeEnum = z11;
        this.inCollection = z12;
        this.trailerUri = z13;
        this.latestPlayedEpisodeLink = z14;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("consumptionOrder")
    public boolean consumptionOrder() {
        return this.consumptionOrder;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("covers")
    public boolean covers() {
        return this.covers;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("description")
    public boolean description() {
        return this.description;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RxEpisodeDataLoader.ShowPolicy)) {
            return false;
        }
        RxEpisodeDataLoader.ShowPolicy showPolicy = (RxEpisodeDataLoader.ShowPolicy) obj;
        if (this.link == showPolicy.link() && this.name == showPolicy.name() && this.description == showPolicy.description() && this.popularity == showPolicy.popularity() && this.publisher == showPolicy.publisher() && this.language == showPolicy.language() && this.isExplicit == showPolicy.isExplicit() && this.covers == showPolicy.covers() && this.numEpisodes == showPolicy.numEpisodes() && this.consumptionOrder == showPolicy.consumptionOrder() && this.mediaTypeEnum == showPolicy.mediaTypeEnum() && this.inCollection == showPolicy.inCollection() && this.trailerUri == showPolicy.trailerUri() && this.latestPlayedEpisodeLink == showPolicy.latestPlayedEpisodeLink()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((((((((((((((((this.link ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.name ? 1231 : 1237)) * 1000003) ^ (this.description ? 1231 : 1237)) * 1000003) ^ (this.popularity ? 1231 : 1237)) * 1000003) ^ (this.publisher ? 1231 : 1237)) * 1000003) ^ (this.language ? 1231 : 1237)) * 1000003) ^ (this.isExplicit ? 1231 : 1237)) * 1000003) ^ (this.covers ? 1231 : 1237)) * 1000003) ^ (this.numEpisodes ? 1231 : 1237)) * 1000003) ^ (this.consumptionOrder ? 1231 : 1237)) * 1000003) ^ (this.mediaTypeEnum ? 1231 : 1237)) * 1000003) ^ (this.inCollection ? 1231 : 1237)) * 1000003) ^ (this.trailerUri ? 1231 : 1237)) * 1000003;
        if (!this.latestPlayedEpisodeLink) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("inCollection")
    public boolean inCollection() {
        return this.inCollection;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("isExplicit")
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("language")
    public boolean language() {
        return this.language;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("latestPlayedEpisodeLink")
    public boolean latestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("link")
    public boolean link() {
        return this.link;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("mediaTypeEnum")
    public boolean mediaTypeEnum() {
        return this.mediaTypeEnum;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("name")
    public boolean name() {
        return this.name;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("numEpisodes")
    public boolean numEpisodes() {
        return this.numEpisodes;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty(ContextTrack.Metadata.KEY_POPULARITY)
    public boolean popularity() {
        return this.popularity;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("publisher")
    public boolean publisher() {
        return this.publisher;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowPolicy{link=");
        V0.append(this.link);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", description=");
        V0.append(this.description);
        V0.append(", popularity=");
        V0.append(this.popularity);
        V0.append(", publisher=");
        V0.append(this.publisher);
        V0.append(", language=");
        V0.append(this.language);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", covers=");
        V0.append(this.covers);
        V0.append(", numEpisodes=");
        V0.append(this.numEpisodes);
        V0.append(", consumptionOrder=");
        V0.append(this.consumptionOrder);
        V0.append(", mediaTypeEnum=");
        V0.append(this.mediaTypeEnum);
        V0.append(", inCollection=");
        V0.append(this.inCollection);
        V0.append(", trailerUri=");
        V0.append(this.trailerUri);
        V0.append(", latestPlayedEpisodeLink=");
        return je.P0(V0, this.latestPlayedEpisodeLink, "}");
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.ShowPolicy
    @JsonProperty("trailerUri")
    public boolean trailerUri() {
        return this.trailerUri;
    }
}
