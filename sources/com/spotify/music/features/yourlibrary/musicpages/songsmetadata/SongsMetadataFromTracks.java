package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.AutoValue_SongsMetadataFromTracks;
import com.spotify.playlist.models.offline.a;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = SongsMetadataFromTracks.class)
public abstract class SongsMetadataFromTracks implements JacksonModel {
    public static final SongsMetadataFromTracks DEFAULT;

    public static class OfflineStateDeserializer extends JsonDeserializer<com.spotify.playlist.models.offline.a> {
        public com.spotify.playlist.models.offline.a a(JsonParser jsonParser) {
            Boolean bool;
            try {
                bool = (Boolean) jsonParser.readValueAs(Boolean.class);
            } catch (JsonMappingException unused) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return a.C0377a.a;
            }
            return a.f.a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ com.spotify.playlist.models.offline.a deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }
    }

    public static class OfflineStateSerializer extends JsonSerializer<com.spotify.playlist.models.offline.a> {
        public void a(com.spotify.playlist.models.offline.a aVar, JsonGenerator jsonGenerator) {
            aVar.getClass();
            if ((aVar instanceof a.C0377a) || (aVar instanceof a.b) || (aVar instanceof a.h)) {
                jsonGenerator.writeBoolean(true);
            } else {
                jsonGenerator.writeBoolean(false);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void serialize(com.spotify.playlist.models.offline.a aVar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            a(aVar, jsonGenerator);
        }
    }

    public static abstract class a {
        public abstract SongsMetadataFromTracks a();

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a d(com.spotify.playlist.models.offline.a aVar);
    }

    static {
        a builder = builder();
        builder.d(a.f.a);
        builder.c(0);
        builder.b(false);
        DEFAULT = builder.a();
    }

    public static a builder() {
        return new AutoValue_SongsMetadataFromTracks.b();
    }

    @JsonCreator
    public static SongsMetadataFromTracks create(@JsonProperty("offline_state") @JsonDeserialize(using = OfflineStateDeserializer.class) com.spotify.playlist.models.offline.a aVar, @JsonProperty("length") Integer num, @JsonProperty("is_loading") Boolean bool) {
        a builder = builder();
        SongsMetadataFromTracks songsMetadataFromTracks = DEFAULT;
        builder.d((com.spotify.playlist.models.offline.a) MoreObjects.firstNonNull(aVar, songsMetadataFromTracks.offlineState()));
        builder.c(((Integer) MoreObjects.firstNonNull(num, Integer.valueOf(songsMetadataFromTracks.length()))).intValue());
        builder.b(((Boolean) MoreObjects.firstNonNull(bool, Boolean.valueOf(songsMetadataFromTracks.isLoading()))).booleanValue());
        return builder.a();
    }

    @JsonProperty(PlayerContext.Metadata.IS_LOADING)
    public abstract boolean isLoading();

    @JsonProperty("length")
    public abstract int length();

    @JsonProperty("offline_state")
    @JsonSerialize(using = OfflineStateSerializer.class)
    public abstract com.spotify.playlist.models.offline.a offlineState();

    public abstract a toBuilder();
}
