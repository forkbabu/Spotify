package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.music.features.podcast.episode.datasource.z;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.models.Episode;
import io.reactivex.v;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class RxEpisodeDataLoader {
    private final b0 a;
    private final ObjectMapper b;

    /* access modifiers changed from: package-private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class DecorationPolicy implements JacksonModel {
        DecorationPolicy() {
        }

        public static DecorationPolicy create(EpisodePolicy episodePolicy) {
            return new AutoValue_RxEpisodeDataLoader_DecorationPolicy(episodePolicy);
        }

        @JsonProperty("episode")
        public abstract EpisodePolicy episode();
    }

    /* access modifiers changed from: package-private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class EpisodePolicy implements JacksonModel {
        EpisodePolicy() {
        }

        public static EpisodePolicy create(ShowPolicy showPolicy, PodcastSegmentsPolicy podcastSegmentsPolicy, boolean z, boolean z2) {
            return new AutoValue_RxEpisodeDataLoader_EpisodePolicy(showPolicy, podcastSegmentsPolicy, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, z, z2);
        }

        @JsonProperty("available")
        public abstract boolean available();

        @JsonProperty("backgroundable")
        public abstract boolean backgroundable();

        @JsonProperty("covers")
        public abstract boolean covers();

        @JsonProperty("description")
        public abstract boolean description();

        @JsonProperty("freezeFrames")
        public abstract boolean freezeFrames();

        @JsonProperty("htmlDescription")
        public abstract boolean htmlDescription();

        @JsonProperty("inCollection")
        public abstract boolean inCollection();

        @JsonProperty("isExplicit")
        public abstract boolean isExplicit();

        @JsonProperty("isInListenLater")
        public abstract boolean isInListenLater();

        @JsonProperty("isMusicAndTalk")
        public abstract boolean isMusicAndTalk();

        @JsonProperty("isNew")
        public abstract boolean isNew();

        @JsonProperty("isPlayable")
        public abstract boolean isPlayable();

        @JsonProperty("isPlayed")
        public abstract boolean isPlayed();

        @JsonProperty("lastPlayedAt")
        public abstract boolean lastPlayedAt();

        @JsonProperty("length")
        public abstract boolean length();

        @JsonProperty("link")
        public abstract boolean link();

        @JsonProperty("manifestId")
        public abstract boolean manifestId();

        @JsonProperty("mediaTypeEnum")
        public abstract boolean mediaTypeEnum();

        @JsonProperty("name")
        public abstract boolean name();

        @JsonProperty("offline")
        public abstract boolean offline();

        @JsonProperty("playabilityRestriction")
        public abstract boolean playabilityRestriction();

        @JsonProperty("playable")
        public abstract boolean playable();

        @JsonProperty("podcastSegments")
        public abstract PodcastSegmentsPolicy podcastSegmentsPolicy();

        @JsonProperty("previewId")
        public abstract boolean previewId();

        @JsonProperty("previewManifestId")
        public abstract boolean previewManifestId();

        @JsonProperty("publishDate")
        public abstract boolean publishDate();

        @JsonProperty("quotes")
        public abstract boolean quotes();

        @JsonProperty("show")
        public abstract ShowPolicy showDecorationPolicy();

        @JsonProperty("syncProgress")
        public abstract boolean syncProgress();

        @JsonProperty("timeLeft")
        public abstract boolean timeLeft();

        @JsonProperty("transcripts")
        public abstract boolean transcripts();

        @JsonProperty("type")
        public abstract boolean type();
    }

    static abstract class EpisodeRequestModel implements JacksonModel {
        EpisodeRequestModel() {
        }

        public static EpisodeRequestModel create(List<String> list, DecorationPolicy decorationPolicy) {
            return new AutoValue_RxEpisodeDataLoader_EpisodeRequestModel(list, decorationPolicy);
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("policy")
        public abstract DecorationPolicy getDecorationPolicy();

        /* access modifiers changed from: package-private */
        @JsonProperty("items")
        public abstract List<String> getItems();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static abstract class ErrorResponse implements JacksonModel {
        ErrorResponse() {
        }

        @JsonCreator
        public static ErrorResponse create(@JsonProperty("error") String str) {
            return new AutoValue_RxEpisodeDataLoader_ErrorResponse(str);
        }

        /* access modifiers changed from: package-private */
        public abstract String getError();
    }

    /* access modifiers changed from: package-private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class PodcastSegmentsPolicy implements JacksonModel {
        PodcastSegmentsPolicy() {
        }

        public static PodcastSegmentsPolicy create() {
            return new AutoValue_RxEpisodeDataLoader_PodcastSegmentsPolicy(true);
        }

        @JsonProperty("artists")
        public abstract boolean artists();
    }

    /* access modifiers changed from: package-private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ShowPolicy implements JacksonModel {
        ShowPolicy() {
        }

        public static ShowPolicy create() {
            return new AutoValue_RxEpisodeDataLoader_ShowPolicy(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        }

        @JsonProperty("consumptionOrder")
        public abstract boolean consumptionOrder();

        @JsonProperty("covers")
        public abstract boolean covers();

        @JsonProperty("description")
        public abstract boolean description();

        @JsonProperty("inCollection")
        public abstract boolean inCollection();

        @JsonProperty("isExplicit")
        public abstract boolean isExplicit();

        @JsonProperty("language")
        public abstract boolean language();

        @JsonProperty("latestPlayedEpisodeLink")
        public abstract boolean latestPlayedEpisodeLink();

        @JsonProperty("link")
        public abstract boolean link();

        @JsonProperty("mediaTypeEnum")
        public abstract boolean mediaTypeEnum();

        @JsonProperty("name")
        public abstract boolean name();

        @JsonProperty("numEpisodes")
        public abstract boolean numEpisodes();

        @JsonProperty(ContextTrack.Metadata.KEY_POPULARITY)
        public abstract boolean popularity();

        @JsonProperty("publisher")
        public abstract boolean publisher();

        @JsonProperty("trailerUri")
        public abstract boolean trailerUri();
    }

    public RxEpisodeDataLoader(b0 b0Var, g gVar) {
        this.a = b0Var;
        e b2 = gVar.b();
        b2.d(JsonInclude.Include.NON_NULL);
        this.b = b2.build();
    }

    public z a(String str, Response response) {
        Episode episode;
        if (response.getStatus() == 200) {
            Map<String, Episode> k = tyd.k(ShowDecorateRequest$ProtoDecorateResponse.n(response.getBody()));
            if (k != null && !k.isEmpty() && (episode = k.get(str)) != null) {
                return new z.c(episode, Optional.absent(), Optional.absent(), Optional.absent(), Optional.absent());
            }
            throw new RuntimeException(String.format("Episode not found [%s]", str));
        }
        StringBuilder V0 = je.V0("Failed Request: ");
        V0.append(((ErrorResponse) this.b.readValue(response.getBody(), ErrorResponse.class)).getError());
        throw new RuntimeException(V0.toString());
    }

    public v b(String str, boolean z, boolean z2) {
        return this.a.a(EpisodeRequestModel.create(Collections.singletonList(str), DecorationPolicy.create(EpisodePolicy.create(ShowPolicy.create(), PodcastSegmentsPolicy.create(), z, z2))), true, 300).j0(new t(this, str));
    }
}
