package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = ArtistSearchResponse_Deserializer.class)
public abstract class ArtistSearchResponse implements JacksonModel, Parcelable {
    @JsonCreator
    public static ArtistSearchResponse create(@JsonProperty("results") List<TasteOnboardingItem> list, @JsonProperty("next_page") String str) {
        return new AutoValue_ArtistSearchResponse(gf0.a(list), str);
    }

    public abstract String nextPage();

    public abstract List<TasteOnboardingItem> results();
}
