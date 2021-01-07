package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_CreateRadioStationModel extends CreateRadioStationModel {
    private final String imageUri;
    private final List<String> seeds;
    private final String title;

    AutoValue_CreateRadioStationModel(List<String> list, String str, String str2) {
        if (list != null) {
            this.seeds = list;
            this.title = str;
            this.imageUri = str2;
            return;
        }
        throw new NullPointerException("Null seeds");
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateRadioStationModel)) {
            return false;
        }
        CreateRadioStationModel createRadioStationModel = (CreateRadioStationModel) obj;
        if (this.seeds.equals(createRadioStationModel.seeds()) && ((str = this.title) != null ? str.equals(createRadioStationModel.title()) : createRadioStationModel.title() == null)) {
            String str2 = this.imageUri;
            if (str2 == null) {
                if (createRadioStationModel.imageUri() == null) {
                    return true;
                }
            } else if (str2.equals(createRadioStationModel.imageUri())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.seeds.hashCode() ^ 1000003) * 1000003;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.imageUri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.music.spotlets.radio.model.CreateRadioStationModel
    @JsonProperty("imageUri")
    public String imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.music.spotlets.radio.model.CreateRadioStationModel
    @JsonProperty
    public List<String> seeds() {
        return this.seeds;
    }

    @Override // com.spotify.music.spotlets.radio.model.CreateRadioStationModel
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CreateRadioStationModel{seeds=");
        V0.append(this.seeds);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", imageUri=");
        return je.I0(V0, this.imageUri, "}");
    }
}
