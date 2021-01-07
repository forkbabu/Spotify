package com.spotify.music.features.ads.audioplus.topbanner.carousel.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.ads.model.Ad;
import java.util.List;

public abstract class CarouselAds implements JacksonModel {
    @JsonCreator
    public static CarouselAds create(@JsonProperty("mobile-screensaver") List<Ad> list) {
        return new AutoValue_CarouselAds(list);
    }

    public abstract List<Ad> getAds();
}
