package com.spotify.music.libs.assistedcuration.model;

import com.spotify.playlist.models.PlayabilityRestriction;
import java.util.List;

final class AutoValue_ResponseTrack extends ResponseTrack {
    private final ResponseItem getAlbum;
    private final List<ResponseItem> getArtists;
    private final String getImage;
    private final String getName;
    private final String getPreviewId;
    private final String getUri;
    private final boolean isExplicit;
    private final boolean isNineteenPlusOnly;
    private final boolean isPlayable;
    private final PlayabilityRestriction playabilityRestriction;

    AutoValue_ResponseTrack(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, PlayabilityRestriction playabilityRestriction2, ResponseItem responseItem, List<ResponseItem> list) {
        if (str != null) {
            this.getUri = str;
            if (str2 != null) {
                this.getName = str2;
                if (str3 != null) {
                    this.getImage = str3;
                    if (str4 != null) {
                        this.getPreviewId = str4;
                        this.isNineteenPlusOnly = z;
                        this.isExplicit = z2;
                        this.isPlayable = z3;
                        if (playabilityRestriction2 != null) {
                            this.playabilityRestriction = playabilityRestriction2;
                            if (responseItem != null) {
                                this.getAlbum = responseItem;
                                if (list != null) {
                                    this.getArtists = list;
                                    return;
                                }
                                throw new NullPointerException("Null getArtists");
                            }
                            throw new NullPointerException("Null getAlbum");
                        }
                        throw new NullPointerException("Null playabilityRestriction");
                    }
                    throw new NullPointerException("Null getPreviewId");
                }
                throw new NullPointerException("Null getImage");
            }
            throw new NullPointerException("Null getName");
        }
        throw new NullPointerException("Null getUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseTrack)) {
            return false;
        }
        ResponseTrack responseTrack = (ResponseTrack) obj;
        if (!this.getUri.equals(responseTrack.getUri()) || !this.getName.equals(responseTrack.getName()) || !this.getImage.equals(responseTrack.getImage()) || !this.getPreviewId.equals(responseTrack.getPreviewId()) || this.isNineteenPlusOnly != responseTrack.isNineteenPlusOnly() || this.isExplicit != responseTrack.isExplicit() || this.isPlayable != responseTrack.isPlayable() || !this.playabilityRestriction.equals(responseTrack.playabilityRestriction()) || !this.getAlbum.equals(responseTrack.getAlbum()) || !this.getArtists.equals(responseTrack.getArtists())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public ResponseItem getAlbum() {
        return this.getAlbum;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public List<ResponseItem> getArtists() {
        return this.getArtists;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public String getImage() {
        return this.getImage;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public String getName() {
        return this.getName;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public String getPreviewId() {
        return this.getPreviewId;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public String getUri() {
        return this.getUri;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.getUri.hashCode() ^ 1000003) * 1000003) ^ this.getName.hashCode()) * 1000003) ^ this.getImage.hashCode()) * 1000003) ^ this.getPreviewId.hashCode()) * 1000003) ^ (this.isNineteenPlusOnly ? 1231 : 1237)) * 1000003) ^ (this.isExplicit ? 1231 : 1237)) * 1000003;
        if (!this.isPlayable) {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.playabilityRestriction.hashCode()) * 1000003) ^ this.getAlbum.hashCode()) * 1000003) ^ this.getArtists.hashCode();
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public boolean isNineteenPlusOnly() {
        return this.isNineteenPlusOnly;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public boolean isPlayable() {
        return this.isPlayable;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.ResponseTrack
    public PlayabilityRestriction playabilityRestriction() {
        return this.playabilityRestriction;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ResponseTrack{getUri=");
        V0.append(this.getUri);
        V0.append(", getName=");
        V0.append(this.getName);
        V0.append(", getImage=");
        V0.append(this.getImage);
        V0.append(", getPreviewId=");
        V0.append(this.getPreviewId);
        V0.append(", isNineteenPlusOnly=");
        V0.append(this.isNineteenPlusOnly);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", isPlayable=");
        V0.append(this.isPlayable);
        V0.append(", playabilityRestriction=");
        V0.append(this.playabilityRestriction);
        V0.append(", getAlbum=");
        V0.append(this.getAlbum);
        V0.append(", getArtists=");
        return je.L0(V0, this.getArtists, "}");
    }
}
