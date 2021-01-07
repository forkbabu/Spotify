package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.video.model.PlayerError;

final class AutoValue_StreamingCardData extends StreamingCardData {
    private final boolean isNextButtonDisabled;
    private final boolean isPaused;
    private final boolean isPlaying;
    private final boolean isPrevButtonDisabled;
    private final ContentItem listItem1;
    private final ContentItem listItem2;
    private final ContentItem mainContentItem;
    private final String trackUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends StreamingCardData.Builder {
        private Boolean isNextButtonDisabled;
        private Boolean isPaused;
        private Boolean isPlaying;
        private Boolean isPrevButtonDisabled;
        private ContentItem listItem1;
        private ContentItem listItem2;
        private ContentItem mainContentItem;
        private String trackUri;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData build() {
            String str = this.mainContentItem == null ? " mainContentItem" : "";
            if (this.listItem1 == null) {
                str = je.x0(str, " listItem1");
            }
            if (this.listItem2 == null) {
                str = je.x0(str, " listItem2");
            }
            if (this.isPaused == null) {
                str = je.x0(str, " isPaused");
            }
            if (this.isPlaying == null) {
                str = je.x0(str, " isPlaying");
            }
            if (this.isPrevButtonDisabled == null) {
                str = je.x0(str, " isPrevButtonDisabled");
            }
            if (this.isNextButtonDisabled == null) {
                str = je.x0(str, " isNextButtonDisabled");
            }
            if (str.isEmpty()) {
                return new AutoValue_StreamingCardData(this.mainContentItem, this.listItem1, this.listItem2, this.isPaused.booleanValue(), this.isPlaying.booleanValue(), this.isPrevButtonDisabled.booleanValue(), this.isNextButtonDisabled.booleanValue(), this.trackUri);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder isNextButtonDisabled(boolean z) {
            this.isNextButtonDisabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder isPaused(boolean z) {
            this.isPaused = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder isPlaying(boolean z) {
            this.isPlaying = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder isPrevButtonDisabled(boolean z) {
            this.isPrevButtonDisabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder listItem1(ContentItem contentItem) {
            if (contentItem != null) {
                this.listItem1 = contentItem;
                return this;
            }
            throw new NullPointerException("Null listItem1");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder listItem2(ContentItem contentItem) {
            if (contentItem != null) {
                this.listItem2 = contentItem;
                return this;
            }
            throw new NullPointerException("Null listItem2");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder mainContentItem(ContentItem contentItem) {
            if (contentItem != null) {
                this.mainContentItem = contentItem;
                return this;
            }
            throw new NullPointerException("Null mainContentItem");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder
        public StreamingCardData.Builder trackUri(String str) {
            this.trackUri = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamingCardData)) {
            return false;
        }
        StreamingCardData streamingCardData = (StreamingCardData) obj;
        if (this.mainContentItem.equals(streamingCardData.mainContentItem()) && this.listItem1.equals(streamingCardData.listItem1()) && this.listItem2.equals(streamingCardData.listItem2()) && this.isPaused == streamingCardData.isPaused() && this.isPlaying == streamingCardData.isPlaying() && this.isPrevButtonDisabled == streamingCardData.isPrevButtonDisabled() && this.isNextButtonDisabled == streamingCardData.isNextButtonDisabled()) {
            String str = this.trackUri;
            if (str == null) {
                if (streamingCardData.trackUri() == null) {
                    return true;
                }
            } else if (str.equals(streamingCardData.trackUri())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.mainContentItem.hashCode() ^ 1000003) * 1000003) ^ this.listItem1.hashCode()) * 1000003) ^ this.listItem2.hashCode()) * 1000003) ^ (this.isPaused ? 1231 : 1237)) * 1000003) ^ (this.isPlaying ? 1231 : 1237)) * 1000003) ^ (this.isPrevButtonDisabled ? 1231 : 1237)) * 1000003;
        if (!this.isNextButtonDisabled) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.trackUri;
        return i2 ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("next_button_disabled")
    public boolean isNextButtonDisabled() {
        return this.isNextButtonDisabled;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("paused")
    public boolean isPaused() {
        return this.isPaused;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("playing")
    public boolean isPlaying() {
        return this.isPlaying;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("prev_button_disabled")
    public boolean isPrevButtonDisabled() {
        return this.isPrevButtonDisabled;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("list_item_1")
    public ContentItem listItem1() {
        return this.listItem1;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("list_item_2")
    public ContentItem listItem2() {
        return this.listItem2;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty("main_content_item")
    public ContentItem mainContentItem() {
        return this.mainContentItem;
    }

    public String toString() {
        StringBuilder V0 = je.V0("StreamingCardData{mainContentItem=");
        V0.append(this.mainContentItem);
        V0.append(", listItem1=");
        V0.append(this.listItem1);
        V0.append(", listItem2=");
        V0.append(this.listItem2);
        V0.append(", isPaused=");
        V0.append(this.isPaused);
        V0.append(", isPlaying=");
        V0.append(this.isPlaying);
        V0.append(", isPrevButtonDisabled=");
        V0.append(this.isPrevButtonDisabled);
        V0.append(", isNextButtonDisabled=");
        V0.append(this.isNextButtonDisabled);
        V0.append(", trackUri=");
        return je.I0(V0, this.trackUri, "}");
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public String trackUri() {
        return this.trackUri;
    }

    private AutoValue_StreamingCardData(ContentItem contentItem, ContentItem contentItem2, ContentItem contentItem3, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.mainContentItem = contentItem;
        this.listItem1 = contentItem2;
        this.listItem2 = contentItem3;
        this.isPaused = z;
        this.isPlaying = z2;
        this.isPrevButtonDisabled = z3;
        this.isNextButtonDisabled = z4;
        this.trackUri = str;
    }
}
