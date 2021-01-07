package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RadioStationsModel extends C$AutoValue_RadioStationsModel {
    public static final Parcelable.Creator<AutoValue_RadioStationsModel> CREATOR = new a();
    private static final RadioStationsModel.a STATION_LIST_ADAPTER = new RadioStationsModel.a();

    static class a implements Parcelable.Creator<AutoValue_RadioStationsModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioStationsModel createFromParcel(Parcel parcel) {
            return new AutoValue_RadioStationsModel(AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel), AutoValue_RadioStationsModel.STATION_LIST_ADAPTER.a(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioStationsModel[] newArray(int i) {
            return new AutoValue_RadioStationsModel[i];
        }
    }

    AutoValue_RadioStationsModel(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4) {
        super(list, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        RadioStationsModel.a aVar = STATION_LIST_ADAPTER;
        List<RadioStationModel> userStations = userStations();
        aVar.getClass();
        parcel.writeTypedList(userStations);
        List<RadioStationModel> recommendedStations = recommendedStations();
        aVar.getClass();
        parcel.writeTypedList(recommendedStations);
        List<RadioStationModel> genreStations = genreStations();
        aVar.getClass();
        parcel.writeTypedList(genreStations);
        List<RadioStationModel> savedStations = savedStations();
        aVar.getClass();
        parcel.writeTypedList(savedStations);
    }
}
