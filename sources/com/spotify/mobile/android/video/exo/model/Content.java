package com.spotify.mobile.android.video.exo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Content implements JacksonModel {
    @JsonProperty("encryption_infos")
    public EncryptionInfo[] encryptionInfos;
    @JsonProperty("end_time_millis")
    public long endTimeMs;
    @JsonProperty("profiles")
    public Profile[] profiles;
    @JsonProperty("segment_length")
    public long segmentLength;
    @JsonProperty("start_time_millis")
    public long startTimeMs;

    @JsonCreator
    public Content(@JsonProperty("segment_length") long j, @JsonProperty("start_time_millis") long j2, @JsonProperty("end_time_millis") long j3, @JsonProperty("profiles") Profile[] profileArr, @JsonProperty("encryption_infos") EncryptionInfo[] encryptionInfoArr) {
        this.segmentLength = j;
        this.startTimeMs = j2;
        this.endTimeMs = j3;
        this.profiles = profileArr;
        this.encryptionInfos = encryptionInfoArr;
    }
}
