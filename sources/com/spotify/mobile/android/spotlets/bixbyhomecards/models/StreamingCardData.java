package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_StreamingCardData;
import com.spotify.mobile.android.video.model.PlayerError;

@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = StreamingCardData.class)
public abstract class StreamingCardData implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return StreamingCardData.builder();
        }

        public abstract StreamingCardData build();

        @JsonProperty("next_button_disabled")
        public abstract Builder isNextButtonDisabled(boolean z);

        @JsonProperty("paused")
        public abstract Builder isPaused(boolean z);

        @JsonProperty("playing")
        public abstract Builder isPlaying(boolean z);

        @JsonProperty("prev_button_disabled")
        public abstract Builder isPrevButtonDisabled(boolean z);

        @JsonProperty("list_item_1")
        public abstract Builder listItem1(ContentItem contentItem);

        @JsonProperty("list_item_2")
        public abstract Builder listItem2(ContentItem contentItem);

        @JsonProperty("main_content_item")
        public abstract Builder mainContentItem(ContentItem contentItem);

        @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
        public abstract Builder trackUri(String str);
    }

    public static Builder builder() {
        return new AutoValue_StreamingCardData.Builder().isPaused(true).isPlaying(false).isPrevButtonDisabled(false).isNextButtonDisabled(false);
    }

    @JsonIgnore
    public boolean isCachedData() {
        return false;
    }

    @JsonProperty("next_button_disabled")
    public abstract boolean isNextButtonDisabled();

    @JsonProperty("paused")
    public abstract boolean isPaused();

    @JsonProperty("playing")
    public abstract boolean isPlaying();

    @JsonProperty("prev_button_disabled")
    public abstract boolean isPrevButtonDisabled();

    @JsonProperty("list_item_1")
    public abstract ContentItem listItem1();

    @JsonProperty("list_item_2")
    public abstract ContentItem listItem2();

    @JsonProperty("main_content_item")
    public abstract ContentItem mainContentItem();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public abstract String trackUri();
}
