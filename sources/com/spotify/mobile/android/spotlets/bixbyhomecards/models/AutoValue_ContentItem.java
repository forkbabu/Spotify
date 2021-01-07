package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;

final class AutoValue_ContentItem extends ContentItem {
    private final String contentUri;
    private final String imageUrl;
    private final String intentDataUriString;
    private final String metadata1;
    private final String metadata2;
    private final String title;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ContentItem.Builder {
        private String contentUri;
        private String imageUrl;
        private String intentDataUriString;
        private String metadata1;
        private String metadata2;
        private String title;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem build() {
            String str = this.contentUri == null ? " contentUri" : "";
            if (this.title == null) {
                str = je.x0(str, " title");
            }
            if (this.metadata1 == null) {
                str = je.x0(str, " metadata1");
            }
            if (this.imageUrl == null) {
                str = je.x0(str, " imageUrl");
            }
            if (this.intentDataUriString == null) {
                str = je.x0(str, " intentDataUriString");
            }
            if (str.isEmpty()) {
                return new AutoValue_ContentItem(this.contentUri, this.title, this.metadata1, this.metadata2, this.imageUrl, this.intentDataUriString);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder contentUri(String str) {
            if (str != null) {
                this.contentUri = str;
                return this;
            }
            throw new NullPointerException("Null contentUri");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder imageUrl(String str) {
            if (str != null) {
                this.imageUrl = str;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder intentDataUriString(String str) {
            if (str != null) {
                this.intentDataUriString = str;
                return this;
            }
            throw new NullPointerException("Null intentDataUriString");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder metadata1(String str) {
            if (str != null) {
                this.metadata1 = str;
                return this;
            }
            throw new NullPointerException("Null metadata1");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder metadata2(String str) {
            this.metadata2 = str;
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder
        public ContentItem.Builder title(String str) {
            if (str != null) {
                this.title = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("content_uri")
    public String contentUri() {
        return this.contentUri;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentItem)) {
            return false;
        }
        ContentItem contentItem = (ContentItem) obj;
        if (!this.contentUri.equals(contentItem.contentUri()) || !this.title.equals(contentItem.title()) || !this.metadata1.equals(contentItem.metadata1()) || ((str = this.metadata2) != null ? !str.equals(contentItem.metadata2()) : contentItem.metadata2() != null) || !this.imageUrl.equals(contentItem.imageUrl()) || !this.intentDataUriString.equals(contentItem.intentDataUriString())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.contentUri.hashCode() ^ 1000003) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.metadata1.hashCode()) * 1000003;
        String str = this.metadata2;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.intentDataUriString.hashCode();
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("image_url")
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("intent_uri")
    public String intentDataUriString() {
        return this.intentDataUriString;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("metadata1")
    public String metadata1() {
        return this.metadata1;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("metadata2")
    public String metadata2() {
        return this.metadata2;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContentItem{contentUri=");
        V0.append(this.contentUri);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", metadata1=");
        V0.append(this.metadata1);
        V0.append(", metadata2=");
        V0.append(this.metadata2);
        V0.append(", imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", intentDataUriString=");
        return je.I0(V0, this.intentDataUriString, "}");
    }

    private AutoValue_ContentItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.contentUri = str;
        this.title = str2;
        this.metadata1 = str3;
        this.metadata2 = str4;
        this.imageUrl = str5;
        this.intentDataUriString = str6;
    }
}
