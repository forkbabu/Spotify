package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RxEpisodeDataLoader_EpisodeRequestModel extends RxEpisodeDataLoader.EpisodeRequestModel {
    private final RxEpisodeDataLoader.DecorationPolicy decorationPolicy;
    private final List<String> items;

    AutoValue_RxEpisodeDataLoader_EpisodeRequestModel(List<String> list, RxEpisodeDataLoader.DecorationPolicy decorationPolicy2) {
        if (list != null) {
            this.items = list;
            if (decorationPolicy2 != null) {
                this.decorationPolicy = decorationPolicy2;
                return;
            }
            throw new NullPointerException("Null decorationPolicy");
        }
        throw new NullPointerException("Null items");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RxEpisodeDataLoader.EpisodeRequestModel)) {
            return false;
        }
        RxEpisodeDataLoader.EpisodeRequestModel episodeRequestModel = (RxEpisodeDataLoader.EpisodeRequestModel) obj;
        if (!this.items.equals(episodeRequestModel.getItems()) || !this.decorationPolicy.equals(episodeRequestModel.getDecorationPolicy())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodeRequestModel
    @JsonProperty("policy")
    public RxEpisodeDataLoader.DecorationPolicy getDecorationPolicy() {
        return this.decorationPolicy;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodeRequestModel
    @JsonProperty("items")
    public List<String> getItems() {
        return this.items;
    }

    public int hashCode() {
        return ((this.items.hashCode() ^ 1000003) * 1000003) ^ this.decorationPolicy.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeRequestModel{items=");
        V0.append(this.items);
        V0.append(", decorationPolicy=");
        V0.append(this.decorationPolicy);
        V0.append("}");
        return V0.toString();
    }
}
