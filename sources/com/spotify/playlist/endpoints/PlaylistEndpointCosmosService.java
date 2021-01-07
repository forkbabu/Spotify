package com.spotify.playlist.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsRequest;
import com.spotify.playlist.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

@CosmosService
public interface PlaylistEndpointCosmosService {

    public static final class PlayPayload implements JacksonModel {
        private final Map<String, String> contextMetadata;
        private final LoggingParams loggingParams;
        private final PlayOrigin playOrigin;
        private final PreparePlayOptions preparePlayOptions;

        public PlayPayload(PreparePlayOptions preparePlayOptions2, PlayOrigin playOrigin2, Map<String, String> map, LoggingParams loggingParams2) {
            h.e(preparePlayOptions2, "preparePlayOptions");
            h.e(playOrigin2, "playOrigin");
            h.e(map, "contextMetadata");
            this.preparePlayOptions = preparePlayOptions2;
            this.playOrigin = playOrigin2;
            this.contextMetadata = map;
            this.loggingParams = loggingParams2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.playlist.endpoints.PlaylistEndpointCosmosService$PlayPayload */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlayPayload copy$default(PlayPayload playPayload, PreparePlayOptions preparePlayOptions2, PlayOrigin playOrigin2, Map map, LoggingParams loggingParams2, int i, Object obj) {
            if ((i & 1) != 0) {
                preparePlayOptions2 = playPayload.preparePlayOptions;
            }
            if ((i & 2) != 0) {
                playOrigin2 = playPayload.playOrigin;
            }
            if ((i & 4) != 0) {
                map = playPayload.contextMetadata;
            }
            if ((i & 8) != 0) {
                loggingParams2 = playPayload.loggingParams;
            }
            return playPayload.copy(preparePlayOptions2, playOrigin2, map, loggingParams2);
        }

        public final PreparePlayOptions component1() {
            return this.preparePlayOptions;
        }

        public final PlayOrigin component2() {
            return this.playOrigin;
        }

        public final Map<String, String> component3() {
            return this.contextMetadata;
        }

        public final LoggingParams component4() {
            return this.loggingParams;
        }

        public final PlayPayload copy(PreparePlayOptions preparePlayOptions2, PlayOrigin playOrigin2, Map<String, String> map, LoggingParams loggingParams2) {
            h.e(preparePlayOptions2, "preparePlayOptions");
            h.e(playOrigin2, "playOrigin");
            h.e(map, "contextMetadata");
            return new PlayPayload(preparePlayOptions2, playOrigin2, map, loggingParams2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayPayload)) {
                return false;
            }
            PlayPayload playPayload = (PlayPayload) obj;
            return h.a(this.preparePlayOptions, playPayload.preparePlayOptions) && h.a(this.playOrigin, playPayload.playOrigin) && h.a(this.contextMetadata, playPayload.contextMetadata) && h.a(this.loggingParams, playPayload.loggingParams);
        }

        @JsonProperty("context_metadata")
        public final Map<String, String> getContextMetadata() {
            return this.contextMetadata;
        }

        @JsonProperty("logging_params")
        public final LoggingParams getLoggingParams() {
            return this.loggingParams;
        }

        @JsonProperty("play_origin")
        public final PlayOrigin getPlayOrigin() {
            return this.playOrigin;
        }

        @JsonProperty("prepare_play_options")
        public final PreparePlayOptions getPreparePlayOptions() {
            return this.preparePlayOptions;
        }

        public int hashCode() {
            PreparePlayOptions preparePlayOptions2 = this.preparePlayOptions;
            int i = 0;
            int hashCode = (preparePlayOptions2 != null ? preparePlayOptions2.hashCode() : 0) * 31;
            PlayOrigin playOrigin2 = this.playOrigin;
            int hashCode2 = (hashCode + (playOrigin2 != null ? playOrigin2.hashCode() : 0)) * 31;
            Map<String, String> map = this.contextMetadata;
            int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
            LoggingParams loggingParams2 = this.loggingParams;
            if (loggingParams2 != null) {
                i = loggingParams2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayPayload(preparePlayOptions=");
            V0.append(this.preparePlayOptions);
            V0.append(", playOrigin=");
            V0.append(this.playOrigin);
            V0.append(", contextMetadata=");
            V0.append(this.contextMetadata);
            V0.append(", loggingParams=");
            V0.append(this.loggingParams);
            V0.append(")");
            return V0.toString();
        }
    }

    @GET("sp://core-playlist/v1/playlist/{uri}")
    z<Response> a(@Path("uri") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-playlist/v1/playlist/{uri}")
    @Headers({"content-type: application/protobuf"})
    s<Response> b(@Path("uri") String str, @QueryMap Map<String, String> map, @Body PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/playlist/{uri}/contains?responseFormat=protobuf")
    z<Response> c(@Path("uri") String str, @Body PlaylistContainsRequest$ContainsRequest playlistContainsRequest$ContainsRequest);

    @POST("sp://core-playlist/v1/playlist/{uri}/play")
    z<Response> d(@Path("uri") String str, @QueryMap Map<String, String> map, @Body PlayPayload playPayload);

    @SUB("sp://core-playlist/v1/playlist/{uri}")
    s<Response> e(@Path("uri") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-playlist/v1/playlist/{uri}")
    @Headers({"content-type: application/protobuf"})
    z<Response> f(@Path("uri") String str, @QueryMap Map<String, String> map, @Body PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy);
}
