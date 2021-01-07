package com.spotify.music.features.ads.audioplus.topbanner.carousel.datasource;

import com.spotify.music.features.ads.model.Ad;
import java.util.List;

final class AutoValue_CarouselAds extends CarouselAds {
    private final List<Ad> ads;

    AutoValue_CarouselAds(List<Ad> list) {
        if (list != null) {
            this.ads = list;
            return;
        }
        throw new NullPointerException("Null ads");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselAds) {
            return this.ads.equals(((CarouselAds) obj).getAds());
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.audioplus.topbanner.carousel.datasource.CarouselAds
    public List<Ad> getAds() {
        return this.ads;
    }

    public int hashCode() {
        return this.ads.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("CarouselAds{ads="), this.ads, "}");
    }
}
