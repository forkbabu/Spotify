package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class Period implements JacksonModel {
    @JsonCreator
    public static Period create(@JsonProperty("formatted_price") String str, @JsonProperty("duration") int i, @JsonProperty("duration_type") String str2) {
        return new AutoValue_Period(i, str2, str);
    }

    @JsonProperty("duration")
    public abstract int duration();

    @JsonProperty("duration_type")
    public abstract String durationType();

    @JsonProperty("formatted_price")
    public abstract String formattedPrice();
}
