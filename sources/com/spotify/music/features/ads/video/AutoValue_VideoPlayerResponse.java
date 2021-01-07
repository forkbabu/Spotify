package com.spotify.music.features.ads.video;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_VideoPlayerResponse extends VideoPlayerResponse {
    private final String advancedReason;
    private final String type;

    AutoValue_VideoPlayerResponse(String str, String str2) {
        this.type = str;
        this.advancedReason = str2;
    }

    @Override // com.spotify.music.features.ads.video.VideoPlayerResponse
    @JsonProperty("advance_reason")
    public String advancedReason() {
        return this.advancedReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoPlayerResponse)) {
            return false;
        }
        VideoPlayerResponse videoPlayerResponse = (VideoPlayerResponse) obj;
        String str = this.type;
        if (str != null ? str.equals(videoPlayerResponse.type()) : videoPlayerResponse.type() == null) {
            String str2 = this.advancedReason;
            if (str2 == null) {
                if (videoPlayerResponse.advancedReason() == null) {
                    return true;
                }
            } else if (str2.equals(videoPlayerResponse.advancedReason())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.advancedReason;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VideoPlayerResponse{type=");
        V0.append(this.type);
        V0.append(", advancedReason=");
        return je.I0(V0, this.advancedReason, "}");
    }

    @Override // com.spotify.music.features.ads.video.VideoPlayerResponse
    @JsonProperty("type")
    public String type() {
        return this.type;
    }
}
