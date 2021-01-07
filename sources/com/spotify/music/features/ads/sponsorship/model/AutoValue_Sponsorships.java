package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

final class AutoValue_Sponsorships extends Sponsorships {
    private final ArrayList<Sponsorship> sponsorships;

    AutoValue_Sponsorships(ArrayList<Sponsorship> arrayList) {
        this.sponsorships = arrayList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sponsorships)) {
            return false;
        }
        ArrayList<Sponsorship> arrayList = this.sponsorships;
        ArrayList<Sponsorship> sponsorships2 = ((Sponsorships) obj).sponsorships();
        if (arrayList != null) {
            return arrayList.equals(sponsorships2);
        }
        if (sponsorships2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        ArrayList<Sponsorship> arrayList = this.sponsorships;
        return (arrayList == null ? 0 : arrayList.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.Sponsorships
    @JsonProperty("sponsorships")
    public ArrayList<Sponsorship> sponsorships() {
        return this.sponsorships;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Sponsorships{sponsorships=");
        V0.append(this.sponsorships);
        V0.append("}");
        return V0.toString();
    }
}
