package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* access modifiers changed from: package-private */
public final class AutoValue_RxEpisodeDataLoader_EpisodePolicy extends RxEpisodeDataLoader.EpisodePolicy {
    private final boolean available;
    private final boolean backgroundable;
    private final boolean covers;
    private final boolean description;
    private final boolean freezeFrames;
    private final boolean htmlDescription;
    private final boolean inCollection;
    private final boolean isExplicit;
    private final boolean isInListenLater;
    private final boolean isMusicAndTalk;
    private final boolean isNew;
    private final boolean isPlayable;
    private final boolean isPlayed;
    private final boolean lastPlayedAt;
    private final boolean length;
    private final boolean link;
    private final boolean manifestId;
    private final boolean mediaTypeEnum;
    private final boolean name;
    private final boolean offline;
    private final boolean playabilityRestriction;
    private final boolean playable;
    private final RxEpisodeDataLoader.PodcastSegmentsPolicy podcastSegmentsPolicy;
    private final boolean previewId;
    private final boolean previewManifestId;
    private final boolean publishDate;
    private final boolean quotes;
    private final RxEpisodeDataLoader.ShowPolicy showDecorationPolicy;
    private final boolean syncProgress;
    private final boolean timeLeft;
    private final boolean transcripts;
    private final boolean type;

