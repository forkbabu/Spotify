package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class CreateRadioStationModel implements JacksonModel {
    public static CreateRadioStationModel create(String[] strArr) {
        strArr.getClass();
        return new AutoValue_CreateRadioStationModel(Arrays.asList(strArr), null, null);
    }

    @JsonProperty("imageUri")
    public abstract String imageUri();

    @JsonProperty
    public abstract List<String> seeds();

    @JsonProperty("title")
    public abstract String title();

    public static CreateRadioStationModel create(List<String> list) {
        list.getClass();
        return new AutoValue_CreateRadioStationModel(list, null, null);
    }

    public static CreateRadioStationModel create(RadioStationModel radioStationModel) {
        String[] strArr = radioStationModel.seeds;
        strArr.getClass();
        return new AutoValue_CreateRadioStationModel(Arrays.asList(strArr), radioStationModel.title, radioStationModel.imageUri);
    }
}
