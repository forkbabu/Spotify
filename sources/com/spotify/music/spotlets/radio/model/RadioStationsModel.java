package com.spotify.music.spotlets.radio.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = RadioStationsModel_Deserializer.class)
public abstract class RadioStationsModel implements JacksonModel, Parcelable {

    /* access modifiers changed from: package-private */
    public static class a extends apd<RadioStationModel> {
        protected a() {
            super(RadioStationModel.CREATOR);
        }
    }

    @JsonCreator
    public static RadioStationsModel create(@JsonProperty("user_stations") RadioStationModel[] radioStationModelArr, @JsonProperty("recommended_stations") RadioStationModel[] radioStationModelArr2, @JsonProperty("genre_stations") RadioStationModel[] radioStationModelArr3, @JsonProperty("saved_stations") RadioStationModel[] radioStationModelArr4) {
        return create(Arrays.asList(safeArray(radioStationModelArr)), Arrays.asList(safeArray(radioStationModelArr2)), Arrays.asList(safeArray(radioStationModelArr3)), Arrays.asList(safeArray(radioStationModelArr4)));
    }

    private static RadioStationModel[] safeArray(RadioStationModel[] radioStationModelArr) {
        return radioStationModelArr == null ? new RadioStationModel[0] : radioStationModelArr;
    }

    @JsonProperty("genre_stations")
    public abstract List<RadioStationModel> genreStations();

    @JsonProperty("recommended_stations")
    public abstract List<RadioStationModel> recommendedStations();

    @JsonProperty("saved_stations")
    public abstract List<RadioStationModel> savedStations();

    @JsonProperty("user_stations")
    public abstract List<RadioStationModel> userStations();

    public static RadioStationsModel create(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4) {
        return new AutoValue_RadioStationsModel(list, list2, list3, list4);
    }
}
