package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.playlistentity.homemix.models.$AutoValue_HomeMixUser  reason: invalid class name */
abstract class C$AutoValue_HomeMixUser extends HomeMixUser {
    private final String getColor;
    private final String getImageUrl;
    private final String getInitials;
    private final String getLargeImageUrl;
    private final String getShortName;
    private final String getUsername;
    private final boolean isEnabled;
    private final boolean isPresent;
    private final boolean needsTasteOnboarding;

    C$AutoValue_HomeMixUser(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3) {
        if (str != null) {
            this.getUsername = str;
            this.getShortName = str2;
            this.getImageUrl = str3;
            this.getLargeImageUrl = str4;
            if (str5 != null) {
                this.getInitials = str5;
                this.isEnabled = z;
                this.isPresent = z2;
                if (str6 != null) {
                    this.getColor = str6;
                    this.needsTasteOnboarding = z3;
                    return;
                }
                throw new NullPointerException("Null getColor");
            }
            throw new NullPointerException("Null getInitials");
        }
        throw new NullPointerException("Null getUsername");
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeMixUser)) {
            return false;
        }
        HomeMixUser homeMixUser = (HomeMixUser) obj;
        if (!this.getUsername.equals(homeMixUser.getUsername()) || ((str = this.getShortName) != null ? !str.equals(homeMixUser.getShortName()) : homeMixUser.getShortName() != null) || ((str2 = this.getImageUrl) != null ? !str2.equals(homeMixUser.getImageUrl()) : homeMixUser.getImageUrl() != null) || ((str3 = this.getLargeImageUrl) != null ? !str3.equals(homeMixUser.getLargeImageUrl()) : homeMixUser.getLargeImageUrl() != null) || !this.getInitials.equals(homeMixUser.getInitials()) || this.isEnabled != homeMixUser.isEnabled() || this.isPresent != homeMixUser.isPresent() || !this.getColor.equals(homeMixUser.getColor()) || this.needsTasteOnboarding != homeMixUser.needsTasteOnboarding()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("color")
    public String getColor() {
        return this.getColor;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("image_url")
    public String getImageUrl() {
        return this.getImageUrl;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("initials")
    public String getInitials() {
        return this.getInitials;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("large_image_url")
    public String getLargeImageUrl() {
        return this.getLargeImageUrl;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("short_name")
    public String getShortName() {
        return this.getShortName;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("username")
    public String getUsername() {
        return this.getUsername;
    }

    public int hashCode() {
        int hashCode = (this.getUsername.hashCode() ^ 1000003) * 1000003;
        String str = this.getShortName;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.getImageUrl;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.getLargeImageUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ i) * 1000003) ^ this.getInitials.hashCode()) * 1000003;
        int i2 = 1231;
        int hashCode5 = (((((hashCode4 ^ (this.isEnabled ? 1231 : 1237)) * 1000003) ^ (this.isPresent ? 1231 : 1237)) * 1000003) ^ this.getColor.hashCode()) * 1000003;
        if (!this.needsTasteOnboarding) {
            i2 = 1237;
        }
        return hashCode5 ^ i2;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("enabled")
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("present")
    public boolean isPresent() {
        return this.isPresent;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonProperty("needs_taste_onboarding")
    public boolean needsTasteOnboarding() {
        return this.needsTasteOnboarding;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixUser{getUsername=");
        V0.append(this.getUsername);
        V0.append(", getShortName=");
        V0.append(this.getShortName);
        V0.append(", getImageUrl=");
        V0.append(this.getImageUrl);
        V0.append(", getLargeImageUrl=");
        V0.append(this.getLargeImageUrl);
        V0.append(", getInitials=");
        V0.append(this.getInitials);
        V0.append(", isEnabled=");
        V0.append(this.isEnabled);
        V0.append(", isPresent=");
        V0.append(this.isPresent);
        V0.append(", getColor=");
        V0.append(this.getColor);
        V0.append(", needsTasteOnboarding=");
        return je.P0(V0, this.needsTasteOnboarding, "}");
    }
}
