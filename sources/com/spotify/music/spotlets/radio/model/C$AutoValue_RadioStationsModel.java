package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_RadioStationsModel  reason: invalid class name */
abstract class C$AutoValue_RadioStationsModel extends RadioStationsModel {
    private final List<RadioStationModel> genreStations;
    private final List<RadioStationModel> recommendedStations;
    private final List<RadioStationModel> savedStations;
    private final List<RadioStationModel> userStations;

    C$AutoValue_RadioStationsModel(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4) {
        if (list != null) {
            this.userStations = list;
            if (list2 != null) {
                this.recommendedStations = list2;
                if (list3 != null) {
                    this.genreStations = list3;
                    if (list4 != null) {
                        this.savedStations = list4;
                        return;
                    }
                    throw new NullPointerException("Null savedStations");
                }
                throw new NullPointerException("Null genreStations");
            }
            throw new NullPointerException("Null recommendedStations");
        }
        throw new NullPointerException("Null userStations");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RadioStationsModel)) {
            return false;
        }
        RadioStationsModel radioStationsModel = (RadioStationsModel) obj;
        if (!this.userStations.equals(radioStationsModel.userStations()) || !this.recommendedStations.equals(radioStationsModel.recommendedStations()) || !this.genreStations.equals(radioStationsModel.genreStations()) || !this.savedStations.equals(radioStationsModel.savedStations())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationsModel
    @JsonProperty("genre_stations")
    public List<RadioStationModel> genreStations() {
        return this.genreStations;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.userStations.hashCode() ^ 1000003) * 1000003) ^ this.recommendedStations.hashCode()) * 1000003) ^ this.genreStations.hashCode()) * 1000003) ^ this.savedStations.hashCode();
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationsModel
    @JsonProperty("recommended_stations")
    public List<RadioStationModel> recommendedStations() {
        return this.recommendedStations;
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationsModel
    @JsonProperty("saved_stations")
    public List<RadioStationModel> savedStations() {
        return this.savedStations;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RadioStationsModel{userStations=");
        V0.append(this.userStations);
        V0.append(", recommendedStations=");
        V0.append(this.recommendedStations);
        V0.append(", genreStations=");
        V0.append(this.genreStations);
        V0.append(", savedStations=");
        return je.L0(V0, this.savedStations, "}");
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationsModel
    @JsonProperty("user_stations")
    public List<RadioStationModel> userStations() {
        return this.userStations;
    }
}
