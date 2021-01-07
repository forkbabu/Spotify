package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertPartner implements JacksonModel, Parcelable {
    @JsonCreator
    public static ConcertPartner create(@JsonProperty("partnerId") String str, @JsonProperty("concertId") String str2) {
        return new AutoValue_ConcertPartner(str, str2);
    }

    @JsonProperty("concertId")
    public abstract String getConcertId();

    @JsonProperty("partnerId")
    public abstract String getPartnerId();
}
