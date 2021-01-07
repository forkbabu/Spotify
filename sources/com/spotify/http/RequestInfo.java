package com.spotify.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class RequestInfo implements JacksonModel {
    private static final String SOURCE_IDENTIFIER = "OkHttp";
    @JsonProperty("downloaded")
    public final int bytesDownloaded;
    @JsonProperty("uploaded")
    public final int bytesUploaded;
    @JsonProperty("connection_reuse")
    public final boolean connectionReuse;
    @JsonProperty("event_ended")
    public final long requestEnd;
    @JsonProperty("payload_size")
    public final int requestPayloadSize;
    @JsonProperty("event_started")
    public final long requestStart;
    @JsonProperty("source_identifier")
    public final String sourceIdentifier = SOURCE_IDENTIFIER;
    @JsonProperty("uri")
    public final String uri;
    @JsonProperty("verb")
    public final String verb;

    RequestInfo(String str, String str2, int i, int i2, int i3, long j, long j2, boolean z) {
        this.uri = str;
        this.verb = str2;
        this.bytesDownloaded = i;
        this.bytesUploaded = i2;
        this.requestPayloadSize = i3;
        this.requestStart = j;
        this.requestEnd = j2;
        this.connectionReuse = z;
    }
}
