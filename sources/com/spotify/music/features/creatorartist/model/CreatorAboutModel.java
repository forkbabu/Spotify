package com.spotify.music.features.creatorartist.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.creatorartist.model.C$AutoValue_CreatorAboutModel;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public abstract class CreatorAboutModel implements Parcelable, JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return new C$AutoValue_CreatorAboutModel.Builder();
        }

        /* access modifiers changed from: package-private */
        public abstract CreatorAboutModel autoBuild();

        @JsonProperty("autobiography")
        public abstract Builder autobiography(Autobiography autobiography);

        @JsonProperty("biography")
        public abstract Builder biography(String str);

        public CreatorAboutModel build() {
            if (!images().isPresent()) {
                images(Collections.emptyList());
            }
            if (!monthlyListeners().isPresent()) {
                monthlyListeners(0);
            }
            if (!globalChartPosition().isPresent()) {
                globalChartPosition(0);
            }
            return autoBuild();
        }

        /* access modifiers changed from: package-private */
        public abstract Optional<Integer> globalChartPosition();

        @JsonProperty("globalChartPosition")
        public abstract Builder globalChartPosition(int i);

        /* access modifiers changed from: package-private */
        public abstract Optional<List<ImageModel>> images();

        @JsonProperty("images")
        public abstract Builder images(List<ImageModel> list);

        @JsonProperty("mainImageUrl")
        public abstract Builder mainImageUrl(String str);

        /* access modifiers changed from: package-private */
        public abstract Optional<Integer> monthlyListeners();

        @JsonProperty("monthlyListeners")
        public abstract Builder monthlyListeners(int i);

        @JsonProperty("name")
        public abstract Builder name(String str);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends zod<ImageModel> {
        protected a() {
            super(CreatorAboutModel.getCreator());
        }
    }

    public static Builder builder() {
        return new C$AutoValue_CreatorAboutModel.Builder();
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ImageModel> getCreator() {
        return AutoValue_ImageModel.CREATOR;
    }

    public abstract Autobiography autobiography();

    public abstract String biography();

    public abstract int globalChartPosition();

    public abstract List<ImageModel> images();

    public abstract String mainImageUrl();

    public abstract int monthlyListeners();

    public abstract String name();
}
