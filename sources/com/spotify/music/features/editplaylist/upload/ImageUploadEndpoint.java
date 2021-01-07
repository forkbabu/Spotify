package com.spotify.music.features.editplaylist.upload;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.z;
import okhttp3.c0;

public interface ImageUploadEndpoint {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ImageUploadResponse implements JacksonModel {
        @JsonCreator
        public static ImageUploadResponse create(@JsonProperty("uploadToken") String str) {
            return new AutoValue_ImageUploadEndpoint_ImageUploadResponse(str);
        }

        public abstract String uploadToken();
    }

    @erf({"Content-Encoding: identity", "Content-Type: image/jpeg"})
    @irf("v4/playlist")
    z<ImageUploadResponse> a(@uqf c0 c0Var);
}
