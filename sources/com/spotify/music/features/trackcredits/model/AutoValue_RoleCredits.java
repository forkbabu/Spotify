package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_RoleCredits extends RoleCredits {
    private final List<Artist> artists;
    private final String roleTitle;

    AutoValue_RoleCredits(String str, List<Artist> list) {
        if (str != null) {
            this.roleTitle = str;
            if (list != null) {
                this.artists = list;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null roleTitle");
    }

    @Override // com.spotify.music.features.trackcredits.model.RoleCredits
    public List<Artist> artists() {
        return this.artists;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoleCredits)) {
            return false;
        }
        RoleCredits roleCredits = (RoleCredits) obj;
        if (!this.roleTitle.equals(roleCredits.roleTitle()) || !this.artists.equals(roleCredits.artists())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.roleTitle.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode();
    }

    @Override // com.spotify.music.features.trackcredits.model.RoleCredits
    public String roleTitle() {
        return this.roleTitle;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RoleCredits{roleTitle=");
        V0.append(this.roleTitle);
        V0.append(", artists=");
        return je.L0(V0, this.artists, "}");
    }
}