    AutoValue_RxEpisodeDataLoader_EpisodePolicy(RxEpisodeDataLoader.ShowPolicy showPolicy, RxEpisodeDataLoader.PodcastSegmentsPolicy podcastSegmentsPolicy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30) {
        this.showDecorationPolicy = showPolicy;
        this.podcastSegmentsPolicy = podcastSegmentsPolicy2;
        this.available = z;
        this.backgroundable = z2;
        this.covers = z3;
        this.description = z4;
        this.freezeFrames = z5;
        this.inCollection = z6;
        this.isExplicit = z7;
        this.isInListenLater = z8;
        this.isMusicAndTalk = z9;
        this.isNew = z10;
        this.isPlayed = z11;
        this.isPlayable = z12;
        this.lastPlayedAt = z13;
        this.length = z14;
        this.link = z15;
        this.manifestId = z16;
        this.mediaTypeEnum = z17;
        this.name = z18;
        this.offline = z19;
        this.playable = z20;
        this.playabilityRestriction = z21;
        this.previewId = z22;
        this.previewManifestId = z23;
        this.publishDate = z24;
        this.syncProgress = z25;
        this.timeLeft = z26;
        this.type = z27;
        this.htmlDescription = z28;
        this.quotes = z29;
        this.transcripts = z30;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("available")
    public boolean available() {
        return this.available;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("backgroundable")
    public boolean backgroundable() {
        return this.backgroundable;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("covers")
    public boolean covers() {
        return this.covers;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("description")
    public boolean description() {
        return this.description;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RxEpisodeDataLoader.EpisodePolicy)) {
            return false;
        }
        RxEpisodeDataLoader.EpisodePolicy episodePolicy = (RxEpisodeDataLoader.EpisodePolicy) obj;
        RxEpisodeDataLoader.ShowPolicy showPolicy = this.showDecorationPolicy;
        if (showPolicy != null ? showPolicy.equals(episodePolicy.showDecorationPolicy()) : episodePolicy.showDecorationPolicy() == null) {
            RxEpisodeDataLoader.PodcastSegmentsPolicy podcastSegmentsPolicy2 = this.podcastSegmentsPolicy;
            if (podcastSegmentsPolicy2 != null ? podcastSegmentsPolicy2.equals(episodePolicy.podcastSegmentsPolicy()) : episodePolicy.podcastSegmentsPolicy() == null) {
                if (this.available == episodePolicy.available() && this.backgroundable == episodePolicy.backgroundable() && this.covers == episodePolicy.covers() && this.description == episodePolicy.description() && this.freezeFrames == episodePolicy.freezeFrames() && this.inCollection == episodePolicy.inCollection() && this.isExplicit == episodePolicy.isExplicit() && this.isInListenLater == episodePolicy.isInListenLater() && this.isMusicAndTalk == episodePolicy.isMusicAndTalk() && this.isNew == episodePolicy.isNew() && this.isPlayed == episodePolicy.isPlayed() && this.isPlayable == episodePolicy.isPlayable() && this.lastPlayedAt == episodePolicy.lastPlayedAt() && this.length == episodePolicy.length() && this.link == episodePolicy.link() && this.manifestId == episodePolicy.manifestId() && this.mediaTypeEnum == episodePolicy.mediaTypeEnum() && this.name == episodePolicy.name() && this.offline == episodePolicy.offline() && this.playable == episodePolicy.playable() && this.playabilityRestriction == episodePolicy.playabilityRestriction() && this.previewId == episodePolicy.previewId() && this.previewManifestId == episodePolicy.previewManifestId() && this.publishDate == episodePolicy.publishDate() && this.syncProgress == episodePolicy.syncProgress() && this.timeLeft == episodePolicy.timeLeft() && this.type == episodePolicy.type() && this.htmlDescription == episodePolicy.htmlDescription() && this.quotes == episodePolicy.quotes() && this.transcripts == episodePolicy.transcripts()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("freezeFrames")
    public boolean freezeFrames() {
        return this.freezeFrames;
    }

    public int hashCode() {
        RxEpisodeDataLoader.ShowPolicy showPolicy = this.showDecorationPolicy;
        int i = 0;
        int hashCode = ((showPolicy == null ? 0 : showPolicy.hashCode()) ^ 1000003) * 1000003;
        RxEpisodeDataLoader.PodcastSegmentsPolicy podcastSegmentsPolicy2 = this.podcastSegmentsPolicy;
        if (podcastSegmentsPolicy2 != null) {
            i = podcastSegmentsPolicy2.hashCode();
        }
        int i2 = 1231;
        int i3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode ^ i) * 1000003) ^ (this.available ? 1231 : 1237)) * 1000003) ^ (this.backgroundable ? 1231 : 1237)) * 1000003) ^ (this.covers ? 1231 : 1237)) * 1000003) ^ (this.description ? 1231 : 1237)) * 1000003) ^ (this.freezeFrames ? 1231 : 1237)) * 1000003) ^ (this.inCollection ? 1231 : 1237)) * 1000003) ^ (this.isExplicit ? 1231 : 1237)) * 1000003) ^ (this.isInListenLater ? 1231 : 1237)) * 1000003) ^ (this.isMusicAndTalk ? 1231 : 1237)) * 1000003) ^ (this.isNew ? 1231 : 1237)) * 1000003) ^ (this.isPlayed ? 1231 : 1237)) * 1000003) ^ (this.isPlayable ? 1231 : 1237)) * 1000003) ^ (this.lastPlayedAt ? 1231 : 1237)) * 1000003) ^ (this.length ? 1231 : 1237)) * 1000003) ^ (this.link ? 1231 : 1237)) * 1000003) ^ (this.manifestId ? 1231 : 1237)) * 1000003) ^ (this.mediaTypeEnum ? 1231 : 1237)) * 1000003) ^ (this.name ? 1231 : 1237)) * 1000003) ^ (this.offline ? 1231 : 1237)) * 1000003) ^ (this.playable ? 1231 : 1237)) * 1000003) ^ (this.playabilityRestriction ? 1231 : 1237)) * 1000003) ^ (this.previewId ? 1231 : 1237)) * 1000003) ^ (this.previewManifestId ? 1231 : 1237)) * 1000003) ^ (this.publishDate ? 1231 : 1237)) * 1000003) ^ (this.syncProgress ? 1231 : 1237)) * 1000003) ^ (this.timeLeft ? 1231 : 1237)) * 1000003) ^ (this.type ? 1231 : 1237)) * 1000003) ^ (this.htmlDescription ? 1231 : 1237)) * 1000003) ^ (this.quotes ? 1231 : 1237)) * 1000003;
        if (!this.transcripts) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("htmlDescription")
    public boolean htmlDescription() {
        return this.htmlDescription;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("inCollection")
    public boolean inCollection() {
        return this.inCollection;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isExplicit")
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isInListenLater")
    public boolean isInListenLater() {
        return this.isInListenLater;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isMusicAndTalk")
    public boolean isMusicAndTalk() {
        return this.isMusicAndTalk;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isNew")
    public boolean isNew() {
        return this.isNew;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isPlayable")
    public boolean isPlayable() {
        return this.isPlayable;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("isPlayed")
    public boolean isPlayed() {
        return this.isPlayed;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("lastPlayedAt")
    public boolean lastPlayedAt() {
        return this.lastPlayedAt;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("length")
    public boolean length() {
        return this.length;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("link")
    public boolean link() {
        return this.link;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("manifestId")
    public boolean manifestId() {
        return this.manifestId;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("mediaTypeEnum")
    public boolean mediaTypeEnum() {
        return this.mediaTypeEnum;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("name")
    public boolean name() {
        return this.name;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("offline")
    public boolean offline() {
        return this.offline;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("playabilityRestriction")
    public boolean playabilityRestriction() {
        return this.playabilityRestriction;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("playable")
    public boolean playable() {
        return this.playable;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("podcastSegments")
    public RxEpisodeDataLoader.PodcastSegmentsPolicy podcastSegmentsPolicy() {
        return this.podcastSegmentsPolicy;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("previewId")
    public boolean previewId() {
        return this.previewId;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("previewManifestId")
    public boolean previewManifestId() {
        return this.previewManifestId;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("publishDate")
    public boolean publishDate() {
        return this.publishDate;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("quotes")
    public boolean quotes() {
        return this.quotes;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("show")
    public RxEpisodeDataLoader.ShowPolicy showDecorationPolicy() {
        return this.showDecorationPolicy;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("syncProgress")
    public boolean syncProgress() {
        return this.syncProgress;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("timeLeft")
    public boolean timeLeft() {
        return this.timeLeft;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodePolicy{showDecorationPolicy=");
        V0.append(this.showDecorationPolicy);
        V0.append(", podcastSegmentsPolicy=");
        V0.append(this.podcastSegmentsPolicy);
        V0.append(", available=");
        V0.append(this.available);
        V0.append(", backgroundable=");
        V0.append(this.backgroundable);
        V0.append(", covers=");
        V0.append(this.covers);
        V0.append(", description=");
        V0.append(this.description);
        V0.append(", freezeFrames=");
        V0.append(this.freezeFrames);
        V0.append(", inCollection=");
        V0.append(this.inCollection);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", isInListenLater=");
        V0.append(this.isInListenLater);
        V0.append(", isMusicAndTalk=");
        V0.append(this.isMusicAndTalk);
        V0.append(", isNew=");
        V0.append(this.isNew);
        V0.append(", isPlayed=");
        V0.append(this.isPlayed);
        V0.append(", isPlayable=");
        V0.append(this.isPlayable);
        V0.append(", lastPlayedAt=");
        V0.append(this.lastPlayedAt);
        V0.append(", length=");
        V0.append(this.length);
        V0.append(", link=");
        V0.append(this.link);
        V0.append(", manifestId=");
        V0.append(this.manifestId);
        V0.append(", mediaTypeEnum=");
        V0.append(this.mediaTypeEnum);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", offline=");
        V0.append(this.offline);
        V0.append(", playable=");
        V0.append(this.playable);
        V0.append(", playabilityRestriction=");
        V0.append(this.playabilityRestriction);
        V0.append(", previewId=");
        V0.append(this.previewId);
        V0.append(", previewManifestId=");
        V0.append(this.previewManifestId);
        V0.append(", publishDate=");
        V0.append(this.publishDate);
        V0.append(", syncProgress=");
        V0.append(this.syncProgress);
        V0.append(", timeLeft=");
        V0.append(this.timeLeft);
        V0.append(", type=");
        V0.append(this.type);
        V0.append(", htmlDescription=");
        V0.append(this.htmlDescription);
        V0.append(", quotes=");
        V0.append(this.quotes);
        V0.append(", transcripts=");
        return je.P0(V0, this.transcripts, "}");
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("transcripts")
    public boolean transcripts() {
        return this.transcripts;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.EpisodePolicy
    @JsonProperty("type")
    public boolean type() {
        return this.type;
    }
}
