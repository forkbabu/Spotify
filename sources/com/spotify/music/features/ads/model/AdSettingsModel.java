package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdSettingsModel implements JacksonModel {
    public List<AdSettings> settings;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AdSettings implements JacksonModel {
        public Integer display_time_interval;
        public Boolean enabled;
        public String id;
    }
}
