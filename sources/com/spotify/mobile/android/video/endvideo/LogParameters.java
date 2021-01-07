package com.spotify.mobile.android.video.endvideo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class LogParameters implements JacksonModel {
    @JsonProperty("message")
    public String message;
    @JsonProperty("message_name")
    public String messageName;
    @JsonProperty("version")
    public Long messageVersion;
    @JsonProperty("sequence_number")
    public Long sequenceNumber;
}
