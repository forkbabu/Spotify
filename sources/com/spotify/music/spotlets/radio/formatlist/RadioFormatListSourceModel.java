package com.spotify.music.spotlets.radio.formatlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RadioFormatListSourceModel implements Parcelable, JacksonModel {
    @JsonCreator
    public static RadioFormatListSourceModel create(@JsonProperty("total") Integer num, @JsonProperty("mediaItems") List<Map<String, String>> list) {
        return new AutoValue_RadioFormatListSourceModel(num, list);
    }

    @JsonProperty("mediaItems")
    public abstract List<Map<String, String>> mediaItems();

    @JsonProperty("total")
    public abstract Integer total();
}
