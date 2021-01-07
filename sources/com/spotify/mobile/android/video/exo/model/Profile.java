package com.spotify.mobile.android.video.exo.model;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.d0;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile implements JacksonModel {
    @JsonProperty("audio_bitrate")
    public int audioBitrate;
    @JsonProperty("audio_codec")
    public String audioCodec;
    @JsonProperty("encryption_index")
    public Integer encryptionIndex;
    @JsonProperty("file_type")
    public String fileType;
    public d0 format;
    @JsonProperty("id")
    public long id;
    @JsonProperty("max_bitrate")
    public String maxBitrate;
    @JsonProperty("mime_type")
    public String mimeType;
    @JsonProperty("video_bitrate")
    public int videoBitrate;
    @JsonProperty("video_codec")
    public String videoCodec;
    @JsonProperty("video_height")
    public int videoHeight;
    @JsonProperty("video_resolution")
    public int videoResolution;
    @JsonProperty("video_width")
    public int videoWidth;

    @JsonCreator
    public Profile(@JsonProperty("id") long j, @JsonProperty("video_bitrate") int i, @JsonProperty("video_codec") String str, @JsonProperty("video_resolution") int i2, @JsonProperty("video_width") int i3, @JsonProperty("video_height") int i4, @JsonProperty("audio_bitrate") int i5, @JsonProperty("audio_codec") String str2, @JsonProperty("mime_type") String str3, @JsonProperty("file_type") String str4, @JsonProperty("max_bitrate") String str5, @JsonProperty("encryption_index") Integer num) {
        this.id = j;
        this.videoBitrate = i;
        this.videoCodec = str;
        this.videoResolution = i2;
        this.videoWidth = i3;
        this.videoHeight = i4;
        this.audioBitrate = i5;
        this.audioCodec = str2;
        this.mimeType = str3;
        this.fileType = str4;
        this.maxBitrate = str5;
        this.encryptionIndex = num;
        if (TextUtils.isEmpty(str2)) {
            this.format = d0.x(String.valueOf(j), str3, null, str, i, i3, i4, -1.0f, null, -1);
        } else {
            this.format = d0.k(String.valueOf(j), str3, null, str2, i5, -1, -1, null, -1, null);
        }
    }
}
