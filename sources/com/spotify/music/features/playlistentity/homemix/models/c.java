package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class c extends h {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final List<f> e;

    c(String str, String str2, int i, int i2, List<f> list) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                this.d = i2;
                if (list != null) {
                    this.e = list;
                    return;
                }
                throw new NullPointerException("Null affinityUsers");
            }
            throw new NullPointerException("Null color");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.h
    @JsonProperty("ranked_users")
    public List<f> affinityUsers() {
        return this.e;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.h
    @JsonProperty("color")
    public String color() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.name()) || !this.b.equals(hVar.color()) || this.c != hVar.nTracks() || this.d != hVar.score() || !this.e.equals(hVar.affinityUsers())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.h
    @JsonProperty("ntracks")
    public int nTracks() {
        return this.c;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.h
    @JsonProperty("name")
    public String name() {
        return this.a;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.h
    @JsonProperty("score")
    public int score() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixTaste{name=");
        V0.append(this.a);
        V0.append(", color=");
        V0.append(this.b);
        V0.append(", nTracks=");
        V0.append(this.c);
        V0.append(", score=");
        V0.append(this.d);
        V0.append(", affinityUsers=");
        return je.L0(V0, this.e, "}");
    }
}
