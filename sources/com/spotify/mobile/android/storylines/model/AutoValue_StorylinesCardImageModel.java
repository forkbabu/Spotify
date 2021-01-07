package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_StorylinesCardImageModel extends StorylinesCardImageModel {
    private final int height;
    private final String imageId;
    private final String type;
    private final String uri;
    private final int width;

    AutoValue_StorylinesCardImageModel(String str, String str2, int i, int i2, String str3) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.imageId = str2;
                this.width = i;
                this.height = i2;
                if (str3 != null) {
                    this.type = str3;
                    return;
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null imageId");
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StorylinesCardImageModel)) {
            return false;
        }
        StorylinesCardImageModel storylinesCardImageModel = (StorylinesCardImageModel) obj;
        if (!this.uri.equals(storylinesCardImageModel.getUri()) || !this.imageId.equals(storylinesCardImageModel.getImageId()) || this.width != storylinesCardImageModel.getWidth() || this.height != storylinesCardImageModel.getHeight() || !this.type.equals(storylinesCardImageModel.getType())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardImageModel
    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardImageModel
    @JsonProperty("imageId")
    public String getImageId() {
        return this.imageId;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardImageModel
    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardImageModel
    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardImageModel
    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.imageId.hashCode()) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ this.type.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StorylinesCardImageModel{uri=");
        V0.append(this.uri);
        V0.append(", imageId=");
        V0.append(this.imageId);
        V0.append(", width=");
        V0.append(this.width);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", type=");
        return je.I0(V0, this.type, "}");
    }
}
