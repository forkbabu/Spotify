package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public class PlayerEvent implements JacksonModel {
    @JsonProperty("data")
    public Map<String, String> data;
    @JsonProperty("finish")
    public long localEndTime;
    @JsonProperty("start")
    public long localStartTime;
    @JsonProperty("type")
    public String type;
}
