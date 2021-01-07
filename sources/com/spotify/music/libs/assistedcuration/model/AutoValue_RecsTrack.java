package com.spotify.music.libs.assistedcuration.model;

import java.util.List;

final class AutoValue_RecsTrack extends RecsTrack {
    private final RecsItem album;
    private final List<RecsItem> artists;
    private final String imageUri;
    private final boolean is19PlusOnly;
    private final boolean isExplicit;
    private final String name;
    private final String previewId;
    private final String uri;

    AutoValue_RecsTrack(String str, String str2, String str3, String str4, RecsItem recsItem, List<RecsItem> list, boolean z, boolean z2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (str3 != null) {
                    this.previewId = str3;
                    this.imageUri = str4;
                    this.album = recsItem;
                    if (list != null) {
                        this.artists = list;
                        this.isExplicit = z;
                        this.is19PlusOnly = z2;
                        return;
                    }
                    throw new NullPointerException("Null artists");
                }
                throw new NullPointerException("Null previewId");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public RecsItem album() {
        return this.album;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public List<RecsItem> artists() {
        return this.artists;
    }

    public boolean equals(Object obj) {
        String str;
        RecsItem recsItem;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecsTrack)) {
            return false;
        }
        RecsTrack recsTrack = (RecsTrack) obj;
        if (!this.uri.equals(recsTrack.uri()) || !this.name.equals(recsTrack.name()) || !this.previewId.equals(recsTrack.previewId()) || ((str = this.imageUri) != null ? !str.equals(recsTrack.imageUri()) : recsTrack.imageUri() != null) || ((recsItem = this.album) != null ? !recsItem.equals(recsTrack.album()) : recsTrack.album() != null) || !this.artists.equals(recsTrack.artists()) || this.isExplicit != recsTrack.isExplicit() || this.is19PlusOnly != recsTrack.is19PlusOnly()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.previewId.hashCode()) * 1000003;
        String str = this.imageUri;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        RecsItem recsItem = this.album;
        if (recsItem != null) {
            i = recsItem.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ i) * 1000003) ^ this.artists.hashCode()) * 1000003;
        int i2 = 1231;
        int i3 = (hashCode3 ^ (this.isExplicit ? 1231 : 1237)) * 1000003;
        if (!this.is19PlusOnly) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public String imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public boolean is19PlusOnly() {
        return this.is19PlusOnly;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public String name() {
        return this.name;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public String previewId() {
        return this.previewId;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecsTrack{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", previewId=");
        V0.append(this.previewId);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", album=");
        V0.append(this.album);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", is19PlusOnly=");
        return je.P0(V0, this.is19PlusOnly, "}");
    }

    @Override // com.spotify.music.libs.assistedcuration.model.RecsTrack
    public String uri() {
        return this.uri;
    }
}
