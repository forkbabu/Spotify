package com.spotify.music.features.tasteonboarding.artistsearch.model;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistsearch.model.$AutoValue_ArtistSearchResponse  reason: invalid class name */
abstract class C$AutoValue_ArtistSearchResponse extends ArtistSearchResponse {
    private final String nextPage;
    private final List<TasteOnboardingItem> results;

    C$AutoValue_ArtistSearchResponse(List<TasteOnboardingItem> list, String str) {
        if (list != null) {
            this.results = list;
            this.nextPage = str;
            return;
        }
        throw new NullPointerException("Null results");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArtistSearchResponse)) {
            return false;
        }
        ArtistSearchResponse artistSearchResponse = (ArtistSearchResponse) obj;
        if (this.results.equals(artistSearchResponse.results())) {
            String str = this.nextPage;
            if (str == null) {
                if (artistSearchResponse.nextPage() == null) {
                    return true;
                }
            } else if (str.equals(artistSearchResponse.nextPage())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.results.hashCode() ^ 1000003) * 1000003;
        String str = this.nextPage;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse
    public String nextPage() {
        return this.nextPage;
    }

    @Override // com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse
    public List<TasteOnboardingItem> results() {
        return this.results;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ArtistSearchResponse{results=");
        V0.append(this.results);
        V0.append(", nextPage=");
        return je.I0(V0, this.nextPage, "}");
    }
}
