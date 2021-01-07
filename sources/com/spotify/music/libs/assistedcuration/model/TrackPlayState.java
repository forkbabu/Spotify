package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.q;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackPlayState implements JacksonModel {

    static class PlayabilityRestrictionDeserializer extends JsonDeserializer<PlayabilityRestriction> {
        PlayabilityRestrictionDeserializer() {
        }

        public PlayabilityRestriction a(JsonParser jsonParser) {
            return q.l((String) jsonParser.readValueAs(String.class));
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ PlayabilityRestriction deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }
    }

    @JsonCreator
    public static TrackPlayState create(@JsonProperty("isPlayable") boolean z, @JsonProperty("playabilityRestriction") @JsonDeserialize(using = PlayabilityRestrictionDeserializer.class) PlayabilityRestriction playabilityRestriction) {
        return new AutoValue_TrackPlayState(z, playabilityRestriction);
    }

    public abstract PlayabilityRestriction getPlayabilityRestriction();

    public abstract boolean isPlayable();
}
