package com.spotify.mobile.android.video.endvideo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class PendingMessageResponse implements JacksonModel {
    @JsonProperty("sequence_id")
    public String sequenceId;
    @JsonProperty("sequence_number")
    public Long sequenceNumber;
}
