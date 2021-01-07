package com.spotify.music.features.secondaryintent.datasource;

import com.spotify.music.features.ads.model.Ad;
import java.util.List;

final class AutoValue_SavedAds extends SavedAds {
    private final List<Ad> ads;

    AutoValue_SavedAds(List<Ad> list) {
        this.ads = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavedAds)) {
            return false;
        }
        List<Ad> list = this.ads;
        List<Ad> ads2 = ((SavedAds) obj).getAds();
        if (list != null) {
            return list.equals(ads2);
        }
        if (ads2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.secondaryintent.datasource.SavedAds
    public List<Ad> getAds() {
        return this.ads;
    }

    public int hashCode() {
        List<Ad> list = this.ads;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("SavedAds{ads="), this.ads, "}");
    }
}
