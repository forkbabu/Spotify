package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertResult implements JacksonModel, Parcelable {
    @JsonCreator
    public static ConcertResult create(@JsonProperty("concert") Concert concert, @JsonProperty("clickThruUrl") String str, @JsonProperty("source") String str2, @JsonProperty("nearUser") Boolean bool, @JsonProperty("discovery") Boolean bool2) {
        if (concert == null) {
            concert = Concert.EMPTY;
        }
        return new AutoValue_ConcertResult(concert, str, str2, bool, bool2);
    }

    @JsonIgnore
    static SourceType createSourceFromString(String str) {
        SourceType sourceType = SourceType.ALL;
        if (MoreObjects.isNullOrEmpty(str)) {
            return sourceType;
        }
        SourceType[] sourceTypeArr = SourceType.n;
        for (SourceType sourceType2 : sourceTypeArr) {
            if (rw.equal(sourceType2.d(), str)) {
                return sourceType2;
            }
        }
        return sourceType;
    }

    @JsonProperty("clickThruUrl")
    public abstract String getClickThroughUrl();

    @JsonProperty("concert")
    public abstract Concert getConcert();

    @JsonProperty("discovery")
    public abstract Boolean getDiscovery();

    @JsonProperty("nearUser")
    public abstract Boolean getNearUser();

    @JsonProperty("source")
    public abstract String getSource();

    @JsonIgnore
    public SourceType getSourceType() {
        return createSourceFromString(getSource());
    }

    @JsonIgnore
    public boolean isVirtual() {
        return getSourceType() == SourceType.VIRTUAL || getConcert().isVirtual();
    }
}
