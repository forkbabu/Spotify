package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_Video  reason: invalid class name */
abstract class C$AutoValue_Video extends Video {
    private final int bitrate;
    private final boolean hasDisplay;
    private final int height;
    private final boolean lockedRatio;
    private final String mimeType;
    private final boolean scalable;
    private final String url;
    private final String videoHexId;
    private final int width;

    C$AutoValue_Video(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str2, String str3) {
        if (str != null) {
            this.mimeType = str;
            this.width = i;
            this.height = i2;
            this.scalable = z;
            this.lockedRatio = z2;
            this.hasDisplay = z3;
            this.bitrate = i3;
            this.url = str2;
            this.videoHexId = str3;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        if (this.mimeType.equals(video.getMimeType()) && this.width == video.getWidth() && this.height == video.getHeight() && this.scalable == video.isScalable() && this.lockedRatio == video.isLockedRatio() && this.hasDisplay == video.isHasDisplay() && this.bitrate == video.getBitrate() && ((str = this.url) != null ? str.equals(video.getUrl()) : video.getUrl() == null)) {
            String str2 = this.videoHexId;
            if (str2 == null) {
                if (video.getVideoHexId() == null) {
                    return true;
                }
            } else if (str2.equals(video.getVideoHexId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("bitrate")
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("mime_type")
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("video_hex_id")
    public String getVideoHexId() {
        return this.videoHexId;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ (this.scalable ? 1231 : 1237)) * 1000003) ^ (this.lockedRatio ? 1231 : 1237)) * 1000003;
        if (!this.hasDisplay) {
            i = 1237;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ this.bitrate) * 1000003;
        String str = this.url;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.videoHexId;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 ^ i3;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("has_display")
    public boolean isHasDisplay() {
        return this.hasDisplay;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("locked_ratio")
    public boolean isLockedRatio() {
        return this.lockedRatio;
    }

    @Override // com.spotify.music.features.ads.model.Video
    @JsonProperty("scalable")
    public boolean isScalable() {
        return this.scalable;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Video{mimeType=");
        V0.append(this.mimeType);
        V0.append(", width=");
        V0.append(this.width);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", scalable=");
        V0.append(this.scalable);
        V0.append(", lockedRatio=");
        V0.append(this.lockedRatio);
        V0.append(", hasDisplay=");
        V0.append(this.hasDisplay);
        V0.append(", bitrate=");
        V0.append(this.bitrate);
        V0.append(", url=");
        V0.append(this.url);
        V0.append(", videoHexId=");
        return je.I0(V0, this.videoHexId, "}");
    }
}
