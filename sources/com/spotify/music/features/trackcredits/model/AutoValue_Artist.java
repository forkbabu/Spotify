package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_Artist extends Artist {
    private final String externalUrl;
    private final String name;
    private final List<String> subroles;
    private final String uri;
    private final double weight;

    AutoValue_Artist(String str, String str2, List<String> list, double d, String str3) {
        this.uri = str;
        this.name = str2;
        if (list != null) {
            this.subroles = list;
            this.weight = d;
            this.externalUrl = str3;
            return;
        }
        throw new NullPointerException("Null subroles");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        String str = this.uri;
        if (str != null ? str.equals(artist.uri()) : artist.uri() == null) {
            String str2 = this.name;
            if (str2 != null ? str2.equals(artist.name()) : artist.name() == null) {
                if (this.subroles.equals(artist.subroles()) && Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(artist.weight())) {
                    String str3 = this.externalUrl;
                    if (str3 == null) {
                        if (artist.externalUrl() == null) {
                            return true;
                        }
                    } else if (str3.equals(artist.externalUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.trackcredits.model.Artist
    public String externalUrl() {
        return this.externalUrl;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.name;
        int hashCode2 = (((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.subroles.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.weight) >>> 32) ^ Double.doubleToLongBits(this.weight)))) * 1000003;
        String str3 = this.externalUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.music.features.trackcredits.model.Artist
    public String name() {
        return this.name;
    }

    @Override // com.spotify.music.features.trackcredits.model.Artist
    public List<String> subroles() {
        return this.subroles;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Artist{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", subroles=");
        V0.append(this.subroles);
        V0.append(", weight=");
        V0.append(this.weight);
        V0.append(", externalUrl=");
        return je.I0(V0, this.externalUrl, "}");
    }

    @Override // com.spotify.music.features.trackcredits.model.Artist
    public String uri() {
        return this.uri;
    }

    @Override // com.spotify.music.features.trackcredits.model.Artist
    public double weight() {
        return this.weight;
    }
}
