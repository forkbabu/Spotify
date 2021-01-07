package com.spotify.music.features.tasteonboarding.artistpicker.model;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistpicker.model.$AutoValue_RelatedArtistsResponse  reason: invalid class name */
abstract class C$AutoValue_RelatedArtistsResponse extends RelatedArtistsResponse {
    private final List<TasteOnboardingItem> relatedArtists;

    C$AutoValue_RelatedArtistsResponse(List<TasteOnboardingItem> list) {
        if (list != null) {
            this.relatedArtists = list;
            return;
        }
        throw new NullPointerException("Null relatedArtists");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RelatedArtistsResponse) {
            return this.relatedArtists.equals(((RelatedArtistsResponse) obj).relatedArtists());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.relatedArtists.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse
    public List<TasteOnboardingItem> relatedArtists() {
        return this.relatedArtists;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("RelatedArtistsResponse{relatedArtists="), this.relatedArtists, "}");
    }
}
