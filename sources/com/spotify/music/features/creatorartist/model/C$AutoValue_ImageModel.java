package com.spotify.music.features.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.creatorartist.model.$AutoValue_ImageModel  reason: invalid class name */
abstract class C$AutoValue_ImageModel extends ImageModel {
    private final int height;
    private final String moderationUri;
    private final String uri;
    private final int width;

    C$AutoValue_ImageModel(String str, int i, int i2, String str2) {
        if (str != null) {
            this.uri = str;
            this.width = i;
            this.height = i2;
            this.moderationUri = str2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageModel)) {
            return false;
        }
        ImageModel imageModel = (ImageModel) obj;
        if (this.uri.equals(imageModel.getUri()) && this.width == imageModel.getWidth() && this.height == imageModel.getHeight()) {
            String str = this.moderationUri;
            if (str == null) {
                if (imageModel.getModerationUri() == null) {
                    return true;
                }
            } else if (str.equals(imageModel.getModerationUri())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.creatorartist.model.ImageModel
    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @Override // com.spotify.music.features.creatorartist.model.ImageModel
    @JsonProperty("moderationUri")
    public String getModerationUri() {
        return this.moderationUri;
    }

    @Override // com.spotify.music.features.creatorartist.model.ImageModel
    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    @Override // com.spotify.music.features.creatorartist.model.ImageModel
    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003;
        String str = this.moderationUri;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ImageModel{uri=");
        V0.append(this.uri);
        V0.append(", width=");
        V0.append(this.width);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", moderationUri=");
        return je.I0(V0, this.moderationUri, "}");
    }
}
