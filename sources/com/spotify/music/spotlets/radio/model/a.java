package com.spotify.music.spotlets.radio.model;

import java.util.List;

abstract class a extends c {
    private final List<RadioStationModel> a;

    a(List<RadioStationModel> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null savedStations");
    }

    @Override // com.spotify.music.spotlets.radio.model.c
    public List<RadioStationModel> b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).b());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("SavedStationsModel{savedStations="), this.a, "}");
    }
}
