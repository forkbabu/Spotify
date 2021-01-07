package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotify.libs.facepile.c;

final class AutoValue_HomeMixUser extends C$AutoValue_HomeMixUser {
    private volatile transient c getFace;

    AutoValue_HomeMixUser(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3) {
        super(str, str2, str3, str4, str5, z, z2, str6, z3);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.HomeMixUser
    @JsonIgnore
    public c getFace() {
        if (this.getFace == null) {
            synchronized (this) {
                if (this.getFace == null) {
                    this.getFace = super.getFace();
                    if (this.getFace == null) {
                        throw new NullPointerException("getFace() cannot return null");
                    }
                }
            }
        }
        return this.getFace;
    }
}
