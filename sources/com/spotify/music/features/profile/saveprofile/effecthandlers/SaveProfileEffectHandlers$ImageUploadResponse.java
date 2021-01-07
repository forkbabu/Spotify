package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SaveProfileEffectHandlers$ImageUploadResponse implements JacksonModel {
    @JsonCreator
    public static SaveProfileEffectHandlers$ImageUploadResponse create(@JsonProperty("uploadToken") String str) {
        return new AutoValue_SaveProfileEffectHandlers_ImageUploadResponse(str);
    }

    public abstract String uploadToken();
}
