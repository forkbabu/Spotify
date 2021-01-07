package com.spotify.music.libs.assistedcuration.model;

import java.util.List;

final class AutoValue_RecsContentRating extends RecsContentRating {
    private final String country;
    private final List<String> tags;

    AutoValue_RecsContentRating(String str, List<String> list) {
        if (str != null) {
            this.country = str;
            if (list != null) {
                this.tags = list;
                return;
            }
            throw new NullPointerException("Null tags");
        }
        throw new NullPointerException("Null country");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.assistedcuration.model.RecsContentRating
    public String country() {
        return this.country;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecsContentRating)) {
            return false;
        }
        RecsContentRating recsContentRating = (RecsContentRating) obj;
        if (!this.country.equals(recsContentRating.country()) || !this.tags.equals(recsContentRating.tags())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.country.hashCode() ^ 1000003) * 1000003) ^ this.tags.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.assistedcuration.model.RecsContentRating
    public List<String> tags() {
        return this.tags;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecsContentRating{country=");
        V0.append(this.country);
        V0.append(", tags=");
        return je.L0(V0, this.tags, "}");
    }
}
