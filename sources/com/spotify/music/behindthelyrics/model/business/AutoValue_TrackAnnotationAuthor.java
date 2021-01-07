package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_TrackAnnotationAuthor extends TrackAnnotationAuthor {
    private final String avatarUrl;
    private final String displayName;
    private final String spotifyId;
    private final boolean verified;

    AutoValue_TrackAnnotationAuthor(boolean z, String str, String str2, String str3) {
        this.verified = z;
        this.spotifyId = str;
        this.displayName = str2;
        this.avatarUrl = str3;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackAnnotationAuthor)) {
            return false;
        }
        TrackAnnotationAuthor trackAnnotationAuthor = (TrackAnnotationAuthor) obj;
        if (this.verified == trackAnnotationAuthor.isVerified() && ((str = this.spotifyId) != null ? str.equals(trackAnnotationAuthor.getSpotifyId()) : trackAnnotationAuthor.getSpotifyId() == null) && ((str2 = this.displayName) != null ? str2.equals(trackAnnotationAuthor.getDisplayName()) : trackAnnotationAuthor.getDisplayName() == null)) {
            String str3 = this.avatarUrl;
            if (str3 == null) {
                if (trackAnnotationAuthor.getAvatarUrl() == null) {
                    return true;
                }
            } else if (str3.equals(trackAnnotationAuthor.getAvatarUrl())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor
    @JsonProperty("avatarURL")
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor
    @JsonProperty("displayName")
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor
    @JsonProperty("spotifyId")
    public String getSpotifyId() {
        return this.spotifyId;
    }

    public int hashCode() {
        int i = ((this.verified ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.spotifyId;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.displayName;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.avatarUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 ^ i2;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor
    @JsonProperty("verified")
    public boolean isVerified() {
        return this.verified;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackAnnotationAuthor{verified=");
        V0.append(this.verified);
        V0.append(", spotifyId=");
        V0.append(this.spotifyId);
        V0.append(", displayName=");
        V0.append(this.displayName);
        V0.append(", avatarUrl=");
        return je.I0(V0, this.avatarUrl, "}");
    }
}
