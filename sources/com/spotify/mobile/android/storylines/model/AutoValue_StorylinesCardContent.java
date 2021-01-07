package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_StorylinesCardContent extends StorylinesCardContent {
    private final String artistName;
    private final String artistUri;
    private final String avatarUri;
    private final String entityUri;
    private final List<StorylinesCardImageModel> images;
    private final String storylineGid;
    private final String targetUri;

    AutoValue_StorylinesCardContent(String str, String str2, String str3, String str4, String str5, String str6, List<StorylinesCardImageModel> list) {
        if (str != null) {
            this.storylineGid = str;
            if (str2 != null) {
                this.artistUri = str2;
                if (str3 != null) {
                    this.artistName = str3;
                    if (str4 != null) {
                        this.avatarUri = str4;
                        if (str5 != null) {
                            this.entityUri = str5;
                            if (str6 != null) {
                                this.targetUri = str6;
                                if (list != null) {
                                    this.images = list;
                                    return;
                                }
                                throw new NullPointerException("Null images");
                            }
                            throw new NullPointerException("Null targetUri");
                        }
                        throw new NullPointerException("Null entityUri");
                    }
                    throw new NullPointerException("Null avatarUri");
                }
                throw new NullPointerException("Null artistName");
            }
            throw new NullPointerException("Null artistUri");
        }
        throw new NullPointerException("Null storylineGid");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StorylinesCardContent)) {
            return false;
        }
        StorylinesCardContent storylinesCardContent = (StorylinesCardContent) obj;
        if (!this.storylineGid.equals(storylinesCardContent.getStorylineGid()) || !this.artistUri.equals(storylinesCardContent.getArtistUri()) || !this.artistName.equals(storylinesCardContent.getArtistName()) || !this.avatarUri.equals(storylinesCardContent.getAvatarUri()) || !this.entityUri.equals(storylinesCardContent.getEntityUri()) || !this.targetUri.equals(storylinesCardContent.getTargetUri()) || !this.images.equals(storylinesCardContent.getImages())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("artistName")
    public String getArtistName() {
        return this.artistName;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("artistUri")
    public String getArtistUri() {
        return this.artistUri;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("avatarUri")
    public String getAvatarUri() {
        return this.avatarUri;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("entityUri")
    public String getEntityUri() {
        return this.entityUri;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("images")
    public List<StorylinesCardImageModel> getImages() {
        return this.images;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("storylineGid")
    public String getStorylineGid() {
        return this.storylineGid;
    }

    @Override // com.spotify.mobile.android.storylines.model.StorylinesCardContent
    @JsonProperty("targetUri")
    public String getTargetUri() {
        return this.targetUri;
    }

    public int hashCode() {
        return ((((((((((((this.storylineGid.hashCode() ^ 1000003) * 1000003) ^ this.artistUri.hashCode()) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.avatarUri.hashCode()) * 1000003) ^ this.entityUri.hashCode()) * 1000003) ^ this.targetUri.hashCode()) * 1000003) ^ this.images.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StorylinesCardContent{storylineGid=");
        V0.append(this.storylineGid);
        V0.append(", artistUri=");
        V0.append(this.artistUri);
        V0.append(", artistName=");
        V0.append(this.artistName);
        V0.append(", avatarUri=");
        V0.append(this.avatarUri);
        V0.append(", entityUri=");
        V0.append(this.entityUri);
        V0.append(", targetUri=");
        V0.append(this.targetUri);
        V0.append(", images=");
        return je.L0(V0, this.images, "}");
    }
}
