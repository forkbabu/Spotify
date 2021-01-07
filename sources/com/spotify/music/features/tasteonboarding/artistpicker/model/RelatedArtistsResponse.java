package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = RelatedArtistsResponse_Deserializer.class)
public abstract class RelatedArtistsResponse implements JacksonModel, Parcelable {
    @JsonCreator
    public static RelatedArtistsResponse create(@JsonProperty("related_artists") List<TasteOnboardingItem> list) {
        return new AutoValue_RelatedArtistsResponse(gf0.a(list));
    }

    public abstract List<TasteOnboardingItem> relatedArtists();
}
