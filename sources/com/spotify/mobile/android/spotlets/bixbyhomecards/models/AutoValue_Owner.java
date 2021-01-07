package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.Owner;

final class AutoValue_Owner extends Owner {
    private final String displayName;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Owner.Builder {
        private String displayName;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Owner.Builder
        public Owner build() {
            String str = this.displayName == null ? " displayName" : "";
            if (str.isEmpty()) {
                return new AutoValue_Owner(this.displayName);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Owner.Builder
        public Owner.Builder displayName(String str) {
            if (str != null) {
                this.displayName = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Owner
    @JsonProperty("display_name")
    public String displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Owner) {
            return this.displayName.equals(((Owner) obj).displayName());
        }
        return false;
    }

    public int hashCode() {
        return this.displayName.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("Owner{displayName="), this.displayName, "}");
    }

    private AutoValue_Owner(String str) {
        this.displayName = str;
    }
}
